package Pertemuan13;

public class MainKendaraan {
   public static void main(String[] args) {
	   
	   Kendaraan k1 = new Mobil ("Lexus RX 350");
	   Kendaraan k2 = new Motor ("Nmax 155 Old Gen 2");
	   
	   k1.jalan();
	   k1.bensin();
	  
	   k2.jalan();
	   k2.bensin();
   	}
}