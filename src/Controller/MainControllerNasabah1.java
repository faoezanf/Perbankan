package Controller;

import Model.*;
import View.*;
import java.awt.Insets;
import java.sql.ResultSet;

public class MainControllerNasabah1 {
    private nasabah1 view;
    private Database db;
    
    public MainControllerNasabah1() {
        view = new nasabah1();
        db = new Database();
        view.setVisible(true);
        
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
        
        refreshListNasabah();
        view.setDataNasabah(view.listNasabah);
    }
    
    public void refreshListNasabah() {
        try {
            ResultSet rs = db.getData("select * from nasabah");
            view.listNasabah.removeAll(view.listNasabah);
            while (rs.next()) {
                Nasabah n = new Nasabah(
                        rs.getString("namaNasabah"), rs.getString("sexNasabah"), rs.getString("noKtpNasabah"), rs.getString("noHpNasabah"), rs.getDouble("saldoNasabah"), rs.getString("noRek"));
                view.listNasabah.add(n);
            }

        } catch (Exception e) {
            System.out.println("Error refresh : " + e.getMessage());
        }
    }
}
