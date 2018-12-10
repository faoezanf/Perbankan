package Controller;

import View.MenuAwal;
import java.awt.Insets;

public class MainControllerUtama {
    private MenuAwal view;
    
    public MainControllerUtama() {
        view = new MenuAwal();
        view.setVisible(true);
        
        view.getBtnTransaksi().setFocusPainted(false);
        view.getBtnTransaksi().setMargin(new Insets(0, 0, 0, 0));
        view.getBtnTransaksi().setContentAreaFilled(false);
        view.getBtnTransaksi().setBorderPainted(false);
        view.getBtnTransaksi().setOpaque(false);
        
        view.getBtnNasabah().setFocusPainted(false);
        view.getBtnNasabah().setMargin(new Insets(0, 0, 0, 0));
        view.getBtnNasabah().setContentAreaFilled(false);
        view.getBtnNasabah().setBorderPainted(false);
        view.getBtnNasabah().setOpaque(false);
    }
}
