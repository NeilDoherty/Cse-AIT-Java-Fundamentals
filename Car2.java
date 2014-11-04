class Car2 {
	private String carModel;
	private String carType;
	private int ageOfCar;

	public Car2(String aCarModel, String aCarType, int aAgeOfCar) {
		this.carModel = aCarModel;
		this.carType = aCarType;
		this.ageOfCar = aAgeOfCar;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String aCarModel) {
		carModel = aCarModel;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String aCarType) {
		carType = aCarType;
	}

	public int getAgeOfCar() {
		return ageOfCar;
	}

	public void setAgeOfCar(int aAgeOfCar) {
		ageOfCar = aAgeOfCar;
	}

	@Override
	public String toString() {
		return carType + " model " + carType + " is "  +  ageOfCar + " years old";
	}
}