import java.util.Scanner;

public class whileExercises {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter coefficients a, b, c, d: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		thirdOrderPolynomial(a,b,c,d);
	}
	
	public static void thirdOrderPolynomial(int a, int b, int c, int d) {
		boolean restart = false;
		Scanner sc = new Scanner(System.in);
		while (restart == false) {
			System.out.println("Enter x: ");
			int x = sc.nextInt();
			x = ((a * x) * (a * x) * (a * x)) + ((b * x) * (b * x)) + (c * x) + d;
			System.out.println("F(x) is: " + x);
			System.out.println("Would you like to continue? y/n");
			char cont = sc.next().charAt(0);
			if (cont == 'y') {
				restart = false;
			}
			else if (cont == 'n') {
				restart = true;
			}
		}
	}
}