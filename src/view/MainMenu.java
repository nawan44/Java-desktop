/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class MainMenu extends javax.swing.JFrame {

    DaftarKaryawan karyawan;
    DaftarDistributor dist;
    DaftarBarang barang;
    
    
    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        Login lg = new Login();
        lg.setVisible(true);
        initComponents();
        setTitle("Apotek Gen Inova");
        setVisible(true);
        tampilForm();
        this.addWindowListener(new java.awt.event.WindowAdapter(){
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt){
                closeProgram();
            }
        });
        setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH);
        
        
    }
    
    private void tampilForm(){
        karyawan = new DaftarKaryawan();
        DesktopUtama.add(karyawan);
        dist = new DaftarDistributor();
        DesktopUtama.add(dist);
        barang = new DaftarBarang();
        DesktopUtama.add(barang);
        
        
        
    }
    private void setBukaTutupForm(String menu){
        karyawan.setVisible(false);
        dist.setVisible(false);
        barang.setVisible(false);
        if(menu== "karyawan"){
            karyawan.setVisible(true);
        }else if (menu == "dist"){
            dist.setVisible(true);     
        } if (menu == "barang"){
            barang.setVisible(true);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopUtama = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MFile = new javax.swing.JMenu();
        mExit = new javax.swing.JMenuItem();
        MDaftar = new javax.swing.JMenu();
        mKaryawan = new javax.swing.JMenuItem();
        mBarang = new javax.swing.JMenuItem();
        mDistributor = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();
        About = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        javax.swing.GroupLayout DesktopUtamaLayout = new javax.swing.GroupLayout(DesktopUtama);
        DesktopUtama.setLayout(DesktopUtamaLayout);
        DesktopUtamaLayout.setHorizontalGroup(
            DesktopUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 667, Short.MAX_VALUE)
        );
        DesktopUtamaLayout.setVerticalGroup(
            DesktopUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );

        MFile.setText("File");

        mExit.setText("Exit");
        mExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mExitActionPerformed(evt);
            }
        });
        MFile.add(mExit);

        jMenuBar1.add(MFile);

        MDaftar.setText("Daftar");

        mKaryawan.setText("Daftar Karyawan");
        mKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mKaryawanActionPerformed(evt);
            }
        });
        MDaftar.add(mKaryawan);

        mBarang.setText("Daftar Barang");
        mBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBarangActionPerformed(evt);
            }
        });
        MDaftar.add(mBarang);

        mDistributor.setText("Daftar Distributor");
        mDistributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDistributorActionPerformed(evt);
            }
        });
        MDaftar.add(mDistributor);

        jMenuBar1.add(MDaftar);

        Help.setText("Help");

        About.setText("About");
        Help.add(About);

        jMenuBar1.add(Help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DesktopUtama)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DesktopUtama)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mKaryawanActionPerformed
        // TODO add your handling code here:
        setBukaTutupForm("karyawan");
        
    }//GEN-LAST:event_mKaryawanActionPerformed

    private void mDistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDistributorActionPerformed
        // TODO add your handling code here:
        setBukaTutupForm("dist");
        
    }//GEN-LAST:event_mDistributorActionPerformed

    private void mBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBarangActionPerformed
        // TODO add your handling code here:
        setBukaTutupForm("barang");
    }//GEN-LAST:event_mBarangActionPerformed

    private void mExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mExitActionPerformed
        // TODO add your handling code here:
        closeProgram();
        
    }//GEN-LAST:event_mExitActionPerformed
    private void closeProgram(){
        int konf = JOptionPane.showConfirmDialog(this, 
                "Yakin ingin keluar dari aplikasi apotek ?",
                "Exit", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if(konf == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
        
    }
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem About;
    private javax.swing.JDesktopPane DesktopUtama;
    private javax.swing.JMenu Help;
    private javax.swing.JMenu MDaftar;
    private javax.swing.JMenu MFile;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mBarang;
    private javax.swing.JMenuItem mDistributor;
    private javax.swing.JMenuItem mExit;
    private javax.swing.JMenuItem mKaryawan;
    // End of variables declaration//GEN-END:variables
}
