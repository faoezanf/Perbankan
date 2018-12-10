package Controller;

import Model.*;
import View.*;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class MainControllerNasabahE implements ActionListener{
    private NasabahE view;
    private Database db;
    
    public MainControllerNasabahE() {
        view = new NasabahE();
        db = new Database();
        view.setVisible(true);
        view.setValueEdit();
        view.addActionListener3(this);
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
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getBtnEdit())) {
                String str = "update nasabah set noHpNasabah = '"+view.noHpEdit()+"' where noRek = '"+view.noRekEdit()+"'";
                int count = db.querySuccess2(str);
                if(count!=0) {
                        view.setVisible(false);
                        JOptionPane.showMessageDialog(null, "No.HP berhasil diedit.");
                        new MainControllerNasabah1();
                    } else {
                        JOptionPane.showMessageDialog(null, "Maaf, terjadi kesalahan, silahkan ulangi kembali.");
                    }
        }
    }
}
