/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.lakukanTransaksi;
import java.awt.Insets;

/**
 *
 * @author faoezanf
 */
public class MainControllerTransaksi1 {
    private lakukanTransaksi view;
    public MainControllerTransaksi1() {
        view = new lakukanTransaksi();
        view.setVisible(true);
        
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
}
