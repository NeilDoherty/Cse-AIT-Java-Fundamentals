public class breakContinueTesting {
	public static void main(String[] args) {
		loops();
	}
	
	public static void loops() {
		outerLoop:
		for (int i = 1 ; i <= 3 ; i++) {
			System.out.println("i = " + i);
			for (int j = 1 ; j < 3 ; j++) {
				System.out.println("\tj = " + j);
				if (j == 2) {
					break outerLoop;
				}
			}
		}		
		System.out.println("Finished loops");
	}
}