class Phone {

	private String theNumber;
	private String theOwnersName;
	private double thePrice;

	public Phone() {
		theNumber = "";
		theOwnersName = "";
		thePrice = 0.0;
	}

	public Phone(String aNumber, String aOwnersName, double aPrice) {
		this.theNumber = aNumber;
		this.theOwnersName = aOwnersName;
		this.thePrice = aPrice;
	}

	@Override
	public String toString() { //Overriding default toString Method
		return "The phone number is " + theNumber + ". " + theOwnersName + " owns" +
		" this phone. The phone cost €" + thePrice;
	}
	
	public String getNumber() {
		return theNumber;
	}

	public String getOwnersName() {
		return theOwnersName;
	}

	public double getPrice() {
		return thePrice;
	}

	public void setNumber(String aNumber) {
		this.theNumber = aNumber;
	}

	public void setOwnersName(String aOwnersName) {
		this.theOwnersName = aOwnersName;
	}

public void setPrice(double aPrice) {
		this.thePrice = aPrice;
	}
}

public class PhoneTest {
	public static void main(String[] args) {
		Phone p = new Phone();
		Phone p2 = new Phone("12345", "Neil", 0.5);
		p.setPrice(0.2);
		System.out.println(p.getPrice());
		System.out.println(p2.getPrice());
		System.out.println(p2.getOwnersName());
		System.out.println(p2.getNumber());		
		System.out.println(p);
		System.out.println(p2);
	}
}