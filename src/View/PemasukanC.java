/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author faoezanf
 */
public class PemasukanC extends javax.swing.JFrame {

    /**
     * Creates new form PemasukanC
     */
    public PemasukanC() {
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
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        noRek = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        namaNasabah = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jumlahSaldo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tgl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        namaNasabah3 = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();

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
        jLabel1.setBounds(60, 130, 160, 35);

        jLabel3.setText("No. Rekening Nasabah");

        noRek.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        noRek.setText("...");

        jLabel4.setText("Nama Nasabah");

        namaNasabah.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        namaNasabah.setText("...");

        jLabel6.setText("Jumlah Saldo yang Disetor");

        jumlahSaldo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jumlahSaldo.setText("...");

        jLabel7.setText("Tanggal Transaksi");

        tgl.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tgl.setText("...");

        jLabel8.setText("Status");

        namaNasabah3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        namaNasabah3.setText("Berhasil");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(noRek)
                    .addComponent(jLabel4)
                    .addComponent(namaNasabah)
                    .addComponent(jLabel6)
                    .addComponent(jumlahSaldo)
                    .addComponent(jLabel7)
                    .addComponent(tgl)
                    .addComponent(jLabel8)
                    .addComponent(namaNasabah3))
                .addContainerGap(502, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(noRek)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaNasabah)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jumlahSaldo)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tgl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(namaNasabah3)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel3);
        jPanel3.setBounds(60, 200, 680, 300);

        btnPrint.setText("Cetak Struk");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jPanel4.add(btnPrint);
        btnPrint.setBounds(70, 530, 160, 25);

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

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        this.setVisible(false);
        JOptionPane.showMessageDialog(null, "Cetak Struk Telah Berhasil.");
        new MainControllerUtama();
    }//GEN-LAST:event_btnPrintActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnNasabah;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jumlahSaldo;
    private javax.swing.JLabel namaNasabah;
    private javax.swing.JLabel namaNasabah3;
    private javax.swing.JLabel noRek;
    private javax.swing.JLabel tgl;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnHome() {
        return btnHome;
    }

    public JButton getBtnNasabah() {
        return btnNasabah;
    }

    public JLabel getNoRek() {
        return noRek;
    }

    public JLabel getJumlahSaldo() {
        return jumlahSaldo;
    }

    public JLabel getNamaNasabah() {
        return namaNasabah;
    }

    public JLabel getTgl() {
        return tgl;
    }

    
}
