import java.util.Scanner;

public class AsciiValues {
	public static void main(String[] args) {
		char input = 0;
		while (input != 'x') {
			System.out.println("Enter character:");
			Scanner sc = new Scanner(System.in);
			input = sc.next().charAt(0);
			if (input != 'x') {
				System.out.println("Character was " + (long) input);
			}
			else {
				System.out.println("Character was " + input);
			}
		}
	}
}