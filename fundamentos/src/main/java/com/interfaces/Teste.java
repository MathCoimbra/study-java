package com.interfaces;

public class Teste {

	public static void main(String[] args) {

		// para referenciar o método default basta instanciar a classe e chamar o método
		Corredor corredor = new Avestruz();
		corredor.parar();

		// para referenciar o método static é necessário somente chamar a classe visto
		// que o método não foi sobreescrito na classe Avestruz
		Corredor.acelerar();

		// utilização do instanceof para validar se uma classe é do tipo de uma
		// interface ou de uma herança
		
		// no caso abaixo validação para saber se é do tipo de uma interface, ou seja, da
		// interface Corredor

		Corredor avestruz = new Avestruz();

		if (avestruz instanceof Corredor) {
			System.out.println("É um corredor");
		} else {
			System.out.println("Não é um corredor");
		}

		// no caso abaixo validação para saber se é do tipo de uma herança, ou seja, da
		// classe Animal

		Corredor avestruz2 = new Avestruz();

		if (avestruz2 instanceof Animal) {
			System.out.println("É um animal");
		} else {
			System.out.println("Não é um animal");
		}
	}

}
