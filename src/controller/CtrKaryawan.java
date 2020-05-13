/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Karyawan;
import model.koneksi;

/**
 *
 * @author nawan44
 */
public class CtrKaryawan extends Karyawan {

    public TableModel getDaftarKaryawan() {
        try {
            koneksi con = new koneksi();
            PreparedStatement stm = con.connect(""
                    + "SELECT\n"
                    + "  kd_karyawan,\n"
                    + "  username,\n"
                    + "  PASSWORD,\n"
                    + "  nama,\n"
                    + "  jabatan\n"
                    + "FROM karyawan");
            ResultSet rs = stm.executeQuery();

            DefaultTableModel mdlKaryawan = new DefaultTableModel();
            mdlKaryawan.addColumn("Kode Karyawan");
            mdlKaryawan.addColumn("Username");
            mdlKaryawan.addColumn("Password");
            mdlKaryawan.addColumn("Nama Lengkap");
            mdlKaryawan.addColumn("Jabatan");

            Object[] ok;
            while (rs.next()) {
                ok = new Object[5];
                ok[0] = rs.getInt("kd_karyawan");
                ok[1] = rs.getString("username");
                ok[2] = rs.getString("PASSWORD");
                ok[3] = rs.getString("nama");
                ok[4] = rs.getString("jabatan");
                mdlKaryawan.addRow(ok);
            }
            return mdlKaryawan;
        } catch (SQLException ex) {
            Logger.getLogger(CtrKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public TableModel getCariKaryawan(String uname) {
        try {
            koneksi con = new koneksi();
            PreparedStatement stm = con.connect("SELECT\n"
                    + "  kd_karyawan,\n"
                    + "  username,\n"
                    + "  PASSWORD,\n"
                    + "  nama,\n"
                    + "  jabatan\n"
                    + "FROM karyawan\n"
                    + "WHERE username LIKE ?");
            stm.setString(1, "%" + uname + "%");
            ResultSet rs = stm.executeQuery();

            DefaultTableModel mdlKaryawan = new DefaultTableModel();
            mdlKaryawan.addColumn("Kode Karyawan");
            mdlKaryawan.addColumn("Username");
            mdlKaryawan.addColumn("Password");
            mdlKaryawan.addColumn("Nama Lengkap");
            mdlKaryawan.addColumn("Jabatan");

            Object[] ok;
            while (rs.next()) {
                ok = new Object[5];
                ok[0] = rs.getInt("kd_karyawan");
                ok[1] = rs.getString("username");
                ok[2] = rs.getString("PASSWORD");
                ok[3] = rs.getString("nama");
                ok[4] = rs.getString("jabatan");
                mdlKaryawan.addRow(ok);
            }
            return mdlKaryawan;
        } catch (SQLException ex) {
            Logger.getLogger(CtrKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public void tambahKaryawan() {
        try {
            koneksi con = new koneksi();
            PreparedStatement stm = con.connect("INSERT INTO karyawan\n"
                    + "            (username,\n"
                    + "             PASSWORD,\n"
                    + "             nama,\n"
                    + "             jabatan)\n"
                    + "VALUES (?,?,?,?);");
            stm.setString(1, getUsername());
            stm.setString(2, getPwd());
            stm.setString(3, getNama());
            stm.setString(4, getJabatan());

            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CtrKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void hapusKaryawan() {
        try {
            koneksi con = new koneksi();
            PreparedStatement stm = con.connect("DELETE\n"
                    + "FROM karyawan\n"
                    + "WHERE kd_karyawan = ?;");
            stm.setInt(1, getKdKaryawan());

            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CtrKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void ubahKaryawan() {
        try {
            koneksi con = new koneksi();
            PreparedStatement stm = con.connect(" UPDATE karyawan\n"
                    + "SET \n"
                    + "  username = ?,\n"
                    + "  PASSWORD = ?,\n"
                    + "  nama = ?,\n"
                    + "  jabatan = ?\n"
                    + "WHERE kd_karyawan = ?;");
            stm.setString(1, getUsername());
            stm.setString(2, getPwd());
            stm.setString(3, getNama());
            stm.setString(4, getJabatan());
            stm.setInt(5, getKdKaryawan());

            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CtrKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String cekLogin() {
        try {
            koneksi con = new koneksi();
            PreparedStatement stm = con.connect("SELECT\n"
                    + "  kd_karyawan,\n"
                    + "  username,\n"
                    + "  PASSWORD,\n"
                    + "  nama,\n"
                    + "  jabatan\n"
                    + "FROM apotek14.karyawan\n"
                    + "WHERE username = ? AND PASSWORD =?;");
            stm.setString(1, getUsername());
            stm.setString(2, getPwd());
          ResultSet rs = stm.executeQuery();
          if(rs.next()){
              return "sukses";
                      }else{
              return "gagal";
          }

        } catch (SQLException ex) {
            Logger.getLogger(CtrKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "gagal";
    }

}
