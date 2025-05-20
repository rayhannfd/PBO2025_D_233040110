package Tugas11;

// KartuElektronik mengimplementasikan interface Kartu
public class KartuElektronik implements Kartu {
    private String id;

    @Override
    public void otentikasi(String id) {
        this.id = id;
        System.out.println("Kartu berhasil diotentikasi dengan ID: " + id);
    }

    @Override
    public String encode(String data) {
        // Mengubah data dengan cara membalik string
        String encoded = new StringBuilder(data).reverse().toString();
        return "Data terenkripsi: " + encoded;
    }
}
