public class IncrementDecrement {
	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		System.out.println(x);
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(x);
		
		//++x increments before LHS prints x value. x++ increments after LHS prints giving the same output twice
		
		System.out.println(y);
		System.out.println(--y);
		System.out.println(y--);
		System.out.println(y);
		
		//--y decrements before LHS prints y value. y-- decrements after LHS prints giving the same output twice
	}
}