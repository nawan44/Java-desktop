/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CtrDistributor;
import javax.swing.JOptionPane;
import javax.swing.JTable;


/**
 *
 * @author Asus
 */
public class DaftarDistributor extends javax.swing.JInternalFrame {
  

    /**
     * Creates new form DaftarDistributor
     */
    public DaftarDistributor() {
        initComponents();
         setTitle("List Daftar Distributor");
        tampilDistributor();
    }
     public void tampilDistributor(){
         CtrDistributor ck = new CtrDistributor();
        tblDistributor.setModel(ck.getDaftarDistributor());
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDistributor = new javax.swing.JTable();
        lblFilterNama = new javax.swing.JLabel();
        txtFilterNama2 = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        lblKode = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        lblAlamat = new javax.swing.JLabel();
        lblTelp = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txtKode = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtTelp = new javax.swing.JTextField();
        btnUbah = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDistributor.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDistributor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDistributorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDistributor);

        lblFilterNama.setText("Filter nama :");

        txtFilterNama2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFilterNama2ActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        lblKode.setText("Kode :");

        lblNama.setText("Nama :");

        lblAlamat.setText("ALamat :");

        lblTelp.setText("No. Telp :");

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        txtTelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelpActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblFilterNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFilterNama2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCari)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblKode, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNama, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAlamat, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTelp, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtKode)
                                    .addComponent(txtNama)
                                    .addComponent(txtAlamat)
                                    .addComponent(txtTelp, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTambah)
                                .addGap(18, 18, 18)
                                .addComponent(btnHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUbah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBatal)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKode)
                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNama)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlamat)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelp)
                    .addComponent(txtTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnHapus)
                    .addComponent(btnUbah)
                    .addComponent(btnBatal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFilterNama)
                    .addComponent(txtFilterNama2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFilterNama2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilterNama2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFilterNama2ActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        String uname = txtFilterNama2.getText();
        
        CtrDistributor ck = new CtrDistributor();
        tblDistributor.setModel(ck.getCariDistributor(uname));
        
               
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        int kode = Integer.parseInt(txtKode.getText());
        
        String nama = txtNama.getText();
        String alamat = txtAlamat.getText();
        String telp = txtTelp.getText();
        
      
        CtrDistributor ck = new CtrDistributor();
        ck.setKdDistributor(kode);
        ck.setNama(nama);
        ck.setAlamat(alamat);
        ck.setTelp(telp);
        
        
      
   
    
        ck.tambahDistributor();
        
        JOptionPane.showMessageDialog(this,"Data Distributor Brehasil di tambah ","Berhasil",JOptionPane.INFORMATION_MESSAGE);
        
        

//refresh table karyawan
        tampilDistributor();
        
        //hapus form
        clearText();
        
                                            

    }//GEN-LAST:event_btnTambahActionPerformed

    private void txtTelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelpActionPerformed

    private void tblDistributorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDistributorMouseClicked
        // TODO add your handling code here:
         JTable tbl = (JTable)evt.getSource();
        int baris = tbl.getSelectedRow();
        txtKode.setText(tbl.getModel().getValueAt(baris,0).toString());
        txtNama.setText(tbl.getModel().getValueAt(baris, 1).toString());
        txtAlamat.setText(tbl.getModel().getValueAt(baris, 2).toString());
        txtTelp.setText(tbl.getModel().getValueAt(baris,3).toString());
        
        
    }//GEN-LAST:event_tblDistributorMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        int kode = Integer.parseInt(txtKode.getText());
        int konf = JOptionPane.showConfirmDialog(this,
                "Yakin akan menghapus"+txtNama.getText()+"?",
                "Konfirmasi",JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
       if(konf == JOptionPane.YES_NO_OPTION){
         CtrDistributor ck= new CtrDistributor();
        ck.setKdDistributor(kode);
        ck.hapusDistributor();
        
        
        
        JOptionPane.showMessageDialog(this,"Data Karyawan Brehasil di hapus ","Berhasil",JOptionPane.INFORMATION_MESSAGE);
        
        //refress table
        tampilDistributor();
        
    }                   
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        
        int kode = Integer.parseInt(txtKode.getText());
        
        String nama = txtNama.getText();
        String alamat = txtAlamat.getText();
        String telp = txtTelp.getText();
        
      
        CtrDistributor ck = new CtrDistributor();
        ck.setKdDistributor(kode);
        ck.setNama(nama);
        ck.setAlamat(alamat);
        ck.setTelp(telp);
  
        ck.ubahDistributor();
        
        JOptionPane.showMessageDialog(this,"Data Distributor Brehasil di ubah ","Berhasil",JOptionPane.INFORMATION_MESSAGE);
        
        

//refresh table karyawan
        tampilDistributor();
        
        //hapus form
        clearText();
        
                                            

        
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
         clearText();
        tampilDistributor();
            
    }//GEN-LAST:event_btnBatalActionPerformed

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
            java.util.logging.Logger.getLogger(DaftarDistributor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarDistributor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarDistributor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarDistributor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarDistributor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlamat;
    private javax.swing.JLabel lblFilterNama;
    private javax.swing.JLabel lblKode;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblTelp;
    private javax.swing.JTable tblDistributor;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtFilterNama2;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTelp;
    // End of variables declaration//GEN-END:variables

    private void clearText() {
       txtKode.setText(null);
        txtNama.setText(null);
        txtAlamat.setText(null);
        txtTelp.setText(null);
      
    }
}