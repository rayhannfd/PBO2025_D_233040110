package Tugas11;

// lingkaran adalah turunan dari Bentuk
public class Lingkaran extends Bentuk {
    public Lingkaran(int jari2) {
        super(jari2); // Memanggil konstruktor Bentuk
    }

    @Override
    public double luas() {
        // Mengimplementasikan method luas dari kelas abstrak Bentuk
        return PHI * jari2 * jari2;
    }
}