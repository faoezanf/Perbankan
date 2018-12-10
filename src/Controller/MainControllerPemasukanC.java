package Controller;

import Model.*;
import View.*;
import java.awt.Insets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MainControllerPemasukanC {
    private PemasukanC view;
    private Database db;
    
    public MainControllerPemasukanC() {
        view = new PemasukanC();
        db = new Database();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
        String tanggal = dateFormat.format(date).toString();
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
        view.getNoRek().setText(Controller.MainControllerPemasukan.nomor);
        view.getNamaNasabah().setText(Controller.MainControllerPemasukan.nama);
        view.getJumlahSaldo().setText(Controller.MainControllerPemasukan.jumlah);
        view.getTgl().setText(tanggal);
    }
}
