/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

import com.model.Model_Mahasiswa;
import com.model.Model_charmer;
import java.awt.Component;                               // Kita masukkan kan lib yang di butuhkan
import java.sql.SQLException;                            // jangan ada yang ketinggalan 
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;


/**
 *
 * @author ASUS
 */
public class data_charmer extends javax.swing.JFrame {
public DefaultTableModel tblmodel;
    String header[] ={"Dana_Kuliah", "Service_motor", "Bayar_LIstrik", "Bayar_Bpjs", "Bayar_Kuota", "mamah", "Tabungan_Wajib", "Simpananf"};
   public Object data9;
   public Object model;


    
    
    public data_charmer() throws SQLException {
    initComponents();
        tblmodel = new DefaultTableModel(null, header);
        Tabel.setModel(tblmodel);
        Tabel.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        Model.tampil(this);
        setLebarKolom();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    Model_charmer Model = new Model_charmer(); //untuk bisa memangil override
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        data1 = new javax.swing.JTextField();
        data2 = new javax.swing.JTextField();
        data3 = new javax.swing.JTextField();
        data4 = new javax.swing.JTextField();
        data5 = new javax.swing.JTextField();
        data6 = new javax.swing.JTextField();
        data7 = new javax.swing.JTextField();
        data8 = new javax.swing.JTextField();
        txtBaru = new javax.swing.JButton();
        txtsimpan = new javax.swing.JButton();
        txtedit = new javax.swing.JButton();
        txtkeluar = new javax.swing.JButton();
        txthapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel);

        jLabel1.setText("Dana_Kuliah");

        jLabel2.setText("Service_Motor");

        jLabel3.setText("Bayar_Listrik");

        jLabel4.setText("Bayar_Bpjs");

        jLabel5.setText("Bayar_Kwota");

        jLabel6.setText("Mamah");

        jLabel7.setText("Tabungan_Wajib");

        jLabel8.setText("Simpana");

        data1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data1ActionPerformed(evt);
            }
        });

        data2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data2ActionPerformed(evt);
            }
        });

        data5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data5ActionPerformed(evt);
            }
        });

        txtBaru.setText("Baru");
        txtBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBaruActionPerformed(evt);
            }
        });

        txtsimpan.setText("simpan");
        txtsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsimpanActionPerformed(evt);
            }
        });

        txtedit.setText("edit");
        txtedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txteditActionPerformed(evt);
            }
        });

        txtkeluar.setText("keluar");
        txtkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkeluarActionPerformed(evt);
            }
        });

        txthapus.setText("hapus");
        txthapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(data1)
                            .addComponent(data2)
                            .addComponent(data3)
                            .addComponent(data4)
                            .addComponent(data5)
                            .addComponent(data6)
                            .addComponent(data7)
                            .addComponent(data8, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(txtBaru)
                .addGap(59, 59, 59)
                .addComponent(txtsimpan)
                .addGap(54, 54, 54)
                .addComponent(txtedit)
                .addGap(49, 49, 49)
                .addComponent(txthapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(txtkeluar)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(data1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(data2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(data3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(data4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(data5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(data6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(data7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(data8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBaru)
                    .addComponent(txtsimpan)
                    .addComponent(txtedit)
                    .addComponent(txtkeluar)
                    .addComponent(txthapus))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void data5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_data5ActionPerformed

    private void data2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_data2ActionPerformed

    private void data1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_data1ActionPerformed

    private void txtBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBaruActionPerformed
   Model.baru(this);
    
    }//GEN-LAST:event_txtBaruActionPerformed

    private void txtkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_txtkeluarActionPerformed

    private void TabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelMouseClicked
 try {
            Model.Tabel(this);
        } catch (SQLException ex) {
            Logger.getLogger(data_charmer.class.getName()).log(Level.SEVERE, null, ex);
    }       
    }//GEN-LAST:event_TabelMouseClicked

    private void txthapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthapusActionPerformed
        // TODO add your handling code here:
         try {
            Model.hapus(this);
        } catch (SQLException ex) {
            Logger.getLogger(data_charmer.class.getName()).log(Level.SEVERE, null, ex);
    }
          
    }//GEN-LAST:event_txthapusActionPerformed

    private void txtsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsimpanActionPerformed
        // TODO add your handling code here:
          try {
            // TODO add your handling code here:
            Model.simpan(this);
        } catch (SQLException ex) {
            Logger.getLogger(data_charmer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtsimpanActionPerformed

    private void txteditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txteditActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Model.ubah(this);
        } catch (SQLException ex) {
            Logger.getLogger(data_charmer.class.getName()).log(Level.SEVERE, null, ex);
         
        }
    }//GEN-LAST:event_txteditActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(data_charmer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(data_charmer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(data_charmer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data_charmer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 try {                                           //
                    new data_charmer().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(data_charmer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable Tabel;
    public javax.swing.JTextField data1;
    public javax.swing.JTextField data2;
    public javax.swing.JTextField data3;
    public javax.swing.JTextField data4;
    public javax.swing.JTextField data5;
    public javax.swing.JTextField data6;
    public javax.swing.JTextField data7;
    public javax.swing.JTextField data8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton txtBaru;
    private javax.swing.JButton txtedit;
    private javax.swing.JButton txthapus;
    private javax.swing.JButton txtkeluar;
    private javax.swing.JButton txtsimpan;
    // End of variables declaration//GEN-END:variables

    public void setLebarKolom() {
     //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setLebarKo1lom() {
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
