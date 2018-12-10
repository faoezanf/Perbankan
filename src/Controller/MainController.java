package Controller;

import Model.Database;
import View.halamanLogin;
import View.MenuAwal;
import View.data_nasabah;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class MainController implements ActionListener{
    private halamanLogin view;
    Database db;
    
    public MainController() {
        view = new halamanLogin();
        view.setVisible(true);
        db = new Database();
        view.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        try {
            if (source.equals(view.btnLogin())) {
                try{
                    String str = "select * from admin where username='"+view.getTxtUsername()+"' and password='"+view.getTxtPassword()+"'";
                    int count = db.querySuccess(str);
                    if(count==1) {
                        view.setVisible(false);
                        new MainControllerUtama();
                    } else {
                        JOptionPane.showMessageDialog(null, "Maaf, username atau password salah. Silahkan coba lagi.");
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
