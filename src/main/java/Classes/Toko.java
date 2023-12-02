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
    private ArrayList<Item> daftarBarang;
    private String namaToko; 
    private final String directory = "src/main/java/Databases";
    private final String fileName = "stokBarang.txt";
    Path filePath = FileSystems.getDefault().getPath(directory, fileName);
    
    
    /**
     * Constructor untuk class Toko
     * @param namaToko nama toko alat tulis/toko buku
     */
    public Toko() {
        this.namaToko = "Book`s Mart";
        this.daftarBarang = new ArrayList<>();
        this.populateDaftarBarang();
    }
    
    public void populateDaftarBarang() {
        try(BufferedReader reader = new BufferedReader(
            new FileReader(filePath.toString()))) {
            String line;

            while((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");

                if(tokens.length == 10) {
                    Buku buku = new Buku(tokens[0].trim(), Integer.parseInt(tokens[1]),
                            Double.parseDouble(tokens[2]), tokens[3].trim(),
                            tokens[4].trim(), Integer.parseInt(tokens[5]), 
                            tokens[6].trim(), Integer.parseInt(tokens[7]),
                    Integer.parseInt(tokens[8]), tokens[9].trim());

                    daftarBarang.add(buku);
                } 
                else if (tokens.length == 5) {
                    AlatTulis alatTulis = new AlatTulis(tokens[0].trim(),
                            Integer.parseInt(tokens[1]),
                            Double.parseDouble(tokens[2]), tokens[3].trim(),
                            tokens[4].trim());

                    daftarBarang.add(alatTulis);
                }
            }
            reader.close();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
            
    }
    
    public void saveDaftarBarang() {
        try (BufferedWriter writer = new BufferedWriter(
            new FileWriter(filePath.toString()))) {
            
            for(Item line: daftarBarang) {
                writer.write(line.toString());
                writer.newLine();
            }
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

    public ArrayList<Item> getDaftarBarang() {
        return daftarBarang;
    }
    
}
