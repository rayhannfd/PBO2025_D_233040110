package RelasiKelas;
import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private List<Matakuliah> daftarMatakuliah;

    public KartuHasilStudi() {
        daftarMatakuliah = new ArrayList<>();
    }

    public void tambahMatakuliah(Matakuliah mk) {
        daftarMatakuliah.add(mk);
    }

    public List<Matakuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }
}