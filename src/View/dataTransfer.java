package View;

import Model.Database;
import Model.Transfer;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class dataTransfer extends javax.swing.JFrame {

    public ArrayList<Transfer> listTransfer = new ArrayList<>();

    public dataTransfer() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTransfer = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jml = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tglTransfer = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        rek1 = new javax.swing.JComboBox<>();
        rek2 = new javax.swing.JComboBox<>();
        btnHapus = new javax.swing.JButton();
        data = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA TRANSFER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, 60));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tbTransfer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No. Rekening Pengirim", "No. Rekening Tujuan", "Jumlah Uang", "Tanggal Transfer"
            }
        ));
        jScrollPane1.setViewportView(tbTransfer);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 440, 130));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("No. Rekening Pengirim");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 140, 20));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("No. Rekening Tujuan");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 130, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jumlah Uang");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 90, -1));
        getContentPane().add(jml, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 150, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tanggal Transfer");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 140, 20));

        tglTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglTransferActionPerformed(evt);
            }
        });
        getContentPane().add(tglTransfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 150, -1));

        btnAdd.setText("Tambah");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        jButton3.setText("<< Kembali");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        rek1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rek1ActionPerformed(evt);
            }
        });
        getContentPane().add(rek1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 150, -1));

        rek2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rek2ActionPerformed(evt);
            }
        });
        getContentPane().add(rek2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 150, -1));

        btnHapus.setText("Hapus Semua");
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, -1, -1));

        data.setForeground(new java.awt.Color(204, 255, 0));
        data.setText("✓ Data berhasil ditambah");
        getContentPane().add(data, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon("/Users/faoezanf/Documents/GUI/Transfer-01.png")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tglTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglTransferActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tglTransferActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        this.jml.setText("");
        this.tglTransfer.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        new lakukanTransaksi().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void rek2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rek2ActionPerformed

    }//GEN-LAST:event_rek2ActionPerformed

    private void rek1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rek1ActionPerformed
        setValueCombo2();
    }//GEN-LAST:event_rek1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnHapus;
    private javax.swing.JLabel data;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jml;
    private javax.swing.JComboBox<String> rek1;
    private javax.swing.JComboBox<String> rek2;
    private javax.swing.JTable tbTransfer;
    private javax.swing.JTextField tglTransfer;
    // End of variables declaration//GEN-END:variables
    public void setDataTransfer(ArrayList<Transfer> transfer) {
        for (int j = 0; j < transfer.size(); j++) {
            tbTransfer.setValueAt(transfer.get(j).noRekPengirim, j, 0);
            tbTransfer.setValueAt(transfer.get(j).noRekPenerima, j, 1);
            tbTransfer.setValueAt(transfer.get(j).jumlahTransfer, j, 2);
            tbTransfer.setValueAt(transfer.get(j).tanggalTransfer, j, 3);
        }
    }

    public String noRekPengirim() {
        return this.rek1.getSelectedItem().toString();
    }

    public String noRekPenerima() {
        return this.rek2.getSelectedItem().toString();
    }

    public double jmlUang() {
        Double d;
        d = Double.parseDouble(this.jml.getText());
        return d;
    }

    public String tgl() {
        return this.tglTransfer.getText();
    }

    public JButton btnAdd() {
        return this.btnAdd;
    }

    
    public JButton btnHapus() {
        return this.btnHapus;
    }
    
    public void addActionListener(ActionListener e) {
        this.btnAdd.addActionListener(e);
    }

    public void addActionListener2(ActionListener e) {
        this.btnHapus.addActionListener(e);
    }
    
    public void setValueCombo() {
        try {
            Database db = new Database();
            ResultSet rs = db.getData("select noRek from nasabah");
            rek1.removeAllItems();
            rek2.removeAllItems();
            while (rs.next()) {
                rek1.addItem(rs.getString("noRek"));
            }
            setValueCombo2();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void setValueCombo2() {
        try {
            Database db = new Database();
            ResultSet rs = db.getData("select noRek from nasabah");
            rek2.removeAllItems();
            while (rs.next()) {
                rek2.addItem(rs.getString("noRek"));
                if (noRekPengirim() != rs.getString("noRek")) {
                    rek2.removeItem(noRekPengirim());
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void dataBelum() {
        this.data.setVisible(false);
    }
    
    public void dataMasuk() {
        this.data.setVisible(true);
    }
    
}
