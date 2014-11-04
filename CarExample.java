public class CarExample {
	public static void main(String[] args) {
		Car2 bmw = new Car2("325", "BMW", 1);
		Person midge = new Person("Midge", "Athlone", true, true, false, true, false, true, bmw);
		midge.calculatePenaltyPoints();
		System.out.println(midge.getName() + " has " + midge.getTotalPenaltyPoints() + " penalty points");
		midge.setDrivingDefectiveVehicle(true);
		midge.calculatePenaltyPoints();
		System.out.println(midge.getName() + " has " + midge.getTotalPenaltyPoints() + " penalty points");
		System.out.print("Is midge disqualified: ");
		if (midge.isDisqualified()) {
			System.out.print("Yes\n");
		}
		else {
			System.out.print("No\n");
		}
		Car2 volvo = new Car2("S40", "Volvo", 4);
		Person george = new Person("Midge", "Dublin 4", false, false, false, false, false, false, volvo);
		george.calculatePenaltyPoints();
		george.isUsingMobileWhileDriving();
		george.calculatePenaltyPoints();
		System.out.print("Is george disqualified: ");
		if (george.isDisqualified()) {
			System.out.print("Yes\n");
		}
		else {
			System.out.print("No\n");
		}
	}
}