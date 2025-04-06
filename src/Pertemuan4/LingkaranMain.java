package Pertemuan4;

public class LingkaranMain {
    public static void main(String[] args) {
        // Referensi Objek >1 Variabel
        Lingkaran l1 = new Lingkaran(5); // Objek dengan referensi l1
        Lingkaran l2 = l1; // Referensi l2 mengacu ke objek yang sama dengan l1
        
        // Output sebelum perubahan
        System.out.println("Sebelum Perubahan:");
        System.out.println("l1.getJari(): " + l1.getJari()); // Output: 5
        System.out.println("l2.getJari(): " + l2.getJari()); // Output: 5
        
        l2.setJari(10); // Mengubah nilai melalui referensi l2
        
        // Output setelah perubahan
        System.out.println("Setelah Perubahan:");
        System.out.println("l1.getJari(): " + l1.getJari()); // Output: 10
        System.out.println("l2.getJari(): " + l2.getJari()); // Output: 10
    }
}