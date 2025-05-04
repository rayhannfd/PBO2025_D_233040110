package Tugas9;

public class inheritancemain {
	public static void main(String[] args) {
    mobil m1 = new mobil("Toyota Innova Zenix", 2024, 20);
    m1.tampilMobil();
    m1.nyalakanMesin();
    m1.berjalan();
    m1.isiBensin(35);
    m1.berjalan();
    m1.matikanMesin();
}
}
