import java.util.Scanner;

public class Circle {
	
	private final static double PI = 3.14159;
	
	public static void main(String[] args) {
		System.out.println("Please enter radius:");
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		double area = PI * Math.pow(radius, 2);
		double circumference  = 2 * PI * radius;
		double diameter = 2 * radius;
		System.out.println("Radius is " + radius + " giving a area of " + area + " , circumference of " + circumference + " and diameter of " + diameter);
	}
}