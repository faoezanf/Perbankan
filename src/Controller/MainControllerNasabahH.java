/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import View.*;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class MainControllerNasabahH implements ActionListener{
    private NasabahH view;
    private Database db;
    
    public MainControllerNasabahH() {
        view = new NasabahH();
        db = new Database();
        view.getBtnTransaksi().setFocusPainted(false);
        view.getBtnTransaksi().setMargin(new Insets(0, 0, 0, 0));
        view.getBtnTransaksi().setContentAreaFilled(false);
        view.getBtnTransaksi().setBorderPainted(false);
        view.getBtnTransaksi().setOpaque(false);
        
        view.getBtnHome().setFocusPainted(false);
        view.getBtnHome().setMargin(new Insets(0, 0, 0, 0));
        view.getBtnHome().setContentAreaFilled(false);
        view.getBtnHome().setBorderPainted(false);
        view.getBtnHome().setOpaque(false);
        view.addActionListener2(this);
        view.setVisible(true);
    }
    
    public void refreshListNasabah() {
        try {
            

        } catch (Exception e) {
            System.out.println("Error refresh : " + e.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         Object source = ae.getSource();
        if (source.equals(view.getBtnHapus())) {
                String str = "delete from nasabah where noRek = '"+view.noRekHapus()+"'";
                int count = db.querySuccess2(str);
                String str2 = "delete from transfer where noRekPengirim ='"+view.noRekHapus()+"' or noRekTujuan = '"+view.noRekHapus()+"'";
                db.querySuccess2(str2);
                String str3 = "delete from penarikan where noRekPenarikan ='"+view.noRekHapus()+"'";
                db.querySuccess2(str3);
                String str4 = "delete from pemasukan where noRekPemasukan ='"+view.noRekHapus()+"'";
                db.querySuccess2(str4);
                if(count!=0) {
                        view.setVisible(false);
                        JOptionPane.showMessageDialog(null, "Nasabah berhasil dihapus.");
                        new MainControllerNasabah1();
                    } else {
                        JOptionPane.showMessageDialog(null, "Maaf, nasabah tidak terdaftar. Silahkan masukkan kembali.");
                    }
            }
    }
}
