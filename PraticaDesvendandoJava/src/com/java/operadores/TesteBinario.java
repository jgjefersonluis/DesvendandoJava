package com.java.operadores;

public class TesteBinario {

	public static void main(String[] args) {
		int i = 2 & 10;
		System.out.println("Soma de 2 e 10 bit " + i);
		
		int j = 2|10;
		System.out.println("Multiplicação de 2 a 10 bit a bit = " + j);
		
		int k = 2 ^ 10;
		System.out.println("Complemento de 10 para 2 = " + k);
		
		int x = 1000;
		int div = x >> 2;
		System.out.println("Rotacionando à direita " + x + " >> 2 = " + div);
		
		int mult = x << 2;
		System.out.println("Rotacionando à esquerda " + x + " << 2 = " + mult);

	}

}
