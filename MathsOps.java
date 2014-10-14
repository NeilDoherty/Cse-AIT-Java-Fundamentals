import java.util.Scanner;

public class MathsOps {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		sc = new Scanner(System.in);
		double num2 = sc.nextDouble();
		double sum = num1 + num2;
		double product = num1 * num2;
		double difference = Math.abs(num1 - num2);
		double quotient = num1 / num2;
		System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
		System.out.println("The product of " + num1 + " and " + num2 + " is " + product);
		System.out.println("The difference of " + num1 + " and " + num2 + " is " + difference);
		System.out.println("The quotient of " + num1 + " and " + num2 + " is " + quotient);
	}
}