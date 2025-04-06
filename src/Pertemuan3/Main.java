package Pertemuan3;

public class Main{

    public static void main(String[] args) {
        // Membuat objek lingkaran dengan jari-jari 7
        lingkaran l1 = new lingkaran(7);
        
        // Menghitung dan menampilkan luas lingkaran
        System.out.println("Luas Lingkaran dengan jari-jari 7: " + l1.hitungLuas());

        // Contoh lain dengan jari-jari berbeda
        lingkaran l2 = new lingkaran(10);
        System.out.println("Luas Lingkaran dengan jari-jari 10: " + l2.hitungLuas());
    }
}
