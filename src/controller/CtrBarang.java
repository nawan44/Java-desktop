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
import model.Barang;
import model.Parameter;
import model.koneksi;

/**
 *
 * @author nawan44
 */
public class CtrBarang extends Barang {

    Parameter param;

    public Parameter getParam() {
        return param;
    }

    public CtrBarang() {
        param = new Parameter();

    }

    public TableModel getDaftarBarang() {
        try {
            koneksi con = new koneksi();
            PreparedStatement stm = con.connect("SELECT\n"
                    + "  kd_barang,\n"
                    + "  merk_barang,\n"
                    + "  UOM,\n"
                    + "  harga_jual,\n"
                    + "  nm_jns,\n"
                    + "  nm_gol,\n"
                    + "  nm_kel,\n"
                    + "  nm_bent,\n"
                    + "  nm_jns_obat\n"
                    + "FROM daftar_barang AS db LEFT JOIN par_jns_brng AS pj\n"
                    + "ON db.kd_jns = pj.kd_jns LEFT JOIN par_gol AS pg\n"
                    + "ON db.kd_gol= pg.kd_gol LEFT JOIN par_kel_usia AS pk\n"
                    + "ON db.kd_kel = pk.kd_kel LEFT JOIN par_bent AS pb\n"
                    + "ON db.kd_bent = pb.kd_bent LEFT JOIN par_jns_obat AS pjo\n"
                    + "ON db.kd_jns_obat = pjo.kd_jns_obat\n"
                    + "ORDER BY db.kd_barang");
            ResultSet rs = stm.executeQuery();

            DefaultTableModel mdlBarang = new DefaultTableModel();
            mdlBarang.addColumn("Kode Barang");
            mdlBarang.addColumn("Merk Barang");
            mdlBarang.addColumn("Satuan");
            mdlBarang.addColumn("Harga");
            mdlBarang.addColumn("Jenis");
            mdlBarang.addColumn("Golongan");
            mdlBarang.addColumn("Kelompok");
            mdlBarang.addColumn("Bentuk");
            mdlBarang.addColumn("Jenis Obat");

            Object[] ok;
            while (rs.next()) {
                ok = new Object[9];
                ok[0] = rs.getInt("kd_barang");
                ok[1] = rs.getString("merk_barang");
                ok[2] = rs.getString("UOM");
                ok[3] = rs.getString("harga_jual");
                ok[4] = rs.getString("nm_jns");
                ok[5] = rs.getString("nm_gol");
                ok[6] = rs.getString("nm_kel");
                ok[7] = rs.getString("nm_bent");
                ok[8] = rs.getString("nm_jns_obat");

                mdlBarang.addRow(ok);
            }
            return mdlBarang;
        } catch (SQLException ex) {
            Logger.getLogger(CtrBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int getParGol(String gol) {
        try {
            koneksi con = new koneksi();
            PreparedStatement stm = con.connect("SELECT\n"
                    + " kd_gol,\n"
                    + " nm_gol\n"
                    + "from par_gol\n"
                    + "WHERE nm_gol=?;");
            stm.setString(1, gol);
            ResultSet rs = stm.executeQuery();
            Integer kodeGol = null;
            Object os;
            while (rs.next()) {
                kodeGol = rs.getInt("kd_gol");
            }
            return kodeGol;

        } catch (SQLException ex) {
            Logger.getLogger(CtrBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int getParJnsObat(String jenisObat) {
        try {
            koneksi con = new koneksi();
            PreparedStatement stm = con.connect("SELECT\n"
                    + " kd_jns_obat,\n"
                    + " nm_jns_obat\n"
                    + "FROM par_jns_obat\n"
                    + "WHERE nm_jns_obat =?");
            stm.setString(1, jenisObat);
            ResultSet rs = stm.executeQuery();
            Integer kodeJnsObat = null;
            Object os;
            while (rs.next()) {
                kodeJnsObat = rs.getInt("kd_jns_obat");
            }
            return kodeJnsObat;

        } catch (SQLException ex) {
            Logger.getLogger(CtrBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public void tambahBarang() {
        try {
            koneksi con = new koneksi();
            PreparedStatement stm = con.connect("INSERT INTO daftar_barang\n"
                    + "            (merk_barang,\n"
                    + "             UOM,\n"
                    + "             harga_jual,\n"
                    + "             kd_jns,\n"
                    + "             kd_gol,\n"
                    + "             kd_kel,\n"
                    + "             kd_bent,\n"
                    + "             kd_jns_obat)\n"
                    + "VALUES (?,?,?,?,?,?,?,?);");
            stm.setString(1, getMerk());
            stm.setString(2, getUom());
            stm.setDouble(3, getHarga());
            stm.setInt(4, getParam().getKd_jns());
            stm.setInt(5, getKd_gol());
            stm.setInt(6, getKd_kel());
            stm.setInt(7, getParam().getKd_bent());
            stm.setInt(8, getKd_jns_obat());
            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CtrBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getParKel(String kel) {
        try {
            koneksi con = new koneksi();
            PreparedStatement stm = con.connect("SELECT\n"
                    + "  kd_kel,\n"
                    + "  nm_kel\n"
                    + "FROM par_kel_usia\n"
                    + "WHERE nm_kel=?;");
            stm.setString(1, kel);
            ResultSet rs = stm.executeQuery();
            Integer kodeKel = null;
            Object os;
            while (rs.next()) {
                kodeKel = rs.getInt("kd_kel");
            }
            return kodeKel;

        } catch (SQLException ex) {
            Logger.getLogger(CtrBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public void ubahBarang() {
        try {
            koneksi con = new koneksi();
            PreparedStatement stm = con.connect("UPDATE apotek14.daftar_barang\n"
                    + "SET kd_barang = 'kd_barang',\n"
                    + "  merk_barang = 'merk_barang',\n"
                    + "  UOM = 'UOM',\n"
                    + "  harga_jual = 'harga_jual',\n"
                    + "  kd_jns = 'kd_jns',\n"
                    + "  kd_gol = 'kd_gol',\n"
                    + "  kd_kel = 'kd_kel',\n"
                    + "  kd_bent = 'kd_bent',\n"
                    + "  kd_jns_obat = 'kd_jns_obat',\n"
                    + "  stok = 'stok'\n"
                    + "WHERE kd_barang = '?';");
            stm.setString(1, getMerk());
            stm.setString(2, getUom());
            stm.setDouble(3, getHarga());
            stm.setInt(4, getParam().getKd_jns());
            stm.setInt(5, getKd_gol());
            stm.setInt(6, getKd_kel());
            stm.setInt(7, getParam().getKd_bent());
            stm.setInt(8, getKd_jns_obat());
            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CtrBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
