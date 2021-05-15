package oop1;

public class Subtraction extends Addition {

	void sub(int a, int b) {
		int s = a - b;
		System.out.println(s);
	}

	public static void main(String[] args) {
		Subtraction s1 = new Subtraction();
		s1.sub(100, 10);
		s1.add(10, 10, 10);

	}// end of main

}// end of class
