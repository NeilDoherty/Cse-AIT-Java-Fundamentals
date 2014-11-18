import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {

	public static void main(String[] args) {
		String name = arrayListStringLiterals();
		System.out.println("name(4) is " + name);
		arrayListStringsNoLoops();
		arrayListStringsLoops();
		arrayListInteger();
	}
	
	public static String arrayListStringLiterals() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Zoe");
		names.add("Paul");
		names.add("Paul");
		names.add("Alan");
		names.add("Thomas");
		return names.get(4);
	}
	
	public static String arrayListStringsNoLoops() {
		ArrayList<String> names = new ArrayList<>();	// Diamond operator type inference
		Scanner sc = new Scanner(System.in);
		for (int i = 0 ; i < 4 ; i ++) {
			System.out.println("Add a name:");
			String input = sc.next();
			names.add(input);
		}
		System.out.println(names);
		return "";
	}
	
	public static void arrayListStringsLoops() {
		ArrayList<String> names = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Add a name:");
		String input = sc.next();
		while (!input.equalsIgnoreCase("x")) {
			names.add(input);
			System.out.println("Add a name:");
			input = sc.next();
		}
		System.out.println(names);
	}
	
	public static void arrayListInteger() {
		ArrayList<Integer> numbers = new ArrayList<>(3);
		Scanner sc = new Scanner(System.in);
		System.out.println("Add a number:");
		int input = sc.nextInt();
		while (input != -1) {
			numbers.add(input);	// Autoboxing from int to Integer
			System.out.println("Add a number:");
			input = sc.nextInt();
		}
		for (Integer num : numbers) {
			System.out.print(num + " ");
		}
	}
}