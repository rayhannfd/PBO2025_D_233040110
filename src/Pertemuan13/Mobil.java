package Pertemuan13;

class Mobil extends Kendaraan {
	
	String merk;
	
	Mobil (String merk) {
		this.merk = merk;
	}
	
    void jalan() {
        System.out.println("Mobil " + merk + " Mobil Ini Sedang Jalan Santai");
    }
    
    void bensin () {
    	System.out.println("Mobil " + merk + " Mobil Ini Menggunakan Bensin Dengan Oktan Minimal 92");
    }
}