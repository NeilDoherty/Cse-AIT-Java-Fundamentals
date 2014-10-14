import java.util.Scanner;

public class IfLogicalOps {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		sc = new Scanner(System.in);
		int num2 = sc.nextInt();
		
		if ((num1 < 0) && (num2 < 0)) {
			System.out.println("Both numbers are negative");
		}
		else if ((num1 > 0) && (num2 > 0)) {
			System.out.println("Both numbers are positive");
		}
		else if ((num1 == 0) || (num2 == 0)) {
			System.out.println("One number is 0");
		}
		else if ((num1 < 0) || (num2 < 0)) {
			System.out.println("One number is negative");
		}
		
	}
}