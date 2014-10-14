class tree {
	private int height;
	public tree() {
		height = 0;
		System.out.println("You're planting a seedling...");
	}
	
	public tree(int height) {
		this.height = height;
	}

	public void info(String s) {
		System.out.println(s + " Tree is " + height  + " feet tall");
	}

	public void info() {
		System.out.println("Tree is " + height  + " feet tall");
	}
}

public class overloading {
	public static void main(String[] args) {
		new tree();
		for ( int i = 0 ; i < 6 ; i ++) {
			tree t = new tree(i);
			t.info();
			t.info("Neil's");
		}
	}
}