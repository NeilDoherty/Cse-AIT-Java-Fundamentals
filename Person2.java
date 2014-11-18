import java.util.ArrayList;
import java.util.Scanner;

public class Person2 {

	private static int age;
	private static String name;
	private static String address;

	public static void main(String[] args) {
		arrayListPerson(age, address, address);
	}
	
	public Person2(int age1, String name1, String address1) {
		this.age = age1;
		this.name = name1;
		this.address = address1;
	}
	
	public static void arrayListPerson(int age1, String name1, String address1) {
		ArrayList<Person2> people = new ArrayList<>();
		while (true) {
			System.out.println("Enter age:");
			Scanner sc = new Scanner(System.in);
			age1 = sc.nextInt();
			System.out.println("Enter name:");
			name1 = sc.next();
			System.out.println("Enter address:");
			address1 = sc.next();
			Person2 p = new Person2(age, name, address);
			people.add(p);
			System.out.println("Continue? (y/n)");
			if (sc.next().equalsIgnoreCase("n")) {
				break;
			}
		}
		for (Person2 q : people) {
			System.out.println(q);
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", address=" + address
				+ "]";
	}
}