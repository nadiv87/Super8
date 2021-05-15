package basic;

public class SubtractDecimal {

	public static void main(String[] args) {

		double x;
		double y;
		x = 35.75;
		y = 75.45;
		double subtract;
		if (x > y)
			subtract = x - y;
		else
			subtract = y - x;

		System.out.print(subtract);

	}// end of main

}// end of SubtractDecimal
