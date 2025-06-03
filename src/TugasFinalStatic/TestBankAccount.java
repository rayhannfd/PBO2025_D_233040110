package TugasFinalStatic;

//TUGAS 2
public class TestBankAccount {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(" 233040110");
        sa.deposit(2000000);
        sa.displayInfoSavings();
    }
}