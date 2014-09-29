import java.util.InputMismatchException;
import java.util.Scanner;

public class ifExercises {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month: ");
		try {
			int monthIn = sc.nextInt();
			ifMonth(monthIn);
			System.out.println("Enter integer x: ");
			int x = sc.nextInt();
			System.out.println("Enter integer y: ");
			int y = sc.nextInt();
			largerOfTwoNumbers(x, y);
		}
		catch (InputMismatchException e) {
			System.err.println("InputMismatchException: " + e.getMessage());
		}		
	}
	
	public static void ifMonth(int monthIn) {
		final int JAN = 1;	//constants defined
		final int FEB = 2;
		final int MAR = 3;
		final int APR = 4;
		final int MAY = 5;
		final int JUN = 6;
		final int JUL = 7;
		final int AUG = 8;
		final int SEP = 9;
		final int OCT = 10;
		final int NOV = 11;
		final int DEC = 12;
		
		if (monthIn == JAN) {
			System.out.println("Month is January");
		}
		else if (monthIn == FEB) {
			System.out.println("Month is February");
		}
		else if (monthIn == MAR) {
			System.out.println("Month is March");
		}
		else if (monthIn == APR) {
			System.out.println("Month is April");
		}
		else if (monthIn == MAY) {
			System.out.println("Month is May");
		}
		else if (monthIn == JUN) {
			System.out.println("Month is June");
		}
		else if (monthIn == JUL) {
			System.out.println("Month is July");
		}
		else if (monthIn == AUG) {
			System.out.println("Month is August");
		}
		else if (monthIn == SEP) {
			System.out.println("Month is September");
		}
		else if (monthIn == OCT) {
			System.out.println("Month is October");
		}
		else if (monthIn == NOV) {
			System.out.println("Month is November");
		}
		else if (monthIn == DEC) {
			System.out.println("Month is December");
		}
	}
	
	public static void largerOfTwoNumbers(int x, int y) {
		if ((x < 0) || (y < 0)) {
			System.out.println("Integer values are: x = " + x + " , y = " + y);
		}
		else if ((x > 0) && (y > 0)) {
			if (x > y) {
				System.out.println("x is the larger integer value");
			}
			else if (y > x) {
				System.out.println("y is the larger integer value");	
			}
			else {
				System.out.println("Both values are equal");
			}
		}
	}
}