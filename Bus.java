public class Bus {
	private int theNumberOfSeats;
	private static int theCount;
	private String theDriversName;
	private String theMake;
	
	public Bus() {
		theNumberOfSeats = 0;
		theCount = 0;
		theDriversName = "";
		theMake = "";
		theCount++;
	}
	
	public Bus(String aDriversName, int aNumberOfSeats, String aMake) {
		this.theNumberOfSeats = aNumberOfSeats;
		this.theDriversName = aDriversName;
		this.theMake = aMake;
		this.theCount++;
	}
	
	public String getDriversName() {
		return theDriversName;
	}
	
	public void setDriversName(String aDriversName) {
		theDriversName = aDriversName;
	}
	
	public int getNumberOfSeats() {
		return theNumberOfSeats;
	}
	
	public void setNumberOfSeats(int aNumberOfSeats) {
		theNumberOfSeats = aNumberOfSeats;
	}
	
	public String getMake() {
		return theMake;
	}
	
	public void setMake(String aMake) {
		theMake = aMake;
	}
	
	public static int getCount() {
		return theCount;
	}
	
	@Override
	public String toString() {
		return theDriversName + " drives a " + theMake + " bus which holds " + theNumberOfSeats + " passengers";
	}
}