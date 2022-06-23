package com.vectores;

import java.util.Arrays;

public class Vectores {

	public static void main(String[] args) {

		// forma simplificada de atribuição de valores em um vetor:
		int n[] = { 5, 2, 4 };

		/*
		 * outra forma de atribuição: int n2[] = new int [3]; informando a quantidade de
		 * itens do vetor, no caso 3 itens n [0] = 5; n [1] = 2; n [2] = 4;
		 */

		// atributo length para extrair a quantidade de itens do vetor:

		System.out.println("Total de casas de N é " + n.length);

		for (int c = 0; c <= 2; c++) { // variável contadora c para atribuir a quantidade de itens do vetor n criado
										// também poderia ser usado o atributo length

			System.out.println("Na posição " + c + " tem o valor " + n[c]); // print dos valores da variável
																			// considerando o c como o índice
		}
	
		
		int n3[] = { 16, 04, 17, 02, 22 };
		
		// ordenando lista:
		
		Arrays.sort(n3);
		System.out.println("Lista ordenada:");
		
		for (int valor : n3) {
			System.out.println(valor);
		}
		
		// procurando um item da lista:
		
		int posicao = Arrays.binarySearch(n3, 22);
		
		System.out.println("Encontrei o valor na posição " + posicao);
		
		
		int n4[] = new int[10];
		
		// atribuir um mesmo valor para vários itens de um vetor, no caso abaixo todos os valores com 10
		Arrays.fill(n4,10);
		
		for (int valor: n4) {
			System.out.println(valor);
			
		}		
	}
}
