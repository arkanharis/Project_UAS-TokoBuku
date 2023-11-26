/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import java.util.ArrayList;

/**
 *
 * @author Willy Jonathan Arsyad
 */
public class Toko {
    private ArrayList<Item> daftarBarang;
    private String namaToko; 
    
    /**
     * Constructor untuk class Toko
     * @param namaToko nama toko alat tulis/toko buku
     */
    public Toko(String namaToko) {
        this.namaToko = namaToko;
        this.daftarBarang = new ArrayList<Item>();
    }

    /**
     * Method digunakan untuk mengubah nama toko
     * @param namaToko nama toko baru
     */
    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

    /**
     * Menambahkan barang yang akan di jual ke dalam array list
     * @param barangYangDijual
     */
    public void tambahDaftarBarang(Item barangYangDijual) {
        daftarBarang.add(barangYangDijual);
    }

    /**
     * Mengembalikan nama dari toko
     * @return nama toko
     */
    public String getNamaToko() {
        return namaToko;
    }

    /**
     * Menambilkan daftar barang yang dijual pada toko
     * beserta stok yang tersidia
     */
    public void displayDaftarBarang() {
        System.out.println("Daftar barang dan stok yang tersedia:");
        for (Item barangYangDijual : daftarBarang) {
            System.out.println(barangYangDijual.getJenis() + "    \t" + barangYangDijual.getStok());
        }
    }



}
