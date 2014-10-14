import java.util.InputMismatchException;
import java.util.Scanner;

public class ifExercises {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		try {
			System.out.println("Enter month: ");
			int monthIn = sc.nextInt();
			ifMonth(monthIn);
			System.out.println("Enter integer x: ");
			int x = sc.nextInt();
			System.out.println("Enter integer y: ");
			int y = sc.nextInt();
			largerOfTwoNumbers(x, y);
			System.out.println("Enter mark: ");
			int mark = sc.nextInt();
			ifGrade(mark);
			temperature();
			ifLargest();
			ifSmallest();
			ifLargest2();
			ifSmallest2();
			ternaryOperator();
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
	
	public static void ifGrade(int mark) {
		try {
			if ((mark < 0) || (mark > 100)) {
				System.out.println("Out of bounds with value: " + mark);
			}
			else if (mark > 69) {
				System.out.println("Grade is: A");
			}
			else if (mark > 59) {
				System.out.println("Grade is: B");
			}
			else if (mark > 49) {
				System.out.println("Grade is: C");
			}
			else if (mark > 39) {
				System.out.println("Grade is: D");
			}
			else {
				System.out.println("Grade is a fail");
			}
		} catch (Exception e) {
			System.out.println("Caught exception " + e.getMessage());
		}
	}
	
	public static void temperature() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature: ");
		try {
			int temperature = sc.nextInt();
			if ((temperature < -10) || (temperature > 31)) {
				System.out.println("Extreme temperature");
			}
			else {
				if (temperature > 27) {
					System.out.println("Hot");
				}
				else if (temperature > 20) {
					System.out.println("Very Warm");
				}
				else if (temperature > 14) {
					System.out.println("Warm");
				}
				else if (temperature > 9) {
					System.out.println("Mild");
				}
				else if (temperature > 2) {
					System.out.println("Cold");
				}
				else if (temperature > -11) {
					System.out.println("Very Cold");
				}
			}
		} catch (Exception e) {
			System.err.println("Caught Exception: " + e.getMessage());
		}
	}
	
	public static void ifLargest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 unique numbers:");
		try {
			int u1 = sc.nextInt();
			int u2 = sc.nextInt();
			int u3 = sc.nextInt();
			if ((u1 > u2) && (u1 > u3)) {
				System.out.println("u1 is the largest number");
			}
			else if ((u2 > u1) && (u2 > u3)) {
				System.out.println("u2 is the largest number");
			}
			else if ((u3 > u1) && (u3 > u2)) {
				System.out.println("u3 is the largest number");
			}
			else if ((u1 == u2) && (u2 == u3)) {
				System.out.println("All numbers are identical");
			}
			else if ((u1 == u2) && (u3 > u1)) {
				System.out.println("u3 is the largest number");
			}
			else if ((u1 == u2) && (u3 < u1)) {
				System.out.println("u1,u2 are the largest numbers");
			}
			else if ((u2 == u3) && (u1 > u2)) {
				System.out.println("u1 is the largest number");
			}
			else if ((u2 == u3) && (u1 < u2)) {
				System.out.println("u2,u3 are the largest numbers");
			}
			else if ((u1 == u3) && (u2 > u1)) {
				System.out.println("u2 is the largest number");
			}
			else if ((u1 == u3) && (u2 < u1)) {
				System.out.println("u1,u3 are the largest numbers");
			}
		} catch (Exception e) {
			System.err.println("Caught Exception: " + e.getMessage());
		}
	}
	
	public static void ifSmallest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 unique numbers:");
		try {
			int u1 = sc.nextInt();
			int u2 = sc.nextInt();
			int u3 = sc.nextInt();
			if ((u1 <= u2) && (u1 <= u3)) {
				System.out.println(u1 + " is the smallest");
			}
			else if ((u2 <= u1) && (u2 <= u3)) {
				System.out.println(u2 + " is the smallest");
			}
			else if ((u3 <= u1) && (u3 <= u2)) {
				System.out.println(u3 + " is the smallest");
			}
		} catch (Exception e) {
			System.err.println("Caught Exception: " + e.getMessage());
		}
	}
	
	public static void ifLargest2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 unique numbers:");
		try {
			int u1 = sc.nextInt();
			int u2 = sc.nextInt();
			int u3 = sc.nextInt();
			if (u1 >= u2) {
				if (u1 >= u3) {
					System.out.println(u1 + " is the largest");
				}
				else if (u3 >= u1) {
					System.out.println(u3 + " is the largest");
				}
			}
			else if (u2 >= u1) {
				if (u2 >= u3) {
					System.out.println(u2 + " is the largest");
				}
				else if (u3 >= u2) {
					System.out.println(u3 + " is the largest");
				}
			}
		}	catch (Exception e) {
				System.err.println("Caught Exception: " + e.getMessage());
		}
	}
	
	public static void ifSmallest2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 unique numbers:");
		try {
			int u1 = sc.nextInt();
			int u2 = sc.nextInt();
			int u3 = sc.nextInt();
			if (u1 <= u2) {
				if (u1 <= u3) {
					System.out.println(u1 + " is the smallest");
				}
				else if (u3 <= u1) {
					System.out.println(u3 + " is the smallest");
				}
			}
			else if (u2 <= u1) {
				if (u2 <= u3) {
					System.out.println(u2 + " is the smallest");
				}
				else if (u3 <= u2) {
					System.out.println(u3 + " is the smallest");
				}
			}
		}	catch (Exception e) {
				System.err.println("Caught Exception: " + e.getMessage());
		}
	}
	
	public static void ternaryOperator() {
		boolean isHappy = false;
		String mood = isHappy? "I am happy" : "I am sad";
		System.out.println(mood);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 unique numbers:");
		try {
			int u1 = sc.nextInt();
			int u2 = sc.nextInt();
			int output = u1 < u2 ? u1 : u2;
			System.out.println(output + " is the smallest");
		}	catch (Exception e) {
			System.err.println("Caught Exception: " + e.getMessage());
		}
	}
}
