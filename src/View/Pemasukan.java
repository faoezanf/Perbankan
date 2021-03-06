/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.*;
import Model.Database;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author faoezanf
 */
public class Pemasukan extends javax.swing.JFrame {

    /**
     * Creates new form Pemasukan
     */
    public Pemasukan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        btnNasabah = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        noRek = new javax.swing.JComboBox<>();
        jmlPemasukan = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(248, 255, 247));
        jPanel4.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(129, 204, 186));
        jPanel1.setLayout(null);

        jLabel2.setText("Welcome, user!");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(820, 10, 220, 15);

        jButton5.setForeground(new java.awt.Color(255, 0, 0));
        jButton5.setText("Log Out");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(820, 30, 110, 30);

        btnNasabah.setBackground(new java.awt.Color(129, 204, 186));
        btnNasabah.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        btnNasabah.setText("Nasabah");
        btnNasabah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNasabahActionPerformed(evt);
            }
        });
        jPanel1.add(btnNasabah);
        btnNasabah.setBounds(200, 20, 150, 43);

        btnHome.setBackground(new java.awt.Color(129, 204, 186));
        btnHome.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome);
        btnHome.setBounds(10, 20, 150, 43);

        jPanel2.setBackground(new java.awt.Color(121, 187, 171));
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel5.setText("Transaksi");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 20, 130, 33);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(380, 0, 180, 80);

        jPanel4.add(jPanel1);
        jPanel1.setBounds(0, 0, 1001, 80);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setText("Setor Saldo");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(390, 120, 170, 35);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("No. Rekening");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(250, 220, 150, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Jumlah Saldo");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(250, 290, 150, 40);

        noRek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noRekActionPerformed(evt);
            }
        });
        jPanel4.add(noRek);
        noRek.setBounds(450, 220, 250, 40);

        jmlPemasukan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmlPemasukanActionPerformed(evt);
            }
        });
        jPanel4.add(jmlPemasukan);
        jmlPemasukan.setBounds(450, 290, 250, 40);

        btnAdd.setBackground(new java.awt.Color(129, 204, 186));
        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnAdd.setText("Tambah");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel4.add(btnAdd);
        btnAdd.setBounds(360, 390, 210, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnNasabahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNasabahActionPerformed
        this.setVisible(false);
        new MainControllerNasabah1();
    }//GEN-LAST:event_btnNasabahActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        this.setVisible(false);
        new MainControllerUtama();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void noRekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noRekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noRekActionPerformed

    private void jmlPemasukanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmlPemasukanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmlPemasukanActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnNasabah;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jmlPemasukan;
    private javax.swing.JComboBox<String> noRek;
    // End of variables declaration//GEN-END:variables

    public String noRek() {
        return this.noRek.getSelectedItem().toString();
    }
    
    public void setValueEdit() {
        try {
            Database db = new Database();
            ResultSet rs = db.getData("select noRek from nasabah");
            noRek.removeAllItems();
            while (rs.next()) {
                noRek.addItem(rs.getString("noRek"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public double jmlUang() {
        Double d;
        d = Double.parseDouble(this.jmlPemasukan.getText());
        return d;
    }
    
    
    public void addActionListener(ActionListener e) {
        this.btnAdd.addActionListener(e);
    }

    public JButton getBtnAdd() {
        return btnAdd;
    }

    public JTextField getJmlPemasukan() {
        return jmlPemasukan;
    }

    public JButton getBtnHome() {
        return btnHome;
    }

    public JButton getBtnNasabah() {
        return btnNasabah;
    }
    
    
}
