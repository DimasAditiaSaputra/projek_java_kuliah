package datas;

public class Mangga implements Buah{
    private String kode;
    private String namaBuah;
    private double harga;

    // Constructor
    public Mangga(String kode, String namaBuah, double harga) {
        this.kode = kode;
        this.namaBuah = namaBuah;
        this.harga = harga;
    }

    // Getter methods
    @Override
    public String getKode() {
        return kode;
    }

    @Override
    public String getNamaBuah() {
        return namaBuah;
    }

    @Override
    public double getHarga() {
        return harga;
    }
}
