/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Barang {
    private String id;
    private String nama;
    private int jumlah;
    private double harga;

    // Constructor
    public Barang(String id, String nama, int jumlah, double harga) {
        this.id = id;
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    // Getter dan Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return id + " - " + nama + " - " + jumlah + " - " + harga;
    }
}
