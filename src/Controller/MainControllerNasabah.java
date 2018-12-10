package Controller;

import Model.Database;
import Model.Nasabah;
import View.MenuAwal;
import View.data_nasabah;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class MainControllerNasabah implements ActionListener {
    private data_nasabah dtNasabah;
    private MenuAwal menu;
    Database db;

    public MainControllerNasabah() {
        menu = new MenuAwal();
        dtNasabah = new data_nasabah();
        dtNasabah.setVisible(true);
        dtNasabah.nasabahBelumTertambah();
        dtNasabah.editBelumBerhasil();
        db = new Database();
        dtNasabah.addActionListener(this);
        dtNasabah.addActionListener2(this);
        dtNasabah.addActionListener3(this);
        dtNasabah.setValueEdit();
        refreshListNasabah();
        dtNasabah.setDataNasabah(dtNasabah.listNasabah);
    }

    public void refreshListNasabah() {
        try {
            ResultSet rs = db.getData("select * from nasabah");
            dtNasabah.listNasabah.removeAll(dtNasabah.listNasabah);
            while (rs.next()) {
                Nasabah n = new Nasabah(
                        rs.getString("namaNasabah"), rs.getString("sexNasabah"), rs.getString("noKtpNasabah"), rs.getString("noHpNasabah"), rs.getDouble("saldoNasabah"), rs.getString("noRek"));
                dtNasabah.listNasabah.add(n);
            }

        } catch (Exception e) {
            System.out.println("Error refresh" + e.getMessage());
        }
    }

    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        try {
            if (source.equals(dtNasabah.btnAdd())) {
                String str = "insert into nasabah (namaNasabah, sexNasabah, noKtpNasabah, noHpNasabah, saldoNasabah, noRek) "
                        + "values('"
                        + dtNasabah.nama() + "','" + dtNasabah.sex() + "','" + dtNasabah.noKtp() + "','" + dtNasabah.noHp() + "','" + dtNasabah.saldo() + "','1" + dtNasabah.noRek() + "')";
                db.query(str);
                dtNasabah.nasabahTertambah();
            } else if (source.equals(dtNasabah.btnDel())) {
                String str = "delete from nasabah where noRek = '"+dtNasabah.noRekHapus()+"'";
                db.query(str);
                String str2 = "delete from transfer where noRekPengirim ='"+dtNasabah.noRekHapus()+"' or noRekTujuan = '"+dtNasabah.noRekHapus()+"'";
                db.query(str2);
                String str3 = "delete from penarikan where noRekPenarikan ='"+dtNasabah.noRekHapus()+"'";
                db.query(str3);
                String str4 = "delete from pemasukan where noRekPemasukan ='"+dtNasabah.noRekHapus()+"'";
                db.query(str4);
                new MainControllerNasabah();
            } else if(source.equals(dtNasabah.btnEdit())) {
                String str = "update nasabah set noHpNasabah = '"+dtNasabah.noHpEdit()+"' where noRek = '"+dtNasabah.noRekEdit()+"'";
                db.query(str);
                dtNasabah.editBerhasil();
            }
            refreshListNasabah();
            dtNasabah.setDataNasabah(dtNasabah.listNasabah);
            dtNasabah.setValueEdit();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
