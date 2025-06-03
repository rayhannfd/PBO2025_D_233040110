package TugasFinalStatic;

public class TestMahasiswa {
	public static void main(String[] args) {
		Mahasiswa m1 = new Mahasiswa("233040110", "Raihan Fadhil Hibatullah");
		Mahasiswa m2 = new Mahasiswa("233040126", "Indira Putri Seruni");
	
	m1.displayInfo();
	System.out.println();
	m2.displayInfo();
	
	System.out.println("\nTotal Mahasiswa Yang Terdaftar: " + Mahasiswa.getTotalMahasiswa());
	}
}