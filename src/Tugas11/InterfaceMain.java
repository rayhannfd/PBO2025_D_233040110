package Tugas11;

public class InterfaceMain {
    public static void main(String[] args) {
        // Membuat objek KartuElektronik dan memanggil method dari interface
        KartuElektronik kartu = new KartuElektronik();
        kartu.otentikasi("123456"); // Memanggil otentikasi dengan ID
        String hasil = kartu.encode("DataRahasia"); // Encode data
        System.out.println(hasil); // Menampilkan hasil enkripsi
    }
}