package Tugas4;

public class DaurHidupObjek {
    public static void main(String[] args) {
        // Penciptaan objek menggunakan konstruktor
        Lingkaran l = new Lingkaran(5);
        System.out.println("Jari-jari: " + l.getJari2());

        // Objek dihapus oleh Garbage Collection ketika tidak direferensi lagi
        l = null;
        System.gc(); // Memanggil Garbage Collector (tidak menjamin langsung dihapus)
    }
}

class Lingkaran {
    private int jari2;

    public Lingkaran(int jari2) {
        this.jari2 = jari2;
    }

    public int getJari2() {
        return jari2;
    }

    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }
}