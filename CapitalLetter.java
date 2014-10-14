import java.util.Scanner;

public class CapitalLetter {
	public static void main(String[] args) {
		char input = 0;
		Scanner sc = new Scanner(System.in);
		input = sc.next().charAt(0);
		if (((long) input < 91) && ((long) input > 64)) {
			System.out.println("Character: " + input + " and ASCII is " + (long) input);
		}
		else if (((long) input > 96) && ((long) input < 123)) {
			System.out.println("Character: " + input + " and ASCII is " + (long) input);
		}
		else {
			System.out.println("Invalid character: " + input + " and ASCII is " + (long) input);
		}
	}
}