package Tugas11;

public class MainKendaraan {
    public static void main(String[] args) {
        // Membuat objek MotorListrik
        MotorListrik motor = new MotorListrik("Viar Q1");
        motor.info();         // Menampilkan merk
        motor.nyalakan();     // Menyalakan motor
        motor.isiDaya();      // Mengisi daya baterai
    }
}