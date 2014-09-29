import java.util.Scanner;

public class StringComparison {
	public static void main(String[] args) {
		usingScanner();	
		usingNewOnce();
		usingNewTwice();
		interningTheStringLiteral();
	}
	
	public static void usingScanner() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String s1 = sc.next();
		System.out.println("Enter string 2: ");
		String s2 = sc.next();
		
		System.out.println("Scanner : using == returns: " + (s1 == s2));
		
		System.out.println("Scanner : using .equals() returns: " + (s1.equals(s2)));
	}
		
	public static void usingNewOnce() {
		String name1 = "john";
		String name2 = new String("john").intern();
		
		System.out.println("usingNewOnce(): using == returns: " + (name1 == name2));
		
		System.out.println("usingNewOnce(): using .equals() returns: " + (name1.equals(name2)));
	}
	
	public static void usingNewTwice() {
		String name1 = new String("john");
		String name2 = new String("john");
		
		System.out.println("usingNewTwice(): using == returns: " + (name1 == name2));
		
		System.out.println("usingNewTwice(): using .equals() returns: " + (name1.equals(name2)));
	}
	
	public static void interningTheStringLiteral() {
		String s1 = "sean";	//interned
		String s2 = "sean";	//refers to the interned string literal
		
		System.out.println("interningTheStringLiteral(): using == returns: " + (s1 == s2));
		
		System.out.println("interningTheStringLiteral(): using .equals() returns: " + (s1.equals(s2)));
	}
}