
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Inventaris {
    private ArrayList<Barang> daftarBarang;

    public Inventaris() {
        this.daftarBarang = new ArrayList<>();
    }

    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    public void hapusBarang(String idBarang) {
        daftarBarang.removeIf(barang -> barang.getIdBarang().equals(idBarang));
    }

    public void tampilkanBarang() {
        for (Barang barang : daftarBarang) {
            System.out.println("ID: " + barang.getIdBarang() + 
                               ", Nama: " + barang.getNamaBarang() + 
                               ", Jumlah: " + barang.getJumlah() + 
                               ", Harga: " + barang.getHarga());
        }
    }
}
