import java.util.Scanner;

public class sampleQuestion {
	public static void main(String[] args) {
		calculateTotal();
	}
	
	public static void calculateTotal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer type (r,c,t) or press x to exit: ");
		char customerType = sc.next().charAt(0);
		if ((customerType != 'X') || (customerType != 'x')) {
			System.out.println("Enter subtotal: ");
			double subTotal = sc.nextDouble();
			double discountPercentage = getDiscountPercent(subTotal, customerType);
			double discountAmount = subTotal * discountPercentage;
			double total = subTotal - discountAmount;
			System.out.println("Total discount is: " + total);
		}
	}
	
	public static double getDiscountPercent(double subTotal, char customerType) {
		double discountPercentage = 0.0;
		if ((customerType == 'R') || (customerType == 'r')) {
			if (subTotal < 101) {
				discountPercentage = 0.0;
			}
			else if ((subTotal > 100) && (subTotal < 250)) {
				discountPercentage = 10.0;
			}
			else if ((subTotal > 249) && (subTotal < 500)) {
				discountPercentage = 25.0;
			}
			else if (subTotal > 499) {
				discountPercentage = 30.0;
			}
		}
		else if ((customerType == 'C') || (customerType == 'c')) {
			discountPercentage = 20.0;
		}
		else if ((customerType == 'T') || (customerType == 't')) {
			if (subTotal < 500) {
				discountPercentage = 40.0;
			}
			else if (subTotal > 499) {
				discountPercentage = 50.0;
			}
		}
		return discountPercentage;
	}
}