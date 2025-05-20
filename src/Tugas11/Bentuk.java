package Tugas11;

// Kelas abstrak Bentuk berisi satu method abstrak luas()
public abstract class Bentuk {
    protected double PHI = 3.14;
    protected int jari2;

    public Bentuk(int jari2) {
        this.jari2 = jari2;
    }

    public abstract double luas(); // Method abstrak yang harus diimplementasi oleh subclass

    public int getJari2() {
        return jari2;
    }

    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }
}