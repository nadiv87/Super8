package extra;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		int x = 10;
		int y = 15;

		x = y;
		y = 10;
		System.out.println(x);
		System.out.println(y);

	}// end of main

}// end of class
