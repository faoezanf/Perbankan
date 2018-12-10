package Controller;

import Model.*;
import View.*;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class MainControllerPemasukan implements ActionListener {

    private View.Pemasukan view;
    Database db;
    public static String nomor,nama,jumlah;
    public ResultSet name;

    public MainControllerPemasukan() {
        view = new View.Pemasukan();
        view.setVisible(true);
        db = new Database();
        view.addActionListener(this);
        view.setValueEdit();

        view.getBtnNasabah().setFocusPainted(false);
        view.getBtnNasabah().setMargin(new Insets(0, 0, 0, 0));
        view.getBtnNasabah().setContentAreaFilled(false);
        view.getBtnNasabah().setBorderPainted(false);
        view.getBtnNasabah().setOpaque(false);
        
        view.getBtnHome().setFocusPainted(false);
        view.getBtnHome().setMargin(new Insets(0, 0, 0, 0));
        view.getBtnHome().setContentAreaFilled(false);
        view.getBtnHome().setBorderPainted(false);
        view.getBtnHome().setOpaque(false);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        try {
            if (source.equals(view.getBtnAdd())) {
                String str = "insert into pemasukan (noRekPemasukan, jumlahUang, tglPemasukan) "
                        + "values('"
                        + view.noRek() + "','" + view.jmlUang() + "',NOW())";
                db.query(str);
                String str2 = "update nasabah set saldoNasabah = saldoNasabah + " + view.jmlUang() + ""
                        + " where noRek = '" + view.noRek() + "'";
                int count = db.querySuccess2(str2);
                String str3 = "select namaNasabah from nasabah where noRek ='"+view.noRek()+"'";
                name = db.getData(str3);
                name.next();
                if(count!=0) {
                    view.setVisible(false);
                    nomor = view.noRek();
                    jumlah = view.getJmlPemasukan().getText();
                    nama= name.getString("namaNasabah");
                    JOptionPane.showMessageDialog(null, "Transaksi setor saldo berhasil dilakukan.");
                    new MainControllerPemasukanC();  
                } else {
                    JOptionPane.showMessageDialog(null, "Maaf, terjadi kesalahan, silahkan ulangi kembali.");
                }
            } 
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
