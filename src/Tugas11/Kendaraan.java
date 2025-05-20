package Tugas11;

// Kelas abstrak Kendaraan mewakili kendaraan umum dengan method abstrak nyalakan()
public abstract class Kendaraan {
    protected String merk;

    public Kendaraan(String merk) {
        this.merk = merk;
    }

    public abstract void nyalakan(); // Method abstrak yang wajib diimplementasikan oleh turunan

    public void info() {
        System.out.println("Merk kendaraan: " + merk); // Method konkret
    }
}