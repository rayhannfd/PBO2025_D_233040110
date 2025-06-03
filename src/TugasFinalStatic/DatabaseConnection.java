package TugasFinalStatic;

///TUGAS 4
public class DatabaseConnection {
	public static String connectionString;
	
	static {
		connectionString = "http://localhost:3028/phpmyadmin/";
		System.out.println("Inisialisasi Berhasil");
	}
	

}
