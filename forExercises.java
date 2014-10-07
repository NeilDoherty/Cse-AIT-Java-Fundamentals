import java.util.Scanner;

public class forExercises {
	
	final static int NUM_INPUTS = 3;
	
	public static void main(String[] args) {
		/*forHeaderTesting();
		forSmallestLargest();
		forHistogram();
		forAverage();*/
		forSequence();
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
}