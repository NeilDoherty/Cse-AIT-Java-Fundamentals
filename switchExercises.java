import java.util.Scanner;

public class switchExercises {
	public static void main(String[] args) {
		//switchOnAString();
		//switchMonth();
		//switchChar();
		//switchSquareOrCube();
		//switchVowelOrConsonant();
		switchDaysInMonth();
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
	
	public static void switchSquareOrCube() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1-10: ");
		int num1 = sc.nextInt();
		
		switch (num1) {
			case 2: case 4: case 6: case 8: case 10:
				System.out.println("Square of " + num1 + " is " + (num1 * num1));
				break;	
			case 1: case 3: case 5: case 7: case 9:
				System.out.println("Cube of " + num1 + " is " + (num1 * num1 * num1));
				break;
			default:
				System.out.println("WRONG");
				break;
		}
	}
	
	public static void switchVowelOrConsonant() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		int letter = (int) sc.next().charAt(0);
		
		switch (letter) {
		case 65: case 69: case 73: case 79: case 85:
		case 97: case 101: case 105: case 111: case 117:
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");
			break;
		}
	}
	
	public static void switchDaysInMonth() {
		final int JAN = 1;final int FEB = 2;final int MAR = 3;final int APR = 4;final int MAY = 5;final int JUN = 6;
		final int JUL = 7;final int AUG = 8;final int SEP = 9;final int OCT = 10;final int NOV = 11;final int DEC = 12;
		String monthS = null;
		Scanner sc = new Scanner(System.in);
		int days = 0;
		System.out.println("Enter a year and month numerically, line seperated: ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		switch (month) {
			case JAN: case MAR: case MAY: case JUL: case AUG: case OCT: case DEC:
				System.out.println("Year is " + year + " and there are 31 days in " + month);
				break;
			case APR: case JUN: case SEP: case NOV:
				System.out.println("Year is " + year + " and there are 30 days in " + month);
				break;
			case FEB:
				if ((year % 4) == 0) {
					if ((year % 100) == 0) {
						if ((year % 400) == 0) {
							days = 29;
						}
						else {
							days = 28;
						}
					}
					else {
						days = 29;
					}
				}
				else {
					days = 28;
				}
				if (month == 1) {
					monthS = "January";
				}
				else if (month == 2) {
					monthS = "February";
				}
				else if (month == 3) {
					monthS = "March";
				}
				else if (month == 4) {
					monthS = "April";
				}
				else if (month == 5) {
					monthS = "May";
				}
				else if (month == 6) {
					monthS = "June";
				}
				else if (month == 7) {
					monthS = "July";
				}
				else if (month == 8) {
					monthS = "August";
				}
				else if (month == 9) {
					monthS = "September";
				}
				else if (month == 10) {
					monthS = "October";
				}
				else if (month == 11) {
					monthS = "November";
				}
				else if (month == 12) {
					monthS = "December";
				}
				System.out.println("Year is " + year + " and there is " + days + " days in " + monthS);
				break;
		}
	}
}