package com.java.operadores;

public class TestePrecedencia {

	public static void main(String[] args) {
		int x = 2 + 3 / 5 * 7 - 6;
		System.out.println("2+3/5*7-6 = " + x);

		int j = (2 + 3) / (5 * 7) - 7;
		System.out.println("(2+3)/(5*7)-7 = " + j);

		int z = 2 + 3 / 5 * (7 - 6);
		System.out.println("2+3/5*(7-6) = " + z);

	}

}
