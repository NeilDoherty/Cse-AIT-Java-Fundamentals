//Java uses call-by-value only. If you are passing a reference (to and array or object), the effect is similar to call-by-reference i.e. the called
// method can change the object array in the calling method.

class Watch {
	private int theNumberOfHands;
	
	public Watch() {
		theNumberOfHands = 2;
	}
	
	public int getTheNumberOfHands() {
		return theNumberOfHands;
	}
	
	public void setTheNumberOfHands(int aTheNumberOfHands) {
		theNumberOfHands = aTheNumberOfHands;
	}
}

public class PassingArguments {
	public static void main(String[] args) {
		// 1. pass in a variable of a primitive type, e.g. an int. Result: no change.
		int a = 10;
		System.out.println("primitive before == " + a);
		primitiveExample(a);
		System.out.println("primitive after == " + a);
		double d = 55.6;
		System.out.println("primitive before == " + d);
		primitiveExample2(d);
		System.out.println("primitive after == " + d);
		
		// 2. pass in a reference to an object
		
		Watch rolex = new Watch();
		System.out.println("Number of hands before is " + rolex.getTheNumberOfHands());
		objectReferenceExample(rolex);
		System.out.println("Number of hands after is " + rolex.getTheNumberOfHands());
		
		// 3. pass in an array (an array reference to be exact)
		
		int [] ia = {1,2,3,4,5};
		for (int i = 0 ; i < ia.length ; i ++) {
			System.out.println("ia[" + i + "] == " + ia[i]);
		}
		
		fullArrayExample(ia);	// pass down the array reference
		
		for (int i:ia) {	// for each int i in the array ia
			System.out.println(i);
		}
		
		System.out.println("ia[0] before == " + ia[0]);
		arrayElementExample(ia[0]);
		System.out.println("ia[0] after == " + ia[0]);
		
		String name = "Sean";
		System.out.println(name);
		stringExample(name);
		System.out.println(name);
		name = "Kennedy";
		System.out.println(name);
	}
	
	public static void stringExample(String n) {
		n = "Bob";
	}
	
	public static void fullArrayExample( int []array) {
		for (int i:array) {
			i *= 2;	// array[i] = array[i] * 2;
			System.out.println(i);
		}
	}
	
	public static void arrayElementExample(int x) {
		x = 999;
	}
	
	public static void objectReferenceExample(Watch watch) {
		watch.setTheNumberOfHands(1);
	}
	
	public static void method1(int y) {
		y = 99;
	}
	
	public static void primitiveExample(int x) {
		//x is a copy of a from main()
		x = 50;
		method1(x);
		System.out.println("primitive after == " + x);
	}
	
	public static void primitiveExample2(double x) {
		//x is a copy of d from main()
		x = 50.9;
	}
}