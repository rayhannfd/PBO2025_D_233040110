package Tugas11;

// Tabung juga turunan dari Bentuk
public class Tabung extends Bentuk {
    private int tinggi;

    public Tabung(int jari2, int tinggi) {
        super(jari2);
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        // Menghitung luas permukaan tabung
        return 2 * PHI * jari2 * (jari2 + tinggi);
    }

    public double volume() {
        // Volume tabung = PHI * r^2 * t
        return PHI * jari2 * jari2 * tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
}