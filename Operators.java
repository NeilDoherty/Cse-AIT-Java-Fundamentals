public class Operators {
	public static void main(String[] args) {
		int x=0, w=0, y=0, z=0;
		x=4;
		
		//Same rules as used in IncrementDecrement program
		
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(x);
		System.out.println(--x);
		System.out.println(x--);
		System.out.println(x);
		w=20;x=10;y=-5;z=0;
		
		//Prints out booleans based on truthfulness of statements
		
		System.out.println(w == x && y != z);
		System.out.println(w == x || y != z);
		System.out.println(!(w == (x+z)));
	}
}