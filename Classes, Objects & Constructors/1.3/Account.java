
public class Account {
	private static double balance = 3000;
	protected int accountNumber;
	protected static String dateOfLastUpdation;
	
	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void checkOnline(double amount, int accNo) {
		if(amount < balance && accountNumber == accNo) {
			balance = balance - amount;
			System.out.println("---Transaction Made in Online---");
			System.out.println("Current balance: " + balance);
		} else {
			System.out.println("Invalid Transaction");
		}
	} 
	
	public void checkOffline(double amount, int accNo) {
		if(amount < balance && accountNumber == accNo) {
			balance = balance - amount;
			System.out.println("---Transaction Made in Offline---");
			System.out.println("Current balance: " + balance);
		} else {
			System.out.println("Invalid Transaction");
		}
	}
	
	public void updateDate(String dateOfTransaction) {
		dateOfLastUpdation = dateOfTransaction;
	}
	
}
