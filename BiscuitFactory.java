import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BiscuitFactory {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String brand = getBrand();
		String maker = getMaker();
		int weight = getWeight();
		int biscuits = getNumberOfBiscuits();
		String date = getBestBeforeDateAs();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date bestBeforeDate = null;
		try {
			bestBeforeDate = sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Biscuit jacobs = new Biscuit(brand, maker, biscuits, weight, bestBeforeDate);
		System.out.println(jacobs);
	}

	public static String getBrand() {
		System.out.println("Enter brand");
		return sc.nextLine();
	}

	public static String getMaker() {
		System.out.println("Enter maker");
		return sc.nextLine();
	}

	public static int getWeight() {
		System.out.println("Enter weight");
		return sc.nextInt();
	}

	public static int getNumberOfBiscuits() {
		System.out.println("Enter no. of biscuits");
		return sc.nextInt();
	}
	
	public static String getBestBeforeDateAs() {
		System.out.println("Enter best before date: yyyy-mm-dd");
		return sc.next();
	}
}