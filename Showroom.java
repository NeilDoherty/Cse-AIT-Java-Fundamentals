public class Showroom {
	public static void main(String[] args) {
		Car vw = new Car();
		System.out.println(vw.getEngineSize());
		System.out.println(Car.getCount());
		Car bmw = new Car("BMW", "X6", "Silver", 2);
		System.out.println(bmw);
		System.out.println(Car.getCount());
	}
}