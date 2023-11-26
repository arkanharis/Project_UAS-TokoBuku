/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
    
    public void populateDaftarBarang() {
        try {
            FileInputStream file = new FileInputStream("../Databases/stokBarang.dat");
            ObjectInputStream inputFile = new ObjectInputStream(file);
            
            boolean endOfFile = false;
            
            while (!endOfFile) {
                try {
                    daftarBarang.add((Item) inputFile.readObject());
                }
                catch(EOFException e) {
                    endOfFile = true;
                }
                catch(Exception f) {
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
                
            }
            
            inputFile.close();
        }
        catch(IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
            
    }
    
    public void saveDaftarBarang() {
        try {
            FileOutputStream file2 = new FileOutputStream("../Databases/stokBarang.dat");
            ObjectOutputStream outputFile = new ObjectOutputStream(file2);
            
            for(int i = 0; i < daftarBarang.size(); i++) {
                outputFile.writeObject(daftarBarang.get(i));
            }
            
            outputFile.close();
            
            JOptionPane.showMessageDialog(null, "Daftar Barang Berhasil disimpan!");
        }
        catch(IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
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
