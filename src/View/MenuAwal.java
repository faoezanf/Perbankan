/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.*;
import Model.Database;
import View.data_nasabah;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class MenuAwal extends javax.swing.JFrame {

    /**
     * Creates new form MenuAwal
     */
    public MenuAwal() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        btnNasabah = new javax.swing.JButton();
        btnTransaksi = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(248, 255, 247));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(129, 204, 186));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(121, 187, 171));
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel5.setText("Home");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(50, 20, 71, 33);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 180, 80);

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

        btnTransaksi.setBackground(new java.awt.Color(129, 204, 186));
        btnTransaksi.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        btnTransaksi.setText("Transaksi");
        btnTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransaksiActionPerformed(evt);
            }
        });
        jPanel1.add(btnTransaksi);
        btnTransaksi.setBounds(380, 20, 150, 43);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 80));

        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/faoezanf/Documents/Tugas/Semester 5/impal/TubesImpal/image/logo.png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        jPanel3.setBackground(new java.awt.Color(203, 204, 129));
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Hiragino Kaku Gothic Pro", 3, 24)); // NOI18N
        jLabel3.setText("Berita Aplikasi");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(370, 140, 200, 40);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 930, 290));

        jPanel4.setBackground(new java.awt.Color(248, 255, 247));
        jPanel4.setLayout(null);
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransaksiActionPerformed
        this.setVisible(false);
        new MainControllerTransaksi1();
    }//GEN-LAST:event_btnTransaksiActionPerformed

    private void btnNasabahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNasabahActionPerformed
        this.setVisible(false);
        new MainControllerNasabah1();
    }//GEN-LAST:event_btnNasabahActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNasabah;
    private javax.swing.JButton btnTransaksi;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

    
    public void addActionListener(ActionListener e) {
        //this.jButton2.addActionListener(e);
    }

    public JButton getBtnTransaksi() {
        return btnTransaksi;
    }
    
    public JButton getBtnNasabah() {
        return btnNasabah;
    }
}
