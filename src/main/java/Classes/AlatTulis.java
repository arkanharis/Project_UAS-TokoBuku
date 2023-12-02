/**
 * Kelas AlatTulis ini merupakan turunan dari kelas Item.
 * Kelas ini digunakan untuk merepresentasikan berbagai alat tulis dengan atribut
 * seperti warna dan merk, serta memiliki fungsi penerapan diskon.
 *
 * @author widyanurulsukma
 */

package Classes;

public class AlatTulis extends Item{
    private String warna;
    private String merk;

    // Constructor
    public AlatTulis(String jenis, int stok, double harga, String warna, String merk) {
        super(jenis, stok, harga);
        this.warna = warna;
        this.merk = merk;
    }

    // Method untuk mendapatkan nilai warna
    public String getWarna() {
        return warna;
    }

    // Method untuk mengatur nilai warna
    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Method untuk mendapatkan nilai merk
    public String getMerk() {
        return merk;
    }

    // Method untuk mengatur nilai merk
    public void setMerk(String merk) {
        this.merk = merk;
    }

    /**
     *
     * @param diskon
     * @return
     */
    @Override
    public double applyDiskon(double diskon) {
        double hargaSetelahDiskon = getHarga() - (getHarga() * diskon);
        return hargaSetelahDiskon;
    }
    
    /**
     * Mengaplikasikan diskon pada harga buku.
     *
     * @return Harga buku setelah diskon.
     */
    @Override
    public double applyDiskon() {
        double diskon = 0.01;
        return this.applyDiskon(diskon);
    }

    @Override
    public String toString() {
        return String.format("%s,%d,%.2f,%s,%s",
                             getJenis(), getStok(), getHarga(),
                             getWarna(), getMerk());
    }

}
