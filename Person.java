class Person {
	private String name;
	private String address;
	private boolean drinkDrivingOffense;
	private boolean caughtWithoutASeatbelt;
	private boolean dangerousOvertaking;
	private boolean usingMobileWhileDriving;
	private boolean drivingDefectiveVehicle;
	private boolean crossingContinuousWhiteLine;
	private int totalPenaltyPoints;
	private Car2 car;

	public Person(String name, String address, Car2 car) {
		name = "";
		address = "";
	}

	public Person(String aName, String aAddress, boolean aDrinkDrivingOffense, boolean aCaughtWithoutASeatbelt, boolean aDangerousOvertaking,
	boolean aUsingMobileWhileDriving, boolean aDrivingDefectiveVehicle, boolean aCrossingContinuousWhiteLine, Car2 aCar) {
		this.name = aName;
		this.address = aAddress;
		this.drinkDrivingOffense = aDrinkDrivingOffense;
		this.caughtWithoutASeatbelt = aCaughtWithoutASeatbelt;
		this.dangerousOvertaking = aDangerousOvertaking;
		this.usingMobileWhileDriving = aUsingMobileWhileDriving;
		this.drivingDefectiveVehicle = aDrivingDefectiveVehicle;
		this.crossingContinuousWhiteLine = aCrossingContinuousWhiteLine;
		this.car = aCar;
	}

	public void calculatePenaltyPoints() {
		int total = 0;
		if (isDrinkDrivingOffense()) {
			total += 5;
		}
		if (isCaughtWithoutASeatbelt()) {
			total += 5;
		}
		if (isDangerousOvertaking()) {
			total += 5;
		}
		if (isUsingMobileWhileDriving()) {
			total += 4;
		}
		if (isDrivingDefectiveVehicle()) {
			total += 5;
		}
		if (isCrossingContinuousWhiteLine()) {
			total += 4;
		}
		setTotalPenaltyPoints(total);
	}

	public boolean isDisqualified() {
		final int DISQUALIFIED_MIN = 12;
		if (getTotalPenaltyPoints()> DISQUALIFIED_MIN) {
			return true;
		}
		else {
			return false;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		this.name = aName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String aAddress) {
		this.address = aAddress;
	}

	public boolean isDrinkDrivingOffense() {
		return drinkDrivingOffense;
	}

	public void setDrinkDrivingOffense(boolean aDrinkDrivingOffense) {
		this.drinkDrivingOffense = aDrinkDrivingOffense;
	}

	public boolean isCaughtWithoutASeatbelt() {
		return caughtWithoutASeatbelt;
	}

	public void setCaughtWithoutASeatbelt(boolean aCaughtWithoutASeatbelt) {
		this.caughtWithoutASeatbelt = aCaughtWithoutASeatbelt;
	}

	public boolean isDangerousOvertaking() {
		return dangerousOvertaking;
	}

	public void setDangerousOvertaking(boolean aDangerousOvertaking) {
		this.dangerousOvertaking = aDangerousOvertaking;
	}

	public boolean isUsingMobileWhileDriving() {
		return usingMobileWhileDriving;
	}

	public void setUsingMobileWhileDriving(boolean aUsingMobileWhileDriving) {
		this.usingMobileWhileDriving = aUsingMobileWhileDriving;
	}

	public boolean isDrivingDefectiveVehicle() {
		return drivingDefectiveVehicle;
	}

	public void setDrivingDefectiveVehicle(boolean aDrivingDefectiveVehicle) {
		this.drivingDefectiveVehicle = aDrivingDefectiveVehicle;
	}

	public boolean isCrossingContinuousWhiteLine() {
		return crossingContinuousWhiteLine;
	}

	public void setCrossingContinuousWhiteLine(boolean aCrossingContinuousWhiteLine) {
		this.crossingContinuousWhiteLine = aCrossingContinuousWhiteLine;
	}

	public int getTotalPenaltyPoints() {
		return totalPenaltyPoints;
	}

	public void setTotalPenaltyPoints(int aTotalPenaltyPoints) {
		this.totalPenaltyPoints = aTotalPenaltyPoints;
	}

	@Override
	public String toString() {
		return name + " who lives in " + address + " has the following convictions:\n\nDrinkDrivingOffense: "
		+ isDrinkDrivingOffense() + "\nCaughtWithoutASeatbelt: " + isCaughtWithoutASeatbelt() + "\nDangerousOvertaking: " + isDangerousOvertaking()
		+ "\nUsingMobileWhileDriving: " + isUsingMobileWhileDriving() + "\nDrivingDefectiveVehicle: "
		+ isDrivingDefectiveVehicle() + "\nCrossingContinuousWhiteLine: " + isCrossingContinuousWhiteLine();
	}
}