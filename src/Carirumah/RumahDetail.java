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
public class RumahDetail extends Rumah {
    // Atribut tambahan
    private String namaPemilik;
    private int tahunDibangun;

    // Constructor
    public RumahDetail(String alamat, int jumlahKamar, double luasBangunan, boolean memilikiGarasi,
                       String namaPemilik, int tahunDibangun) {
        super(alamat, jumlahKamar, luasBangunan, memilikiGarasi);
        this.namaPemilik = namaPemilik;
        this.tahunDibangun = tahunDibangun;
    }

    // Method Accessor
    public String getNamaPemilik() {
        return namaPemilik;
    }

    public int getTahunDibangun() {
        return tahunDibangun;
    }

    // Method Mutator
    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public void setTahunDibangun(int tahunDibangun) {
        this.tahunDibangun = tahunDibangun;
    }

    // Override 
    public String getInfo() {
        String info = super.getInfo() +
                "Nama Pemilik: " + namaPemilik + "" +
                "Tahun Dibangun: " + tahunDibangun + "";
        return info;
    }
}
