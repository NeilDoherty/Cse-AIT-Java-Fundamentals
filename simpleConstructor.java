class Rock {
	public Rock() {
		System.out.println("Creating a Rock...");
	}
	
	public Rock(int i) {
		System.out.println("Creating a Rock..." + i);
	}
}

public class simpleConstructor {
	public static void main(String[] args) {
		System.out.println("Before for loop");
		for (int i = 0 ; i < 6 ; i ++) {
			new Rock();
			new Rock(i);
		}
		System.out.println("After for loop");
	}
}