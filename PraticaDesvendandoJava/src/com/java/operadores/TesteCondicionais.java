package com.java.operadores;

public class TesteCondicionais {

	public static void main(String[] args) {
		int i = 2;
		int j = 2;
		int k = 10;
		int z = 0;
		boolean b = true;
		boolean c = true;
		boolean f = false;

		System.out.println(i + " igual a " + j + " : " + (i == j));
		System.out.println(i + " maior que " + k + " : " + (i > k));
		System.out.println(i + " menor que " + k + " : " + (i < k));

		System.out.println(i + " menor que " + z + " : " + (i < z));
		System.out.println(i + " maior ou igual a " + j + " : " + (i >= j));
		System.out.println(i + " menor ou igual a " + j + " : " + (i <= j));
		System.out.println((i < 3) ? i + " menor que 3 " : i + " maior que 3 ");
		System.out.println(b + " && " + c + " = " + (b));
		System.out.println(b + " && " + f + " = " + (b && f));
		System.out.println(b + " || " + f + " = " + (b || f));

	}

}
