package Controller;

import Model.Database;
import Model.Transfer;
import View.dataTransfer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class MainControllerTransfer implements ActionListener {

    private dataTransfer transfer;
    Database db;

    public MainControllerTransfer() {
        transfer = new dataTransfer();
        transfer.setVisible(true);
        db = new Database();
        transfer.setValueCombo();
        transfer.addActionListener2(this);
        transfer.addActionListener(this);
        transfer.dataBelum();
        refreshListTransfer();
        transfer.setDataTransfer(transfer.listTransfer);
    }

    public void refreshListTransfer() {
        try {
            ResultSet rs = db.getData("select * from transfer");
            transfer.listTransfer.removeAll(transfer.listTransfer);
            while (rs.next()) {
                Transfer n = new Transfer(
                        rs.getString("noRekPengirim"), rs.getString("noRekTujuan"), rs.getDouble("jumlahUang"), rs.getString("tglTransfer"));
                transfer.listTransfer.add(n);
            }

        } catch (Exception e) {
            System.out.println("Error refresh" + e.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        try {
            if (source.equals(transfer.btnAdd())) {
                String str = "insert into transfer (noRekPengirim, noRekTujuan, jumlahUang, tgltransfer) "
                        + "values('"
                        + transfer.noRekPengirim() + "','" + transfer.noRekPenerima() + "','" + transfer.jmlUang() + "','" + transfer.tgl() + "')";
                db.query(str);
                String str2 = "update nasabah set saldoNasabah = (saldoNasabah - 5000) -  " + transfer.jmlUang() + ""
                        + " where noRek = '" + transfer.noRekPengirim() + "'";
                db.query(str2);
                String str3 = "update nasabah set saldoNasabah = saldoNasabah + " + transfer.jmlUang() + ""
                        + " where noRek = '" + transfer.noRekPenerima() + "'";
                db.query(str3);
                transfer.dataMasuk();
            } else if (source.equals(transfer.btnHapus())) {
                String str = "truncate table transfer";
                db.query(str);
                new MainControllerTransfer();
            }
            refreshListTransfer();
            transfer.setDataTransfer(transfer.listTransfer);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
