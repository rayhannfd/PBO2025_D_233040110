package RelasiKelas;

public class TranskripNilai {
    private mahasiswa mahasiswa;
    private KartuHasilStudi kartuHasilStudi;
    private int semester;

    public TranskripNilai(mahasiswa mahasiswa, KartuHasilStudi kartuHasilStudi, int semester) {
        this.mahasiswa = mahasiswa;
        this.kartuHasilStudi = kartuHasilStudi;
        this.semester = semester;
    }

    public mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public KartuHasilStudi getKartuHasilStudi() {
        return kartuHasilStudi;
    }

    public int getSemester() {
        return semester;
    }

    public double hitungIPK() {
        return 0.0; 
    }
}