package Classes;

/**
 * Kelas yang merepresentasikan sebuah buku dan merupakan turunan dari kelas Item.
 */
public class Buku extends Item {

    // Atribut khusus untuk kelas Buku
    private String judul;
    private String pengarang;
    private int tahunTerbit;
    private String penerbit;
    private int ISBN;
    private int halaman;
    private String genre;

    /**
     * Konstruktor untuk kelas Buku.
     * 
     * @param harga         Harga buku.
     * @param stok          Jumlah stok buku.
     * @param jenis         Jenis item.
     * @param judul         Judul buku.
     * @param pengarang     Pengarang buku.
     * @param tahunTerbit   Tahun terbit
     * @param penerbit      Penerbit
     * @param ISBN          ISBN
     * @param halaman       Halaman buku
     * @param genre         Genre buku
     */
    public Buku(String jenis, int stok, double harga, String judul, String pengarang, 
                int tahunTerbit, String penerbit, int ISBN, int halaman, String genre) {
        super(jenis, stok, harga);
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.penerbit = penerbit;
        this.ISBN = ISBN;
        this.halaman = halaman;
        this.genre = genre;
    }

    /**
     * Getter untuk judul buku.
     * 
     * @return Judul buku.
     */
    public String getJudul() {
        return judul;
    }

    /**
     * Setter untuk judul buku.
     * 
     * @param judul Judul baru buku.
     */
    public void setJudul(String judul) {
        this.judul = judul;
    }

    /**
     * Getter untuk pengarang buku.
     * 
     * @return Pengarang buku.
     */
    public String getPengarang() {
        return pengarang;
    }

    /**
     * Setter untuk pengarang buku.
     * 
     * @param pengarang Pengarang baru buku.
     */
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    /**
     * Getter untuk tahun terbit buku.
     * 
     * @return Tahun terbit buku.
     */
    public int getTahunTerbit() {
        return tahunTerbit;
    }

    /**
     * Setter untuk tahun terbit buku.
     * 
     * @param tahunTerbit Tahun terbit baru buku.
     */
    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    /**
     * Getter untuk penerbit buku.
     * 
     * @return Penerbit buku.
     */
    public String getPenerbit() {
        return penerbit;
    }

    /**
     * Setter untuk penerbit buku.
     * 
     * @param penerbit Penerbit baru buku.
     */
    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    /**
     * Getter untuk ISBN buku.
     * 
     * @return ISBN buku.
     */
    public int getISBN() {
        return ISBN;
    }

    /**
     * Setter untuk ISBN buku.
     * 
     * @param iSBN ISBN baru buku.
     */
    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }

    /**
     * Getter untuk jumlah halaman buku.
     * 
     * @return Jumlah halaman buku.
     */
    public int getHalaman() {
        return halaman;
    }

    /**
     * Setter untuk jumlah halaman buku.
     * 
     * @param halaman Jumlah halaman baru buku.
     */
    public void setHalaman(int halaman) {
        this.halaman = halaman;
    }

    /**
     * Getter untuk genre buku.
     * 
     * @return Genre buku.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Setter untuk genre buku.
     * 
     * @param genre Genre baru buku.
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Mengaplikasikan diskon pada harga buku.
     * 
     * @param diskon Persentase diskon yang akan diterapkan.
     * @return Harga buku setelah diskon.
     */
    @Override
    public double applyDiskon(double diskon) {
        double hargaSetelahDiskon = getHarga() - (getHarga() * diskon);
        return hargaSetelahDiskon;
    }

    @Override
    public String toString() {
        return String.format("%s,%d,%.2f,%s,%s,%s,%d,%d,%s",
                             getJenis(), getStok(), getHarga(), getJudul(),
                             getPengarang(), getPenerbit(), getISBN(),
                             getHalaman(), getGenre());
    }
    
    
}
