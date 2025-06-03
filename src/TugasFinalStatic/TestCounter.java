package TugasFinalStatic;

//TUGAS 3
public class TestCounter {
	public static void main(String[] args) {
		new Counter ();
		new Counter ();
		new Counter ();
		new Counter ();
		new Counter ();
		new Counter ();
		
		System.out.println("Total Objek Counter: " + Counter.getInstanceCount());
	}

}
