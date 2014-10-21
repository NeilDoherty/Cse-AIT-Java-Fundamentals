public class Bank {
	public static void main(String[] args) {
		Customer neil = new Customer();
		neil.getBalance();
		Customer john = new Customer("john", 01, 15000.0);
		System.out.println(john.getBalance());
		System.out.println(neil);
	}
}