package Tugas9;

public class kendaraan {
    protected String merk;
    protected int tahunProduksi;

    public kendaraan(String merk, int tahunProduksi) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }

    protected void tampilInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }

    protected void nyalakanMesin() {
        System.out.println("Mesin kendaraan dinyalakan.");
    }

    protected void matikanMesin() {
        System.out.println("Mesin kendaraan dimatikan.");
    }
}
