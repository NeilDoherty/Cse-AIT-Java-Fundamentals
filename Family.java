class Person {
private int age;
private static int count;
private String name;
private String address;

	public Person (int aAge, String aName, String aAddress) {
		this.age = aAge;
		this.name = aName;
		this.address = aAddress;
		Person.count++;
	}

	public String getName () {
		this.count++;
		return name;
		//return this.name is the same
	}

	public Person setName (String aName) {
		name = aName;
		return this;
	}

	public int getAge () {
		return age;
	}

	public Person setAge (int aAge) {
		age = aAge;
		return this;
	}

	public String getAddress () {
		return address;
	}

	public Person setAddress (String aAddress) {
		address = aAddress;
		return this;
	}

	public int getCount () {
		this.count++;
		return count;
	}

	@Override
	public String toString () {
		return "name is " + name + " living in " + address + " age " + age;
	}
}

public class Family {
	private static int n = 0;	//instance variable changed to class variable with static
	
	public static void main(String[] args) {
		n = 4;
		Person neil = new Person(23, "neil", "dublin");
		Person neil1 = new Person(23, "neil", "dublin");
		Person neil2 = new Person(23, "neil", "dublin");
		System.out.println(neil);
		neil.setName("").getCount();
	}
}