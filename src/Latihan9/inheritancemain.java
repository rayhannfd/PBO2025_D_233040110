package Latihan9;

public class inheritancemain {
    public static void main(String[] args) {
        mahasiswa mhs = new mahasiswa("Jasmine", "Bandung");
        mhs.setNrp("321654");

        System.out.println("Nama: " + mhs.nama);
        System.out.println("Alamat: " + mhs.alamat);
        System.out.println("NRP: " + mhs.getNrp());
    }
}