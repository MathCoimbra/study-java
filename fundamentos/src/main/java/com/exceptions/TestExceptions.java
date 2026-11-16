package com.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExceptions {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			// Lê os dois números
			System.out.print("Qual o valor do primeiro número? ");
			int numero1 = sc.nextInt();
			System.out.print("Qual o valor do segundo número? ");
			int numero2 = sc.nextInt();
			// Realiza a divisão
			int divisao = numero1 / numero2;
			// Exibe o resultado
			System.out.println("O resultado é: " + divisao);
			// trata a exceção ArithmeticException que apresentará caso o segundo valor seja
			// zero
		} catch (ArithmeticException e) {
			// print no formato de erro:
			System.err.println("Erro ao dividir!");
			// trata a exceção InputMismatchException que apresentará caso algum valor não
			// seja do tipo int
		} catch (InputMismatchException e) {
			System.err.println("Erro de entrada de dados!");
			// encerra o programa com o finally independente de qualquer ação
		} finally {
			System.out.println("Finalizando a execução do programa!");
			sc.close();
		}

		int[] array = new int[2];

		try {
			// Tenta acessar uma posição inexistente do vetor
			array[2] = 10;
		} catch (ArrayIndexOutOfBoundsException e) {
			// método para retornar a mensagem de erro:
			System.err.println("Mensagem de erro: " + e.getMessage());
			// método para mostrar o número da linha e classe onde a exceção foi gerada
			e.printStackTrace();
		}

		// Criando exceções unchecked e checked

		// No exemplo abaixo tem-se uma exceção do tipo unchecked, onde o erro será apresentado na execução do código
		
		try {
			int valor = 10 / 0;
			System.out.println(valor);
		} catch (Exception e) {
			throw new DivisaoPorZeroException();
		}
		
		// No exemplo abaixo tem-se uma exceção do tipo checked, onde o erro (que está comentado) está
		// acontecendo na compilação do código e para resolver isso deve ser postergado a exception, através do
		// throws, para o método chamador

		try {
			int valor2 = 10 / 0;
			System.out.println(valor2);
		} catch (Exception e) {
//			throw new DivisaoPorZeroException2();
		}
	}
}
