
public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction t1 = new Transaction(111, "11.12.2021", 500, "offline");
		Account a1 = new Account(111);
		if("online".equalsIgnoreCase(t1.transactionType)) {
			a1.checkOnline(t1.amount, t1.accountNumber);
			a1.updateDate(t1.dataOfTransaction);
			System.out.println(Account.dateOfLastUpdation);
		} else {
			a1.checkOffline(t1.amount, t1.accountNumber);
			a1.updateDate(t1.dataOfTransaction);
			System.out.println(Account.dateOfLastUpdation);
		}
		

	}

}
