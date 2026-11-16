package com.string;

public class Declaracao {

	public static void main(String[] args) {
		// STRING - Formas de declaração

		// 1° forma:

		// Declaração
		String nome;
		// Instanciação
		nome = new String();
		// Inicialização:
		nome = "Maça";

		// 2° forma:

		// Declaração // Instanciação // Inicialização (através do construtor)
		String nome2 = new String("Banana");

		// 3° forma:

		// Declaração // Inicialização
		String nome3 = "Maça";

		// Nesta última forma o dado será armazenado em um pool de memória (equivalente
		// a cache do Java) e não uma área própria da variável assim como nas demais, pois
		// desta forma não foi realizada a instanciação
	}
	
}
