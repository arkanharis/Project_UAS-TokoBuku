package Classes;

public abstract class Item {
    private double harga;
    private int stok;
    private String jenis;

    public Item(double harga, int stok, String jenis) {
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
}

