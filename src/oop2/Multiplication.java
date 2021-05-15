package oop2;

import oop1.Addition;

public class Multiplication extends Addition {

	void multiple(int x, int y) {
		int m = x * y;
		System.out.println(m);
	}

	public static void main(String[] args) {

		Multiplication m1 = new Multiplication();
		m1.multiple(10, 10);

	}// end of main

}// end of class
