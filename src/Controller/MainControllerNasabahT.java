/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Database;
import View.*;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author faoezanf
 */
public class MainControllerNasabahT implements ActionListener{
    private NasabahT view;
    private Database db;
    
    public MainControllerNasabahT() {
        view = new NasabahT();
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
        view.setVisible(true);
        view.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        try {
            if (source.equals(view.getBtnTambah())) {
                try{
                   String str = "insert into nasabah (namaNasabah, sexNasabah, noKtpNasabah, noHpNasabah, saldoNasabah, noRek) "
                        + "values('"
                        + view.nama() + "','" + view.sex() + "','" + view.noKtp() + "','" + view.noHp() + "','" + view.saldo() + "','1" + view.noRek() + "')";
                    int count = db.querySuccess2(str);
                    if(count!=0) {
                        view.setVisible(false);
                        JOptionPane.showMessageDialog(null, "Nasabah berhasil ditambah.");
                        new MainControllerNasabah1();
                    } else {
                        JOptionPane.showMessageDialog(null, "Maaf, data yang anda inputkan kurang benar.");
                    }
                } catch(Exception e){
                    System.out.println("Error: " + e.getMessage());
                }        
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
