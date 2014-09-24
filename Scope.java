public class Scope {
	public static void main(String[] args) {
		int int1 = 2;
		int int2 = 10;
		String string1 = "Hello";
		String string2 = "world";
		returnNull();
		{
			System.out.print("Three");
			String levels = "levels";
			{
				System.out.print(" " + levels);
				String of = "of";
				{
					System.out.println(" " + of + " scope");
				}
			}
		}
		System.out.println("returnInt() returns " + returnInt(int1, int2));
		String finalResult = returnString(string1, string2);
	}
	
	public static void returnNull() {
		System.out.println("In returnNull()");
	}
	
	public static int returnInt(int int1, int int2) {
		System.out.println("In returnInt()");
		return int1 * int2;		
	}
	
	public static String returnString(String string1, String string2) {
		System.out.println("In returnString()");
		return string1 + " " + string2;
	}
}