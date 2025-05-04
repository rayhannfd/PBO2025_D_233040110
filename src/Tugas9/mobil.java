package Tugas9;

public class mobil extends kendaraan {
    protected int bensin;

    public mobil(String merk, int tahunProduksi, int bensin) {
        super(merk, tahunProduksi);
        this.bensin = bensin;
    }

    protected void tampilMobil() {
        tampilInfo();
        System.out.println("Bensin: " + bensin + " liter");
    }
    
    protected void isiBensin(int liter) {
        bensin += liter;
        System.out.println("Bensin ditambah " + liter + " liter. Total: " + bensin + " liter.");
    }

    protected void berjalan() {
        if (bensin > 0) {
            System.out.println("Mobil berjalan.");
            bensin -= 1;
        } else {
            System.out.println("Bensin habis. Tidak bisa berjalan.");
        }
    }
}