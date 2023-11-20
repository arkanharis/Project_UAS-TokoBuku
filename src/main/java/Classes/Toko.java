/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import java.util.Arrays;
import java.util.ArrayList;

/**
 *
 * @author giant
 */
public class Toko {
    private ArrayList<Item> daftarBarang;
    private String namaToko; 
    
    public Toko(String namaToko) {
        this.namaToko = namaToko;
        this.daftarBarang = new ArrayList<Item>();
    }

    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

    public void tambahDaftarBarang(Item barangYangDijual) {
        daftarBarang.add(barangYangDijual);
    }

    public String getNamaToko() {
        return namaToko;
    }

    public void displayDaftarBarang() {
        System.out.println("Daftar barang yang tersedia:");
        for (Item barangYangDijual : daftarBarang) {
            System.out.println(barangYangDijual);   // to-do customize print depending on item parent class 
        }
    }



}
