/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.FileSystems;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Willy Jonathan Arsyad
 */
public class Toko {
    private ArrayList<String> daftarBarang;
    private String namaToko; 
    private final String directory = "../Databases";
    private final String fileName = "stokBarang";
    Path filePath = FileSystems.getDefault().getPath(directory, fileName);

    
    /**
     * Constructor untuk class Toko
     * @param namaToko nama toko alat tulis/toko buku
     */
    public Toko(String namaToko) {
        this.namaToko = namaToko;
        this.daftarBarang = new ArrayList<>();
    }
    
    public void populateDaftarBarang() {
//        try {
        try(BufferedReader reader = new BufferedReader(
                new FileReader(filePath.toString()))) {
            String line;

            while((line = reader.readLine()) != null) {
                daftarBarang.add(line);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
//                    
//            FileInputStream file = new FileInputStream("../Databases/stokBarang.dat");
//            ObjectInputStream inputFile = new ObjectInputStream(file);
//            
//            boolean endOfFile = false;
//            
//            while (!endOfFile) {
//                try {
//                    daftarBarang.add((Item) inputFile.readObject());
//                }
//                catch(EOFException e) {
//                    endOfFile = true;
//                }
//                catch(Exception f) {
//                    JOptionPane.showMessageDialog(null, f.getMessage());
//                }
//                
//            }
//            
//            inputFile.close();
//        }
//        catch(IOException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
            
    }
    
    public void saveDaftarBarang() {
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(filePath.toString()))) {
            
            for(String line: daftarBarang) {
                writer.write(line);
                writer.newLine();
            }
        }
        catch(IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
   
        }
        
//        try {
//            FileOutputStream file2 = new FileOutputStream("../Databases/stokBarang.dat");
//            ObjectOutputStream outputFile = new ObjectOutputStream(file2);
//            
//            for(int i = 0; i < daftarBarang.size(); i++) {
//                outputFile.writeObject(daftarBarang.get(i));
//            }
//            
//            outputFile.close();
//            
//            JOptionPane.showMessageDialog(null, "Daftar Barang Berhasil disimpan!");
//        }
//        catch(IOException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
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
    public void tambahDaftarBarang(String barangYangDijual) {
        daftarBarang.add(barangYangDijual);
    }

    /**
     * Mengembalikan nama dari toko
     * @return nama toko
     */
    public String getNamaToko() {
        return namaToko;
    }


}
