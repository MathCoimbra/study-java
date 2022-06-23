package com.unaryoperators;

public class UnaryOperators {

	public static void main(String[] args) {

		// Pós-incremento

		int numero = 5;
		int numero2 = 5 + numero++;
		System.out.println(numero); // aqui é realizado o pós incremento, sendo o resultado - 6
		System.out.println(numero2); // aqui o resultado não é 11, e sim 10, pois somente é realizada a soma do 5
										// pelo valor do numero que é posteriormente incrementado

		// Pré-incremento

		int numero3 = 5;
		int numero4 = 5 + ++numero3;
		System.out.println(numero3); // aqui é realizado o pré incremento, e assim como o pós incremento o resultado é 6
		System.out.println(numero4); // aqui o resultado é 11, pois é realizada a soma junto ao numero que já está pré incrementado

	}

}
