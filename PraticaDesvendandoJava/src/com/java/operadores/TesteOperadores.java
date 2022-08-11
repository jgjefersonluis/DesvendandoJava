package com.java.operadores;

public class TesteOperadores {

	public static void main(String[] args) {
		int i = 2 + 10;
		System.out.println("Somando 2 + 10 = " + i);

		int j = i * 2;
		System.out.println("Multiplicando " + j);

		int h = j - 5;
		System.out.println("Subtração = " + j + " -5 " + h);

		double d = h / 3;
		System.out.println("Dividindo = " + h + " /3 " + d);

		int r = h % 3;
		System.out.println("Resto de = " + h + " por 3 = " + r);

		int x = i++;
		System.out.println("Incrementando = " + i + " em 1 = " + x);

		int z = j - i;
		System.out.println("Decrementando = " + j + " em 1 = " + z);

	}

}
