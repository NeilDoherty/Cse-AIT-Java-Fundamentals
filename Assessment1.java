import java.util.Scanner;

// Neil Doherty - A00226313

public class Assessment1 {
	public static void main(String[] args) {
		number1();
		number2();
		number3();
		number4(50, 5);
		System.out.println(number4(50, 5));
	}

	public static void number1() {
		double shippingBase = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter shipping method: ");
		String shippingMethod = sc.next();
		if (shippingMethod.equals("UPS")) {
			System.out.println("Enter weight: ");
			double weight = sc.nextDouble();
			if (weight <= 5) {
				shippingBase = 4.95;
			}
			else if ((weight <= 10) && (weight > 5)) {
				shippingBase = 7.95;
			}
			else if (weight > 10) {
				shippingBase = 10.95;
			}
		}
		else if (shippingMethod.equals("FEDEX")) {
			shippingBase = 7.95;
		}
		else {
			shippingBase = 9.95;
		}
		System.out.println(shippingBase);
	}

	public static void number2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter one of the following letters (A/B/G/D/E/S/O) : ");
		char c = sc.next().charAt(0);
		c = Character.toUpperCase(c);
		String map = null;
		int index = 0;
		int lock = 0;
		switch (c) {
			case 'A':
				map = "A maps to: ";
				index = 1;
			break;
			case 'B':
				map = "B maps to: ";
				index = 2;
			break;
			case 'G':
				map = "G maps to: ";
				index = 3;
			break;
			case 'D':
				map = "D maps to: ";
				index = 4;
			break;
			case 'E':
				map = "E maps to: ";
				index = 5;
			break;
			case 'S':
				map = "S maps to: ";
				index = 18;
			break;
			case 'O':
				map = "O maps to: ";
				index = 24;
			break;
			default:
				System.out.println("Invalid input " + c);
				lock = 1;
			break;
		}
		final int ALPHA = 1; final int BETA = 2; final int GAMMA = 3;
		final int DELTA = 4; final int EPSILON = 5; final int SIGMA = 18;
		final int OMEGA = 24;
		if (lock == 0) {
			switch (index) {
				case ALPHA:
					System.out.println(map + "ALPHA");
				break;
				case BETA:
					System.out.println(map + "BETA");
				break;
				case GAMMA:
					System.out.println(map + "GAMMA");
				break;
				case DELTA:
					System.out.println(map + "DELTA");
				break;
				case EPSILON:
					System.out.println(map + "EPSILON");
				break;
				case SIGMA:
					System.out.println(map + "SIGMA");
				break;
				case OMEGA:
					System.out.println(map + "OMEGA");
				break;
				default:
					System.out.println("Unable to match " + index);
				break;
			}
		}
	}

	public static void number3() {
		outOfLoops:
		for (int i = 1 ; i < 4 ; i++) {
			for (int j = 1 ; j < 4 ; j++) {
				if ((i == 2) && (j == 2)) {
					System.out.println("Length ==" + i + "; width ==" + j + "; Area ==" + i * j);
					break outOfLoops;
				}
				else {
					System.out.println("Length ==" + i + "; width ==" + j + "; Area ==" + i * j);
				}
			}
		}
	}

	public static int number4(int x, int y) {
		int sum = 0;
		int sub = 0;
		for (int i = 0 ; i < 8 ; i++) {
			sub = x - y;
			x -= 5;
			sum += sub;
		}
		return sum;
	}
}