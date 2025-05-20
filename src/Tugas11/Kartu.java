package Tugas11;

// Interface Kartu berisi method abstrak (tanpa isi) yang harus diimplementasikan oleh kelas lain
public interface Kartu {
    void otentikasi(String id);       // Method untuk autentikasi kartu berdasarkan ID
    String encode(String data);       // Method untuk mengenkripsi data
}
