package Pertemuan3;

public class lingkaran {

    double jari;
    double phi;

    // Constructor
    public lingkaran(double jari) {
        this.jari = jari;
        this.phi = 3.14;
    }

    // Method untuk menghitung luas
    public double hitungLuas() {
        return phi * jari * jari;
    }
    
    // Main method untuk melakukan testing
    public static void main(String[] args) {
        lingkaran ling = new lingkaran(1); // Contoh jari-jari 7
        System.out.println("Luas Lingkaran: " + ling.hitungLuas());
    }
}
