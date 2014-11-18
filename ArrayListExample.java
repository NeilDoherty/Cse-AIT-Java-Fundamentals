import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<String> destinations = new ArrayList<>();
		final int ADD = 1, UPDATE = 2, DELETE = 3, DISPLAY = 4, EXIT = 5;
		System.out.println("Holiday destination program");
		String cont = "y";
		while (cont.equalsIgnoreCase("y")) {
			switch (userChoice()) {
				case ADD:
					destinations.add(add());
				break;
				case UPDATE:
					update(destinations);
				break;
				case DELETE:
					destinations.remove(delete());
				break;
				case DISPLAY:
					display(destinations);
				break;
				case EXIT:
					cont = "n";
				break;
				default:
					System.out.println("Unknown entry");
				break;
			}
		}
	}

	public static int userChoice() {
		System.out.println("What do you want to do (1: add/ 2: update/ 3: delete/ 4: display/ 5: exit)");
		int input = sc.nextInt();
		return input;
	}

	public static String add() {
		System.out.println("Enter destination to add;");
		return sc.next();
	}

	public static int delete() {
		System.out.println("Which index do you want to delete:");
		return sc.nextInt();
	}

	public static void display(ArrayList<String> destinations) {
		System.out.println(destinations);
	}

	public static void update(ArrayList<String> destinations) {
		System.out.println(destinations);
		System.out.println("Which index do you want to update:");
		int index = sc.nextInt();
		System.out.println("Enter new location:");
		String nLocation = sc.next();
		destinations.set(index, nLocation);
		System.out.println(destinations);
	}
}