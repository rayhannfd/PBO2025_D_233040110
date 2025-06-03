package Pertemuan13;

class Motor extends Kendaraan {
	
	String merk;
	
	Motor (String merk) {
		this.merk = merk;
	}
	
    void jalan() {
        System.out.println("Motor " + merk + " Sedang Wheelie");
    }
    
    void bensin () {
    	System.out.println ("Motor " + merk + " Pakai Bensin Dengan Oktan 92");
    }
}