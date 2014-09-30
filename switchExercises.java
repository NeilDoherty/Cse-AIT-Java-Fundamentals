import java.util.Scanner;

public class switchExercises {
	public static void main(String[] args) {
		//switchOnAString();
		//switchMonth();
		switchChar();
	}
	
	public static void switchOnAString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.next();
		switch (name) {
			case "john": case "JOHN": case "John":
				System.out.println("Male");
				break;			
			case "mary": case "MARY": case "Mary":
				System.out.println("Female");
				break;			
			default:
				System.out.println("WRONG");
				break;
		}
	}
	
	public static void switchMonth() {
		final int JAN = 1;final int FEB = 2;final int MAR = 3;final int APR = 4;final int MAY = 5;final int JUN = 6;
		final int JUL = 7;final int AUG = 8;final int SEP = 9;final int OCT = 10;final int NOV = 11;final int DEC = 12;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month: ");
		int month = sc.nextInt();
		switch (month) {
			case JAN:
				System.out.println("January");
				break;
			case FEB:
				System.out.println("February");
				break;
			case MAR:
				System.out.println("March");
				break;
			case APR:
				System.out.println("April");
				break;
			case MAY:
				System.out.println("May");
				break;
			case JUN:
				System.out.println("June");
				break;
			case JUL:
				System.out.println("July");
				break;
			case AUG:
				System.out.println("August");
				break;
			case SEP:
				System.out.println("September");
				break;
			case OCT:
				System.out.println("October");
				break;
			case NOV:
				System.out.println("November");
				break;
			case DEC:
				System.out.println("December");
				break;
			default:
				System.out.println("WRONG");
				break;	
		}
	}
	
	public static void switchChar() {
		int out = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers and a character: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		char operation = sc.next().charAt(0);
		switch (operation) {
			case '+':
				out = num1 + num2;
				break;
			case '-':
				out = num1 - num2;
				break;
			case '*':
				out = num1 * num2;
				break;
			case '/':
				out = num1 / num2;
				break;
			default:
				System.out.println("WRONG");
				break;
		}
		System.out.println("Result of " + num1 + " " + operation + " " + num2 + " is " + out);
	}
}