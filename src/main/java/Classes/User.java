package Classes;
import java.util.ArrayList;

/**
 * Class user memiliki informasi seperti nama pengguna, kata sandi, saldo, ID, dam keranjang.
 *
 * @author Fadli Ahmad Yazid
 */
public class User {
    private String nama;
    private String password;
    private double saldo;
    private String id;
    private ArrayList<Item> keranjang;

    /**
     * Constructor untuk membuat objek User dengan informasi pengguna, termasuk nama pengguna, kata sandi,
     * saldo, ID, dan keranjang.
     *
     * @param nama     Nama pengguna.
     * @param password Kata sandi pengguna.
     * @param saldo    Saldo pengguna.
     * @param id       ID pengguna.
     */
    public User(String nama, String password, double saldo, String id) {
        this.nama = nama;
        this.password = password;
        this.saldo = saldo;
        this.id = id;
        this.keranjang = new ArrayList<>();
    }

    /**
     * Mendapatkan nama pengguna.
     *
     * @return Nama pengguna.
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengatur nama pengguna.
     *
     * @param nama Nama pengguna yang baru.
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Mendapatkan kata sandi pengguna.
     *
     * @return Kata sandi pengguna.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Mengatur kata sandi pengguna.
     *
     * @param password Kata sandi pengguna yang baru.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Mendapatkan saldo pengguna.
     *
     * @return Saldo pengguna.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Mengatur saldo pengguna.
     *
     * @param saldo Saldo pengguna yang baru.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Mendapatkan ID pengguna.
     *
     * @return ID pengguna.
     */
    public String getId() {
        return id;
    }

    /**
     * Mengatur ID pengguna.
     *
     * @param id ID pengguna yang baru.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Mendapatkan keranjang belanja pengguna.
     *
     * @return Keranjang belanja pengguna.
     */
    public ArrayList<Item> getKeranjang() {
        return keranjang;
    }

    /**
     * Menambahkan item ke keranjang belanja pengguna.
     *
     * @param item Item yang akan ditambahkan ke keranjang belanja.
     */
    public void addToKeranjang(Item item) {
        keranjang.add(item);
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%.2f,%s", getNama(),
                getPassword(), this.getSaldo(), getId());
    }
    
    
}
