package com.modificador_final;

public class Circulo {

	// ao definir o modificador final em um atributo significa que o valor deste não
	// será alterado, conforme abaixo:
	private final double NUMERO_PI = 3.1416;

	private double raio;
	
	// ao retirar as tags abaixo é possível validar que o código não compila devido
	// estar sendo atribuído um novo valor a um atributo constante


	/*
	 * public double calcularArea() { raio = 10; // OK NUMERO_PI = 10; //Não Compila
	 * return NUMERO_PI * raio * raio; }
	 */

	// o modificador também pode ser utilizado em métodos conforme abaixo, o mesmo
	// somente não poderá ser sobreescrito conforme classe de exemplo Circulo2

	public final double calcularArea() {
		return NUMERO_PI * raio * raio;
	}
	
}