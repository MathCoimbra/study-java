package com.methods;

public class Methods {
	
	// Método que não retorna nenhum valor: 
	
	static void soma(int a, int b) {
		int s = a + b;
		System.out.println("A soma é " + s);
	}
	
	// Método que retorna algum valor:
	
	static int multiplicar(int A, int B) {
		int m = A * B;
		return m;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Teste"); // esse segundo sysout é executado primeiro pois o método 
		// main é sempre executado primeiro, apesar de ter
		
		// Chamando método somar
		soma(5,2);
		
		// Chamando método multiplicar
		int r = multiplicar(8,5);
		System.out.println("A multiplicação é: " + r);
		
		// Chamando método de outra classe
		System.out.println("Vai começar a contagem");
		System.out.println(Methods2.contador(1, 10));
		
	}
}