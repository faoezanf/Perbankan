/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Controller.*;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
/**
 *
 * @author faoezanf
 */
public class NasabahH extends javax.swing.JFrame {

    /**
     * Creates new form NasabahH
     */
    public NasabahH() {
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
        jLabel1 = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        btnTransaksi = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        noRekHapus = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(248, 255, 247));
        jPanel4.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Hapus Nasabah");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(140, 110, 280, 50);

        btnHapus.setBackground(new java.awt.Color(129, 204, 186));
        btnHapus.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnHapus.setText("Hapus Nasabah");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel4.add(btnHapus);
        btnHapus.setBounds(400, 360, 220, 40);

        jPanel1.setBackground(new java.awt.Color(129, 204, 186));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(121, 187, 171));
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel5.setText("Nasabah");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(40, 20, 120, 33);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(180, 0, 180, 80);

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

        jPanel4.add(jPanel1);
        jPanel1.setBounds(0, 0, 1001, 80);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Masukkan No. Rekening untuk dihapus :");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(140, 220, 430, 30);

        noRekHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noRekHapusActionPerformed(evt);
            }
        });
        jPanel4.add(noRekHapus);
        noRekHapus.setBounds(140, 260, 460, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        
    }//GEN-LAST:event_btnHapusActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransaksiActionPerformed
        this.setVisible(false);
        new MainControllerTransaksi1();
    }//GEN-LAST:event_btnTransaksiActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        this.setVisible(false);
        new MainControllerUtama();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void noRekHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noRekHapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noRekHapusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnTransaksi;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField noRekHapus;
    // End of variables declaration//GEN-END:variables

    public void addActionListener2(ActionListener e) {
        this.btnHapus.addActionListener(e);
    }

    public JButton getBtnHapus() {
        return this.btnHapus;
    }

    public String noRekHapus() {
        return this.noRekHapus.getText();
    }

    public JButton getBtnHome() {
        return btnHome;
    }

    public JButton getBtnTransaksi() {
        return btnTransaksi;
    }
    
    
}