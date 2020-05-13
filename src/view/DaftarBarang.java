/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CtrBarang;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class DaftarBarang extends javax.swing.JInternalFrame {

    /**
     * Creates new form DaftarBarang
     */
    public DaftarBarang() {
        initComponents();
        setTitle("List Daftar Barang");
                tampil();
    }

    
    private void tampil(){
        CtrBarang cb = new CtrBarang();
        tblBarang.setModel(cb.getDaftarBarang());
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupBentuk = new javax.swing.ButtonGroup();
        btnGroupJenis = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();
        lblKode = new javax.swing.JLabel();
        lblMerk = new javax.swing.JLabel();
        lblSatuan = new javax.swing.JLabel();
        lblHarga = new javax.swing.JLabel();
        lblJenis = new javax.swing.JLabel();
        lblGol = new javax.swing.JLabel();
        lblKel = new javax.swing.JLabel();
        lblBentuk = new javax.swing.JLabel();
        lblJnsObat = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        txtKode = new javax.swing.JTextField();
        txtMerk = new javax.swing.JTextField();
        cmbSatuan = new javax.swing.JComboBox();
        txtHarga = new javax.swing.JTextField();
        rbObat = new javax.swing.JRadioButton();
        rbNonObat = new javax.swing.JRadioButton();
        cmbGolongan = new javax.swing.JComboBox();
        cmbKel = new javax.swing.JComboBox();
        rbCair = new javax.swing.JRadioButton();
        rbNonCair = new javax.swing.JRadioButton();
        cmbJnsObat = new javax.swing.JComboBox();
        btnHapus = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblBarang);

        lblKode.setText("Kode :");

        lblMerk.setText("Merk :");

        lblSatuan.setText("Satuan :");

        lblHarga.setText("Harga :");

        lblJenis.setText("Jenis :");

        lblGol.setText("Golongan :");

        lblKel.setText("Kelompok :");

        lblBentuk.setText("Bentuk :");

        lblJnsObat.setText("Jenis Obat :");

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        cmbSatuan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Strip", "Sachet", "Botol", "Tablet", " " }));

        rbObat.setText("Obat");

        rbNonObat.setText("Non Obat");

        cmbGolongan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Generik", "Paten", "Lainnya" }));

        cmbKel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dewasa", "Anak", "Umum" }));

        rbCair.setText("Cair");

        rbNonCair.setText("Non Cair");

        cmbJnsObat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Batuk", "Demam", "Flu", "Pencernaan", "Vitamin", "Susu Bayi", "Susu Umum", "Diapers", "Thermometer", "Sabun" }));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKode, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMerk, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSatuan, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHarga, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblJenis, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblGol, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblKel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBentuk, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblJnsObat, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbCair)
                                .addGap(18, 18, 18)
                                .addComponent(rbNonCair))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbObat)
                                .addGap(18, 18, 18)
                                .addComponent(rbNonObat))
                            .addComponent(txtKode)
                            .addComponent(txtMerk)
                            .addComponent(cmbSatuan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtHarga)
                            .addComponent(cmbGolongan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbKel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbJnsObat, 0, 181, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTambah)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnBatal)
                        .addGap(256, 256, 256))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKode)
                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMerk)
                    .addComponent(txtMerk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSatuan)
                    .addComponent(cmbSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHarga)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJenis)
                    .addComponent(rbObat)
                    .addComponent(rbNonObat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGol)
                    .addComponent(cmbGolongan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKel)
                    .addComponent(cmbKel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBentuk)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbCair)
                        .addComponent(rbNonCair)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJnsObat)
                    .addComponent(cmbJnsObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnHapus)
                    .addComponent(btnUbah)
                    .addComponent(btnBatal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        CtrBarang cb = new CtrBarang();
        String merk = txtMerk.getText();
        String satuan = cmbSatuan.getSelectedItem().toString();
        Double harga = Double.parseDouble(txtHarga.getText());
        String gol = cmbGolongan.getSelectedItem().toString();
        String kel = cmbKel.getSelectedItem().toString();
        String jenisObat = cmbJnsObat.getSelectedItem().toString();
        
        int kd_gol = cb.getParGol(gol);
        int kd_kel = cb.getParKel(kel);
        int kd_jns_obat = cb.getParJnsObat(jenisObat);
        cb.setMerk(merk);
        cb.setUom(satuan);
        
        cb.setHarga(harga);
        cb.getParam().setKd_jns(ambilPilihanObat());
        cb.setKd_gol(kd_gol);
        cb.setKd_kel(kd_kel);
        cb.getParam().setKd_bent(ambilPilihanBentuk());
        cb.setKd_jns_obat(kd_jns_obat);
        cb.tambahBarang();
        
        
        //refress
        tampil();
         JOptionPane.showMessageDialog(this,"Data Barang Brehasil di tambah ",
                 "Berhasil",JOptionPane.INFORMATION_MESSAGE);
        
        
        //refress
         tampil();
         
    }
    private int ambilPilihanObat(){
        int hasil = 1;
        if(rbObat.isSelected()){
            hasil =1;
        }else if (rbNonObat.isSelected());
        hasil = 2;
        return hasil;
    }
    private int ambilPilihanBentuk(){
        int hasil = 1;
        if(rbCair.isSelected()){
            hasil =1;
        }else if (rbNonCair.isSelected());
        hasil = 2;
        return hasil;
                                           

    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUbahActionPerformed

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
            java.util.logging.Logger.getLogger(DaftarBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.ButtonGroup btnGroupBentuk;
    private javax.swing.ButtonGroup btnGroupJenis;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox cmbGolongan;
    private javax.swing.JComboBox cmbJnsObat;
    private javax.swing.JComboBox cmbKel;
    private javax.swing.JComboBox cmbSatuan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBentuk;
    private javax.swing.JLabel lblGol;
    private javax.swing.JLabel lblHarga;
    private javax.swing.JLabel lblJenis;
    private javax.swing.JLabel lblJnsObat;
    private javax.swing.JLabel lblKel;
    private javax.swing.JLabel lblKode;
    private javax.swing.JLabel lblMerk;
    private javax.swing.JLabel lblSatuan;
    private javax.swing.JRadioButton rbCair;
    private javax.swing.JRadioButton rbNonCair;
    private javax.swing.JRadioButton rbNonObat;
    private javax.swing.JRadioButton rbObat;
    private javax.swing.JTable tblBarang;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtMerk;
    // End of variables declaration//GEN-END:variables
}
