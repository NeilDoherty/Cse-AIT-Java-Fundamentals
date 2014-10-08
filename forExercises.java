import java.util.Scanner;

public class forExercises {
	
	final static int NUM_INPUTS = 3;
	
	public static void main(String[] args) {
		/*forHeaderTesting();
		forSmallestLargest();
		forHistogram();
		forAverage();
		forSequence();
		forSomeEvenNumbers();*/
		twelveDaysOfChristmas();
	}
	
	public static void forHeaderTesting() {
		for (/*int i = 0*/ ; ; /*i ++*/) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int input = sc.nextInt();
			int sum = input;
			while (input != -1) {
				System.out.println("Enter a number: ");
				input = sc.nextInt();
				sum += input;
			}
			System.out.println("Total is: " + (sum + 1));
			break;
		}
	}
	
	public static void forSmallestLargest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n, the amount of numbers inputted: ");
		int n = sc.nextInt();
		System.out.println("Enter a number: ");
		int input = sc.nextInt();
		int largest = input;
		int smallest = n;
		for (int i = 0 ; i < n ; i++) {
			if (i > 0) {
				System.out.println("Enter a number: ");
				input = sc.nextInt();
			}
			if (input > largest) {
				largest = input;
			}
		if (input < smallest) {
				smallest = input;
			}
			System.out.println(largest + " is the largest number");
			System.out.println(smallest + " is the smallest number");
		}
	}
	
	public static void forHistogram() {
		Scanner sc = new Scanner(System.in);
		int rows = 0; int cols = 0;
		System.out.println("Enter number of rows: ");
		rows = sc.nextInt();
		System.out.println("Enter number of cols: ");
		cols = sc.nextInt();
		System.out.println("Enter character to output: ");
		char c = sc.next().charAt(0);
		for (int i = 0 ; i < rows ; i++) {
			for (int j = 0 ; j < cols ; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	public static void forAverage() {
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		System.out.println("Enter n, the amount of numbers inputted: ");
		int n = sc.nextInt();
		for (int i = 0 ; i < n ; i ++) {
			System.out.println("Enter sentinel: ");
			double sentinel = sc.nextDouble();
			sum += sentinel;			
		}
		System.out.println("Average was " + sum / n);	
	}
	
	public static void forSequence() {
		for (int i = 1 ; i < 11; i ++) {
			int output = (i * i);
			if (i != 10) {
				System.out.print(output + ",");
			}
			else {
				System.out.print(output);
			}
		}
	}
	
	public static void forSomeEvenNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two even numbers: ");
		int from = 0 ; int to = 0;
		from = sc.nextInt();
		to = sc.nextInt();
		if ( ((from % 2) != 0) || ((to % 2) != 0)) {
			System.err.println("InputMismatchException");
		}
		else {
			int sum = 0;		
			for (int i = from + 1 ; i < to; i ++) {
				if ((i % 2) == 0) {
					sum += i;
				}
			}
			System.out.println("Sum of even numbers between " + from + " and " + to + " is " + sum );
		}
	}
	
	public static void twelveDaysOfChristmas() {
		Scanner sc = new Scanner(System.in);
		String day = null;		
		for (int i = 0 ; i < 12 ; i ++) {
			switch (i) {
				case 0:
					day = "first";
					break;
				case 1:
					day = "second";
					break;
				case 2:
					day = "third";
					break;
				case 3:
					day = "fourth";
					break;
				case 4:
					day = "fifth";
					break;
				case 5:
					day = "sixth";
					break;
				case 6:
					day = "seventh";
					break;
				case 7:
					day = "eight";
					break;
				case 8:
					day = "ninth";
					break;
				case 9:
					day = "tenth";
					break;
				case 10:
					day = "eleventh";
					break;
				case 11:
					day = "twelfth";
					break;
			}
			System.out.println("On the " + day + " day of Christmas,\nMy true love sent to me:");
			switch (i) {
				case 0:
					System.out.println("\tA partridge in a pear tree.\n\n");
					break;
				case 1:
					System.out.println("\tTwo turtle doves, and\n\tA partridge in a pear tree.\n\n");
					break;
				case 2:
					System.out.println("\tThree French hens,\n\tTwo turtle doves, and\n\tA partridge in a pear tree.\n\n");
					break;
				case 3:
					System.out.println("\tFour calling birds,\n\tThree French hens,\n\tTwo turtle doves, and\n\tA partridge in a pear tree.\n\n");
					break;
				case 4:
					System.out.println("\tFive golden rings,\n\tFour calling birds,\n\tThree French hens,\n\tTwo turtle doves, and" +
					"\n\tA partridge in a pear tree.\n\n");
					break;
				case 5:
					System.out.println("\tSix geese a-laying,\n\tFive golden rings,\n\tFour calling birds,\n\tThree French hens," +
					"\n\tTwo turtle doves, and\n\tA partridge in a pear tree.\n\n");
					break;
				case 6:
					System.out.println("\tSeven swans a-swimming,\n\tSix geese a-laying,\n\tFive golden rings,\n\tFour calling birds," +
					"\n\tThree French hens,\n\tTwo turtle doves, and\n\tA partridge in a pear tree.\n\n");
					break;
				case 7:
					System.out.println("\tEight maids a-milking,\n\tSeven swans a-swimming,\n\tSix geese a-laying," +
					"\n\tFive golden rings,\n\tFour calling birds,\n\tThree French hens,\n\tTwo turtle doves, and\n\tA partridge in a pear tree.\n\n");
					break;
				case 8:
					System.out.println("\tNine ladies dancing,\n\tEight maids a-milking,\n\tSeven swans a-swimming,\n\tSix geese a-laying," +
					"\n\tFive golden rings,\n\tFour calling birds,\n\tThree French hens,\n\tTwo turtle doves, and\n\tA partridge in a pear tree.\n\n");
					break;
				case 9:
					System.out.println("\tTen lords a-leaping,\n\tNine ladies dancing,\n\tEight maids a-milking,\n\tSeven swans a-swimming," +
					"\n\tSix geese a-laying,\n\tFive golden rings,\n\tFour calling birds,\n\tThree French hens,\n\tTwo turtle doves, and" +
					"\n\tA partridge in a pear tree.\n\n");
					break;
				case 10:
					System.out.println("\tEleven pipers piping,\n\tTen lords a-leaping,\n\tNine ladies dancing,\n\tEight maids a-milking," +
					"\n\tSeven swans a-swimming,\n\tSix geese a-laying,\n\tFive golden rings,\n\tFour calling birds,\n\tThree French hens," +
					"\n\tTwo turtle doves, and\n\tA partridge in a pear tree.\n\n");
					break;
				case 11:
					System.out.println("\tTwelve drummers drumming,\n\tEleven pipers piping,\n\tTen lords a-leaping,\n\tNine ladies dancing," +
					"\n\tEight maids a-milking,\n\tSeven swans a-swimming,\n\tSix geese a-laying,\n\tFive golden rings,\n\tFour calling birds," +
					"\n\tThree French hens,\n\tTwo turtle doves, and\n\tA partridge in a pear tree.\n\n");
					break;
			}
		}
	}
}