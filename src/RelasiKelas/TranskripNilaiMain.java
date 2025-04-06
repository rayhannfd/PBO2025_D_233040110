package RelasiKelas;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        mahasiswa mahasiswa = new mahasiswa("233040110", "Raihan Fadhil Hibatullah", "Teknik Informatika");

        Dosen dosen1 = new Dosen("001", "Pak Siroj Nur Ulum");
        Dosen dosen2 = new Dosen("002", "Pak Fajar Darmawan");
        Dosen dosen3 = new Dosen("003", "Pak Ilham");

        KartuHasilStudi khs = new KartuHasilStudi();

        Matakuliah mk1 = new Matakuliah("IF101", "Pemrograman Berorientasi Objek", 3, dosen1);
        Matakuliah mk2 = new Matakuliah("IF102", "Interaksi Manusia dan Komputer", 3, dosen2);
        Matakuliah mk3 = new Matakuliah("IF103", "Sistem Manajemen Basis Data", 3, dosen3);

        khs.tambahMatakuliah(mk1);
        khs.tambahMatakuliah(mk2);
        khs.tambahMatakuliah(mk3);

        TranskripNilai transkripNilai = new TranskripNilai(mahasiswa, khs, 4);

        System.out.println("Data Mahasiswa:");
        System.out.println("NIM     : " + transkripNilai.getMahasiswa().getNim());
        System.out.println("Nama    : " + transkripNilai.getMahasiswa().getNama());
        System.out.println("Jurusan : " + transkripNilai.getMahasiswa().getJurusan());
        System.out.println("Semester: " + transkripNilai.getSemester());

        System.out.println("\nDaftar Mata Kuliah:");
        for (Matakuliah mk : transkripNilai.getKartuHasilStudi().getDaftarMatakuliah()) {
            System.out.println("- " + mk.getKode() + " " + mk.getNama() + " (" + mk.getSks() + " SKS), Dosen: " + mk.getDosenPengampu().getNama());
        }

        System.out.println("\nIPK: " + transkripNilai.hitungIPK());
    }
}
