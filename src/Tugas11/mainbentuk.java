package Tugas11;

public class mainbentuk {
    public static void main(String[] args) {
        // Membuat objek lingkaran
        Lingkaran lingkaran = new Lingkaran(7);
        System.out.println("Luas Lingkaran = " + lingkaran.luas());

        // Membuat objek tabung
        Tabung tabung = new Tabung(7, 10);
        System.out.println("Luas Tabung = " + tabung.luas());
        System.out.println("Volume Tabung = " + tabung.volume()); // Pastikan method volume() sudah ditambahkan
    }
}