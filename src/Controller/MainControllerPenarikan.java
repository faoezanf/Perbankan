package Controller;

import Model.Database;
import Model.Penarikan;
import View.dataPenarikan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class MainControllerPenarikan implements ActionListener {

    Database db;
    private dataPenarikan penarikan;

    public MainControllerPenarikan() {
        penarikan = new dataPenarikan();
        penarikan.setVisible(true);
        db = new Database();
        penarikan.setValueEdit();
        penarikan.dataBelum();
        penarikan.addActionListener2(this);
        penarikan.addActionListener(this);
        refreshListPenarikan();
        penarikan.setDataPenarikan(penarikan.listPenarikan);
    }

    public void refreshListPenarikan() {
        try {
            ResultSet rs = db.getData("select * from penarikan");
            penarikan.listPenarikan.removeAll(penarikan.listPenarikan);
            while (rs.next()) {
                Penarikan n = new Penarikan(
                        rs.getString("noRekPenarikan"), rs.getDouble("jumlahUangPenarikan"), rs.getString("tglPenarikan"));
                penarikan.listPenarikan.add(n);
            }

        } catch (Exception e) {
            System.out.println("Error refresh" + e.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        try {
            if (source.equals(penarikan.btnAdd())) {
                String str = "insert into penarikan (noRekPenarikan, jumlahUangPenarikan, tglPenarikan) "
                        + "values('"
                        + penarikan.noRek() + "','" + penarikan.jmlUang() + "','" + penarikan.tgl() + "')";
                db.query(str);
                String str2 = "update nasabah set saldoNasabah = saldoNasabah - " + penarikan.jmlUang() + ""
                        + " where noRek = '" + penarikan.noRek() + "'";
                db.query(str2);
                penarikan.dataMasuk();
            } else if (source.equals(penarikan.btnHapus())) {
                String str = "truncate table penarikan";
                db.query(str);
                new MainControllerPenarikan();
            }
            refreshListPenarikan();
            penarikan.setDataPenarikan(penarikan.listPenarikan);
            penarikan.setValueEdit();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
