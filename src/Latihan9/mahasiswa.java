package Latihan9;

public class mahasiswa extends orang {
    protected String nrp;

    public mahasiswa(String nama, String alamat) {
        super(nama, alamat);
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getNrp() {
        return nrp;
    }
}