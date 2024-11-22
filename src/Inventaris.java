
import java.util.ArrayList;
import java.util.List;

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

    private List<Barang> daftarBarang;

    // Constructor
    public Inventaris() {
        daftarBarang = new ArrayList<>();
    }

    // Menambahkan barang
    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    // Menghapus barang
    public void hapusBarang(int index) {
        if (index >= 0 && index < daftarBarang.size()) {
            daftarBarang.remove(index);
        }
    }

    // Mengedit barang
    public void editBarang(int index, Barang barangBaru) {
        if (index >= 0 && index < daftarBarang.size()) {
            daftarBarang.set(index, barangBaru);
        }
    }

    // Mendapatkan semua barang
    public List<Barang> getDaftarBarang() {
        return daftarBarang;
    }

    // Mendapatkan barang berdasarkan index
    public Barang getBarang(int index) {
        if (index >= 0 && index < daftarBarang.size()) {
            return daftarBarang.get(index);
        }
        return null;
    }
}
