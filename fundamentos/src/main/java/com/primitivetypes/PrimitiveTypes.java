package com.primitivetypes;

import java.util.Scanner;

public class PrimitiveTypes {
	
	public static void main(String[] args) {
		
		// Saída de dados
		float resultado = 8.5f;
		System.out.printf("A nota é %.2f \n", resultado);
		
		// Entrada e saída de dados
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o nome do aluno: ");
		String nome = teclado.nextLine();
		System.out.print("Digite a nota dele(a): ");
		Float nota = teclado.nextFloat();
		System.out.printf("O aluno(a) %s tirou %.2f", nome, nota);
		
		// Conversão de inteiro para string
		
		int idade = 30;
		String valor = Integer.toString(idade);
		
		// Conversão de string para inteiro
		
		String valor2 = "30";
		int idade2 = Integer.parseInt(valor2);
		
		// Conversão de string para número real
		
		String valor3 ="30";
		float idade3 = Float.parseFloat(valor3);
		
	}

}
