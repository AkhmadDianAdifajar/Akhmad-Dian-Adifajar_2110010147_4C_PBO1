/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carirumah;

/**
 *
 * @author asus
 */
public class Rumah {
    // Atribut
    private String alamat;
    private int jumlahKamar;
    private double luasBangunan;
    private boolean memilikiGarasi;

    // Constructor
    public Rumah(String alamat, int jumlahKamar, double luasBangunan, boolean memilikiGarasi) {
        this.alamat = alamat;
        this.jumlahKamar = jumlahKamar;
        this.luasBangunan = luasBangunan;
        this.memilikiGarasi = memilikiGarasi;
    }

    // Method Accessor
    public String getAlamat() {
        return alamat;
    }

    public int getJumlahKamar() {
        return jumlahKamar;
    }

    public double getLuasBangunan() {
        return luasBangunan;
    }

    public boolean memilikiGarasi() {
        return memilikiGarasi;
    }

    // Method Mutator
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setJumlahKamar(int jumlahKamar) {
        this.jumlahKamar = jumlahKamar;
    }

    public void setLuasBangunan(double luasBangunan) {
        this.luasBangunan = luasBangunan;
    }

    public void setMemilikiGarasi(boolean memilikiGarasi) {
        this.memilikiGarasi = memilikiGarasi;
    }

    // Method 
    public String getInfo() {
        String info = "Alamat: " + alamat + ""
                + "Jumlah Kamar: " + jumlahKamar + ""
                + "Luas Bangunan: " + luasBangunan + ""
                + "Memiliki Garasi: " + (memilikiGarasi ? "Ya" : "Tidak") + "";
        return info;
    }
}
