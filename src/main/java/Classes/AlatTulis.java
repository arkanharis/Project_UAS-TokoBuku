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

    @Override
    public double applyDiskon(double diskon) {
        double hargaSetelahDiskon = getHarga() - (getHarga() * diskon);
        return hargaSetelahDiskon;
    }

    @Override
    public String toString() {
        return super.toString() + "," + warna + "," + merk;
    }
    
    

//    public static void main(String[] args) {
//        AlatTulis pensil = new AlatTulis(3000, 20,"Pensil","Hitam", "Faber-Castell");
//        AlatTulis spidol = new AlatTulis(5000, 30, "Spidol", "Merah", "Sharpie");
//        AlatTulis pulpen = new AlatTulis(4000, 25, "Pulpen", "Biru", "Pilot");
//        AlatTulis penghapus = new AlatTulis(2000, 20, "Penghapus", "Putih", "Joyko");
//        AlatTulis penggaris = new AlatTulis(5000, 35, "Penggaris", "Kuning", "Butterfly");
//        AlatTulis marker = new AlatTulis(7000, 15, "Marker", "Hijau", "Copic");
//        AlatTulis stipo = new AlatTulis(6000, 25, "Stipo", "Merah", "Kenko");
//
//    System.out.println("Informasi Alat Tulis:");
//    System.out.println("Pensil - Warna: " + pensil.getWarna() + ", Merk: " + pensil.getMerk() + ", Harga: " + pensil.getHarga() + ", Stok: " + pensil.getStok());
//    System.out.println("Spidol - Warna: " + spidol.getWarna() + ", Merk: " + spidol.getMerk() + ", Harga: " + spidol.getHarga() + ", Stok: " + spidol.getStok());
//    System.out.println("Pulpen - Warna: " + pulpen.getWarna() + ", Merk: " + pulpen.getMerk() + ", Harga: " + pulpen.getHarga() + ", Stok: " + pulpen.getStok());
//    System.out.println("Penghapus - Warna: " + penghapus.getWarna() + ", Merk: " + penghapus.getMerk() + ", Harga: " + penghapus.getHarga() + ", Stok: " + penghapus.getStok());
//    System.out.println("Penggaris - Warna: " + penggaris.getWarna() + ", Merk: " + penggaris.getMerk() + ", Harga: " + penggaris.getHarga() + ", Stok: " + penggaris.getStok());
//    System.out.println("Marker - Warna: " + marker.getWarna() + ", Merk: " + marker.getMerk() + ", Harga: " + marker.getHarga() + ", Stok: " + marker.getStok());
//    System.out.println("Stipo - Warna: " + stipo.getWarna() + ", Merk: " + stipo.getMerk() + ", Harga: " + stipo.getHarga() + ", Stok: " + stipo.getStok());
//
//      // Penerapan Diskon
//    System.out.println("Harga pensil setelah diskon: " + pensil.applyDiskon(0.1)); // Diskon 10%
//    System.out.println("Harga spidol setelah diskon: " + spidol.applyDiskon(0.15)); // Diskon 15%
//      
//    }
}
