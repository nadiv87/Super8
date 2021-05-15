package interm;

public class Subtraction {

	int x;
	int y;

	void sub() {
		int sub;
		sub = x - y;
		System.out.println(sub);
	}// end of sub

	int sub(int a, int b, int c) {
		int sub;
		sub = a - b - c;
		System.out.println(sub);
		return sub;
	}

	double sub(double a, double b, double c) {
		double sub = a - b - c;
		System.out.println(sub);
		return sub;

	}

	public static void main(String[] args) {

		Subtraction a1 = new Subtraction();
		a1.x = 10;
		a1.y = 15;
		a1.sub();
		a1.sub(10, 10, 10);
		a1.sub(10.5, 10.5, 10.0);

		Subtraction a2 = new Subtraction();
		a2.x = 5000;
		a2.y = 100000;
		a2.sub();

	}// end of main

}// end of class
