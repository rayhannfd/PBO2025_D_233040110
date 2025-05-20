package Tugas11;

// MotorListrik mewarisi Kendaraan dan mengimplementasikan Listrik
public class MotorListrik extends Kendaraan implements Listrik {
    public MotorListrik(String merk) {
        super(merk); // Memanggil konstruktor superclass
    }

    @Override
    public void nyalakan() {
        System.out.println("Motor listrik dinyalakan tanpa suara.");
    }

    @Override
    public void isiDaya() {
        System.out.println("Baterai sedang diisi daya...");
    }
}