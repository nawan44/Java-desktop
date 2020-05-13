/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CtrDistributor;
import controller.CtrKaryawan;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author nawan44
 */
public class DaftarKaryawan extends javax.swing.JInternalFrame {

    /**
     * Creates new form DaftarKaryawan
     */
    public DaftarKaryawan() {
        initComponents();
        setTitle("List Daftar Karyawan");
        tampilKaryawan();
        txtKode.setEnabled(false);
    }

    public void tampilKaryawan(){
        CtrKaryawan ck = new CtrKaryawan();
        tblKaryawan2.setModel(ck.getDaftarKaryawan());
    }
    private void clearText(){
        txtKode.setText(null);
        txtUsername.setText(null);
        txtPwd.setText(null);
        txtNama.setText(null);
        cmbJabatan.setSelectedIndex(0);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tblKaryawan = new javax.swing.JScrollPane();
        tblKaryawan2 = new javax.swing.JTable();
        lblFilterNama = new javax.swing.JLabel();
        txtFilterNama = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        lblJabatan = new javax.swing.JPanel();
        lblKode = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPwd = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        cmbJabatan = new javax.swing.JComboBox();
        txtPwd = new javax.swing.JPasswordField();
        btnHapus = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblKaryawan2.setModel(new javax.swing.table.DefaultTableModel(
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
        tblKaryawan2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKaryawan2MouseClicked(evt);
            }
        });
        tblKaryawan.setViewportView(tblKaryawan2);

        lblFilterNama.setText("Filter Nama :");

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        lblJabatan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Form Input Karyawan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 255))); // NOI18N

        lblKode.setText("Kode :");

        lblUsername.setText("Username :");

        lblPwd.setText("Password :");

        lblNama.setText("Nama Lengkap :");

        jLabel5.setText("Jabatan :");

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        cmbJabatan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Operator" }));
        cmbJabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJabatanActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
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

        javax.swing.GroupLayout lblJabatanLayout = new javax.swing.GroupLayout(lblJabatan);
        lblJabatan.setLayout(lblJabatanLayout);
        lblJabatanLayout.setHorizontalGroup(
            lblJabatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblJabatanLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(btnTambah, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(lblJabatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblJabatanLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(lblJabatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKode, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsername)
                            .addComponent(lblPwd)
                            .addComponent(lblNama)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addGroup(lblJabatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtKode)
                            .addComponent(txtUsername)
                            .addComponent(txtNama)
                            .addComponent(cmbJabatan, 0, 141, Short.MAX_VALUE)
                            .addComponent(txtPwd))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(lblJabatanLayout.createSequentialGroup()
                        .addComponent(btnHapus)
                        .addGap(18, 18, 18)
                        .addComponent(btnUbah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBatal)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
        );
        lblJabatanLayout.setVerticalGroup(
            lblJabatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblJabatanLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(lblJabatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKode)
                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lblJabatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblJabatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPwd)
                    .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblJabatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNama)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lblJabatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cmbJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblJabatanLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addGroup(lblJabatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHapus)
                    .addComponent(btnUbah)
                    .addComponent(btnBatal))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFilterNama)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFilterNama, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCari)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tblKaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(lblJabatan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblJabatan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFilterNama, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFilterNama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(7, 7, 7)
                .addComponent(tblKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        String uname = txtFilterNama.getText();
        
        CtrKaryawan ck = new CtrKaryawan();
        tblKaryawan2.setModel(ck.getCariKaryawan(uname));
        
    }//GEN-LAST:event_btnCariActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void cmbJabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJabatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbJabatanActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        
        String username = txtUsername.getText();
        String pwd = new String (txtPwd.getPassword());
        String nama = txtNama.getText();
        String jabatan = cmbJabatan.getSelectedItem().toString();
        
        CtrKaryawan ck = new CtrKaryawan();
        ck.setUsername(username);
        ck.setPwd(pwd);
        ck.setNama(nama);
        ck.setJabatan(jabatan);
        ck.tambahKaryawan();
        
        JOptionPane.showMessageDialog(this,"Data Karyawan Brehasil di tambah ","Berhasil",JOptionPane.INFORMATION_MESSAGE);
        
        

//refresh table karyawan
        tampilKaryawan();
        
        //hapus form
        clearText();
        
    }//GEN-LAST:event_btnTambahActionPerformed

    private void tblKaryawan2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKaryawan2MouseClicked
        // TODO add your handling code here:
        JTable tbl = (JTable)evt.getSource();
        int baris = tbl.getSelectedRow();
        txtKode.setText(tbl.getModel().getValueAt(baris,0).toString());
        txtUsername.setText(tbl.getModel().getValueAt(baris,1).toString());
        txtPwd.setText(tbl.getModel().getValueAt(baris, 2).toString());
        txtNama.setText(tbl.getModel().getValueAt(baris, 3).toString());
        cmbJabatan.setSelectedItem(tbl.getModel().getValueAt(baris,4).toString());
        
    }//GEN-LAST:event_tblKaryawan2MouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        int kode = Integer.parseInt(txtKode.getText());
        int konf = JOptionPane.showConfirmDialog(this,
                "Yakin akan menghapus"+txtUsername.getText()+"?",
                "Konfirmasi",JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
       if(konf == JOptionPane.YES_NO_OPTION){
           
       
        
        CtrKaryawan ck= new CtrKaryawan();
        ck.setKdKaryawan(kode);
        ck.hapusKaryawan();
        
        
        JOptionPane.showMessageDialog(this,"Data Karyawan Brehasil di hapus ","Berhasil",JOptionPane.INFORMATION_MESSAGE);
        
        //refress table
        tampilKaryawan();
       }    
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:  
        String username = txtUsername.getText();
        String pwd = new String (txtPwd.getPassword());
        String nama = txtNama.getText();
        String jabatan = cmbJabatan.getSelectedItem().toString();
        int kode = Integer.parseInt(txtKode.getText());
        CtrKaryawan ck = new CtrKaryawan();
        ck.setUsername(username);
        ck.setPwd(pwd);
        ck.setNama(nama);
        ck.setJabatan(jabatan);
        ck.setKdKaryawan(kode);
        ck.ubahKaryawan();
        
        JOptionPane.showMessageDialog(this,"Data Karyawan Brehasil di ubah ","Berhasil",
               JOptionPane.INFORMATION_MESSAGE);
        
        

//refresh table karyawan
        tampilKaryawan();
        
        //hapus form
        clearText();
        
        
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        clearText();
        tampilKaryawan();
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
            java.util.logging.Logger.getLogger(DaftarKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarKaryawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox cmbJabatan;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblFilterNama;
    private javax.swing.JPanel lblJabatan;
    private javax.swing.JLabel lblKode;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JScrollPane tblKaryawan;
    private javax.swing.JTable tblKaryawan2;
    private javax.swing.JTextField txtFilterNama;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    private javax.swing.JPasswordField txtPwd;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
