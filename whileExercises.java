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
		whileHistogram();
		whileLargestAndSmallest();
		whileSales();
		whileSquares();
		whileAverageSentinel();
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
	
	public static void whileHistogram() {
		Scanner sc = new Scanner(System.in);
		int rows = 0; int cols = 0; int i = 0; int j = 1;
		System.out.println("Enter number of rows: ");
		rows = sc.nextInt();
		System.out.println("Enter number of cols: ");
		cols = sc.nextInt();
		
		while (i < rows) {
			j = 1;
			while (j <= cols) {
				System.out.print("*");
				j++;
			}
			System.out.println("");
			i++;
		}
	}
	
	public static void whileLargestAndSmallest() {
		int i = 0; int largest = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some numbers: ");
		try {
			String input = sc.next();
			while (i < input.length() - 1) {
				if (input.charAt(i + 1) > input.charAt(i)) {
					if (i >= 1) {
						if (input.charAt(i + 1) > largest) {
							largest = (int) input.charAt(i + 1);
							System.out.println((char) largest + " is the largest");
						}
					}
					else {
						largest = (int) input.charAt(i + 1);
						System.out.println((char) largest + " is the largest");
					}
				}
				else {
					if (i >= 1) {
						if (input.charAt(i) > largest) {
							largest = (int) input.charAt(i);
							System.out.println((char) largest + " is the largest");
						}
					}
					else {
						largest = (int) input.charAt(i);
						System.out.println((char) largest + " is the largest");
					}
				}
				i++;
			}
		} catch (Exception e) {
			System.err.println("InputMismatchException: " + e.getMessage());
		}
	}
	
	public static void whileSales() {
		double grossSalary = 3000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sales figure: ");
		double sales = sc.nextDouble();
		while (sales != -1) {
			System.out.println("Monthly salary is " + (grossSalary + (sales * 0.09)));
			System.out.println("Enter sales figure: ");
			sales = sc.nextInt();
		}
	}
	
	public static void whileSquares() {
		int i = 0; int squared = 0; int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		while (i < n) {
			squared = (i * i);
			sum += squared;
			System.out.println(i + " squared is " + squared + ". Sum is " + sum);
			i++;
		}
	}
	
	public static void whileAverageSentinel() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter sentinel: ");
			double sentinel = sc.nextDouble();
			double sum = 0; int i = 0;
			while (sentinel != -1) {
				sum += sentinel;
				i++;
				System.out.println("Enter sentinel: ");
				sentinel = sc.nextDouble();
			}
			System.out.println("Average is " + (sum / i));
		} catch (Exception e) {
			System.err.println("No number entered: " + e.getMessage());
		}
	}
}