package com.java.produto;

public class TesteProduto2 {

	public static void main(String[] args) {
		Produto livro1 = new Produto();
		livro1.codigo = "UNIJAVA-01";
		livro1.descricao = "Universidade Java";
		livro1.quantidade = 20;
		livro1.preco = 155.00;
		System.out.println(livro1);
		System.out.println(livro1.codigo);
		System.out.println(livro1.descricao);
		System.out.println(livro1.quantidade);
		System.out.println(livro1.preco);
		System.out.println();
		Produto livro2 = new Produto();
		livro2.codigo = new String ("DOSHACKER-01");
		livro2.descricao = new String ("Dossie Hacker");
		livro2.quantidade = 15;
		livro2.preco = 366.00;
		System.out.println(livro2);
		System.out.println(livro2.codigo);
		System.out.println(livro2.descricao);
		System.out.println(livro2.quantidade);
		System.out.println(livro2.preco);

	}

}





