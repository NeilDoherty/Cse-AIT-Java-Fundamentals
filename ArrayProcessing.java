import java.util.Scanner;

public class ArrayProcessing {
	public static void main(String[] args) {
		/*exerciseA();
		exerciseB();
		exerciseC();
		dynamicHistogram();
		frequency();
		multiDimArray();*/
		studentGrades();
	}
	
	
	public static void exerciseA() {
		int []a = {10,20,30,40,50};
	
		for (int i = 0 ; i < a.length ; i ++) {
			System.out.println(a[i]);
		}
		for (int i:a) {
			System.out.println(i);
		}
	}
	
	public static void exerciseB() {
		int []b = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0 ; i < b.length ; i ++) {
			b[i] = sc.nextInt();
		}
		for (int j:b) {
			System.out.println(j);
		}
	}
	
	public static void exerciseC() {
		int []n = {19,3,15,7,11,9,13,17,1};
		System.out.println("Element\tValue\tHistogram\n");
		for (int i = 0 ; i < n.length ; i ++) {
			System.out.print("[" + i + "]\t" + n[i] + "\t");
			int x = n[i];
			for (int j = 0 ; j < x ; j ++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void dynamicHistogram() {
		System.out.println("Enter array size: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int []a = new int[size];
		System.out.println("Enter array values: ");
		for (int i = 0 ; i < a.length ; i ++) {
			a[i] = sc.nextInt();
		}
		for (int j = 0 ; j < a.length ; j ++) {
			int length = a[j];
			for (int k = 0 ; k < length ; k ++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void frequency() {
		int []responses = {1,2,6,4,8,5,9,7,8,10,1,6,3,8,6,10,3,8,2,7};
		int []frequency = {0,0,0,0,0,0,0,0,0,0,0};
		for (int i:responses) {
			frequency[i] ++;
		}
		for (int k:frequency) {
			System.out.println(k);
		}
	}
	
	public static void multiDimArray() {
		int [][]arr = {{1,2,3},{4,5,6}};
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print("[");
			for (int j = 0 ; j <= arr.length ; j++) {
				if (j > arr.length - 1) {
					System.out.print(arr[i][j]);
				}
				else {
					System.out.print(arr[i][j] + ", ");
				}
			}
			System.out.println("]");
		}
	}
	
	public static void studentGrades() {
		int [][]studentGrades = {{77,68,86,73},{96,87,89,78},{70,90,86,81}};
		System.out.println("The array is:");
		printArray(studentGrades);
	}
	
	public static void printArray(int[][] studentGrades) {
		for (int i = 0 ; i < studentGrades.length ; i ++) {
			if (i == 0) {
				System.out.print("\t\t\t");
				for (int x = 0 ; x < studentGrades.length ; x ++)
				{
					System.out.print("[" + x + "]\t\t");
				}
				System.out.println("\n");
			}
			System.out.print("studentGrades[" + i + "]\t");
			for (int j = 0 ; j < studentGrades.length ; j ++) {
				System.out.print(studentGrades[i][j] + "\t\t");
			}
			System.out.println();
		}
	}
}