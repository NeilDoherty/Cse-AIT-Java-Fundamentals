public class Car {
	private String theMake;
	private String theModel;
	private String theColor;
	private double theEngineSize;
	private static int count;
	
	public Car() {
		theMake = "";
		theModel = "";
		theColor = "";
		theEngineSize = 0;
		count++;
	}
	
	public Car(String aMake, String aModel, String aColor, int aEngineSize) {
		this.theMake = aMake;
		this.theModel = aModel;
		this.theColor = aColor;
		this.theEngineSize = aEngineSize;
		this.count++;
	}
	
	public String getMake() {
		return theMake;
	}
	
	public void setMake(String aMake) {
		theMake = aMake;
	}
	
	public String getModel() {
		return theModel;
	}
	
	public void setModel(String aModel) {
		theModel = aModel;
	}
	
	public String getColor() {
		return theColor;
	}
	
	public void setColor(String aColor) {
		theColor = aColor;
	}
	
	public double getEngineSize() {
		return theEngineSize;
	}
	
	public void setEngineSize(double aEngineSize) {
		theEngineSize = aEngineSize;
	}
	
	public static int getCount() {
		return count;
	}
	
	@Override
	public String toString() {
		return "The Car make is a " + theMake + " " + theModel + " of engine size " + theEngineSize + " and color " + theColor;
	}
}