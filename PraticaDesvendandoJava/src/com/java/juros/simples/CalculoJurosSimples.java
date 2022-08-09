package com.java.juros.simples;

public class CalculoJurosSimples {

	public static void main(String[] args) {
		int prestacoes = 8;
		double jurosMensal = 0;
		double valorEmprestado = 999.00;
		double jurosPeriodo = prestacoes * jurosMensal;
		double valorTotal = valorEmprestado * (1 + jurosPeriodo);
		double valorJuros = valorTotal - valorEmprestado;
		double valorParcela = valorTotal / prestacoes;
		System.out.println("Valor total a pagar: " + valorTotal);
		System.out.println("Valor dos juros: " + valorJuros);
		System.out.println("Valor da parcela: " + valorParcela);

	}

}
