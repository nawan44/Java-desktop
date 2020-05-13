/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Asus
 */
public class Distributor {
     public int kdDistributor;
    public String nama;
    public String alamat;
    public String telp;

    public int getKdDistributor() {
        return kdDistributor;
    }

    public void setKdDistributor(int kdDistributor) {
        this.kdDistributor = kdDistributor;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }
   
}
