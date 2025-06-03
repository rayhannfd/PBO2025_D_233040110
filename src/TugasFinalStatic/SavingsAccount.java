package TugasFinalStatic;

//TUGAS 2
	public class SavingsAccount extends BankAccount {
		public SavingsAccount (String accountNumber) {
			super(accountNumber);
		}
		
	//KODE YANG INI ERROR
	/*
	 @Override
	 	public void displayAccountInfo () {
	 	System.out.println ("Info Rekening Tabungan");
	 	}
 	 */
		
	//SOLUSI DARI KODE NYA
		public void displayInfoSavings ( ) {
			super.displayAccountInfo ();
			System.out.println ("Jenis Akun: Tabungan Pribadi");
		}
	}