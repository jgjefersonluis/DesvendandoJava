package com.java.operadores;

public class Aninhados {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 9) {
			for (int j = 1; j <= 10; i++) {
				System.out.println(i + "" + j + ",");
			}
			System.out.println();
			i++;
		}

	}

}
