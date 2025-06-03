package TugasFinalStatic;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

//TUGAS 2
public class BankAccount {
	private final String accountNumber;
	protected double balance;
	
	public BankAccount(String accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 56372823;
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}
	
	public final void displayAccountInfo() {
	    DecimalFormatSymbols symbols = new DecimalFormatSymbols();
	    symbols.setGroupingSeparator('.');
	    symbols.setDecimalSeparator(',');
	    
	    DecimalFormat df = new DecimalFormat("#,###.##", symbols);
	    
	    System.out.println("Nomor Rekening: " + accountNumber);
	    System.out.println("Saldo " + df.format(balance));
	}


}