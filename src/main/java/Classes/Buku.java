package Classes;

public class Buku extends Item{
    private String judul;
    private String pengarang;
    private int tahunTerbit;
    private String penerbit;
    private int ISBN;
    private int halaman;
    private String genre;

    public Buku(double harga, int stok, String jenis, String judul, String pengarang){
        super(harga, stok, jenis);
        this.judul=judul;
        this.pengarang=pengarang;
    }
    
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    } 

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }

    public int getHalaman() {
        return halaman;
    }

    public void setHalaman(int halaman) {
        this.halaman = halaman;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public double applyDiskon(double diskon) {
        double hargaSetelahDiskon = getHarga() - (getHarga() * diskon);
        return hargaSetelahDiskon;
    }
}
