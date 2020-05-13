/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Distributor;
import model.koneksi;

/**
 *
 * @author Asus
 */
public class CtrDistributor extends Distributor {

    public TableModel getDaftarDistributor() {

        try {
            koneksi con = new koneksi();
            PreparedStatement stm = con.connect("SELECT\n"
                    + "  kd_dist,\n"
                    + "  nama,\n"
                    + "  alamat,\n"
                    + "  telp\n"
                    + "FROM distributor");
            ResultSet rs = stm.executeQuery();

            DefaultTableModel mdlDistributor = new DefaultTableModel();
            mdlDistributor.addColumn("Kode Distributor");
            mdlDistributor.addColumn("nama");
            mdlDistributor.addColumn("alamat");
            mdlDistributor.addColumn("telp");

            Object[] ok;
            while (rs.next()) {
                ok = new Object[4];
                ok[0] = rs.getInt("kd_dist");
                ok[1] = rs.getString("nama");
                ok[2] = rs.getString("alamat");
                ok[3] = rs.getString("telp");

                mdlDistributor.addRow(ok);
            }
            return mdlDistributor;

        } catch (SQLException ex) {
            Logger.getLogger(CtrDistributor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public TableModel getCariDistributor(String uname) {
        try {
            koneksi con = new koneksi();
            PreparedStatement stm = con.connect("SELECT\n"
                    + "  kd_dist,\n"
                    + "  nama,\n"
                    + "  alamat,\n"
                    + "  telp\n"
                    + "FROM distributor\n"
                    + "WHERE nama LIKE ?");

            stm.setString(1, "%" + uname + "%");
            ResultSet rs = stm.executeQuery();

            DefaultTableModel mdlDistributor = new DefaultTableModel();
            mdlDistributor.addColumn("Kode Distributor");
            mdlDistributor.addColumn("nama");
            mdlDistributor.addColumn("alamat");
            mdlDistributor.addColumn("telp");

            Object[] ok;
            while (rs.next()) {
                ok = new Object[4];
                ok[0] = rs.getInt("kd_dist");
                ok[1] = rs.getString("nama");
                ok[2] = rs.getString("alamat");
                ok[3] = rs.getString("telp");

                mdlDistributor.addRow(ok);
            }
            return mdlDistributor;
        } catch (SQLException ex) {
            Logger.getLogger(CtrKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public void tambahDistributor() {
        try {
            koneksi con = new koneksi();
            PreparedStatement stm = con.connect("INSERT INTO distributor\n"
                    + "            (kd_dist,\n"
                    + "             nama,\n"
                    + "             alamat,\n"
                    + "             telp)\n"
                    + "VALUES (?,?,?,?);");
            stm.setInt(1, getKdDistributor());
            stm.setString(2, getNama());
            stm.setString(3, getAlamat());
            stm.setString(4, getTelp());

            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CtrKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void hapusDistributor() {
        try {
            koneksi con = new koneksi();
            PreparedStatement stm = con.connect("DELETE\n"
                    + "FROM distributor\n"
                    + "WHERE kd_dist =?");
            stm.setInt(1, getKdDistributor());

            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CtrKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void ubahDistributor() {
        try {
            koneksi con = new koneksi();
            PreparedStatement stm = con.connect("UPDATE distributor\n"
                    + "SET \n"
                    +  "kd_dist = ?,\n"
                    + "  nama = ?,\n"
                    + "  alamat = ?,\n"
                    + "  telp = ?\n"
                    + "WHERE kd_dist = ?;");
            stm.setInt(1, getKdDistributor());
            stm.setString(2, getNama());
            stm.setString(3, getAlamat());
            stm.setString(4, getTelp());
stm.setInt(5, getKdDistributor());
            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CtrKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
