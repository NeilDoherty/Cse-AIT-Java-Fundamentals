import java.util.Date;

public class Biscuit {
	private int theNumberOfBiscuits;
	private int theWeight;
	private String theBrand;
	private String theMaker;
	private Date bestBeforeDate;

	public Biscuit() {
		theNumberOfBiscuits = 0;
		theWeight = 0;
		theBrand = "";
		theMaker = "";
		
	}

	public Biscuit(String aTheBrand, String aTheMaker, int aTheNumberOfBiscuits, int aTheWeight, Date aBestBeforeDate) {
		this.theBrand = aTheBrand;
		this.theMaker = aTheMaker;
		this.theNumberOfBiscuits = aTheNumberOfBiscuits;
		this.theWeight = aTheWeight;
		this.bestBeforeDate = aBestBeforeDate;
	}

	public String getBrand() {
		return theBrand;
	}

	public void setBrand(String aTheBrand) {
		theBrand = aTheBrand;
	}

	public int getNumberOfBiscuits() {
		return theNumberOfBiscuits;
	}

	public void setNumberOfBiscuits(int aTheNumberOfBiscuits) {
		theNumberOfBiscuits = aTheNumberOfBiscuits;
	}

	public int getWeight() {
		return theWeight;
	}

	public void setWeight(int aTheWeight) {
		theWeight = aTheWeight;
	}

	public String getMaker() {
		return theMaker;
	}

	public void setMaker(String aTheMaker) {
		theMaker = aTheMaker;
	}

	@Override
	public String toString () {
		return theMaker + " operates the " + theBrand + " brand selling " + theNumberOfBiscuits + " biscuits weighing " + theWeight + " kg"
		+ ". Best before date is " + bestBeforeDate;
	}
}