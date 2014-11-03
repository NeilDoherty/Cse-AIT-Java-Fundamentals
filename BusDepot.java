public class BusDepot {
	public static void main(String[] args) {
		Bus theBus = new Bus("Neil", 18, "Volvo");
		System.out.println(theBus);
		Bus theBus2 = new Bus("Neil2", 18, "Volvo");
		System.out.println(Bus.getCount());
	}
}