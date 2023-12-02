package Classes;

public abstract class Item {
    private double harga;
    private int stok;
    private String jenis;

    public Item(String jenis, int stok, double harga) {
        this.harga = harga;
        this.stok = stok;
        this.jenis = jenis;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public abstract double applyDiskon(double diskon);
    
    public abstract double applyDiskon();

    public String getDescBarang() {
        return  String.format("%s    \t\t\t %d    \t\t\t %.2f", getJenis(),
                getStok(), getHarga());
    }
    
    public String getKeranjangBarang() {
        return String.format("%-50s %50.2f", getJenis(), getHarga());
//        return  String.format("%s    \t\t\t\t\t %.2f", getJenis(), getHarga());
    }

    
    /**
     * return string formating for item
     * @return
     */
    @Override
    public abstract String toString();
}

