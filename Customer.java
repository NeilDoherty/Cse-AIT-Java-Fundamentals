public class Customer {
	private String name;
	private int accountNo;
	private double balance;
	
	public Customer() {
		name = "";
		accountNo = 0;
		balance = 0;
	}

	public Customer(String aName, int aAccountNo, double aBalance) {
		this.name = aName;
		this.accountNo = aAccountNo;
		this.balance = aBalance;
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		this.name = aName;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int aAccountNo){
		this.accountNo = aAccountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double aBalance) {
		this.balance = aBalance;
	}

	@Override
	public String toString() {
		return "Account no. " + accountNo + " of name " + name + " holds " + balance + " in his/her account";
	}
}