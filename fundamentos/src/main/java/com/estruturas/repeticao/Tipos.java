package com.estruturas.repeticao;

public class Tipos {

	public static void main(String[] args) {

		int qtdProdutos = 5;
		int registro = 0;

		// ESTRUTURAS DE REPETICÃO:

//		WHILE

		while (registro < qtdProdutos) {
			registro++;
			System.out.println("O produto número " + registro + " foi registrado");
		}

		
//	DO WHILE

		 do { registro++; System.out.println("O caixa registrou o produto " +
		 	registro); } while (registro < qtdProdutos);

		 
		
//	FOR

		 for (int i = 1; i <= qtdProdutos; i++) {
			 
		 	System.out.println("O caixa registrou o produto " + i); }

		
	}

}

