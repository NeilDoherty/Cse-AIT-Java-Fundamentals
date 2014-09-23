import java.util.Scanner;

public class AssignmentTests {
	public static void main(String[] args) {
		int x = 99;
		if (x == 77) {
			
		}
		
		x = 0;
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if ((input >= 1) && (input <= 5)) {
			System.out.println(Math.pow(input, 2));
		}
		else if ((input > 5) && (input <= 10)) {
			System.out.println(Math.pow(input, 3));
		}
		else if ((input > 10) && (input < 0)) {
			System.out.println("ERROR");
		}
	}
}