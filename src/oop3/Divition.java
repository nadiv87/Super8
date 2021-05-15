package oop3;

public class Divition {

	void div(int x, int y) {
		int d = x / y;
		System.out.println(d);
	}

	public static void main(String[] args) {
		Divition d1 = new Divition();
		d1.div(100, 10);
	}// end of main

}// end of class
