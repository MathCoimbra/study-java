package com.modificador_static;

public class Teste {

	public static void main(String[] args) {

		// Devido o método"recuperarTotal" ser estático não é preciso de uma instância
		// da classe AcessoCatraca conforme abaixo:

		int total = AcessoCatraca.recuperarTotal();
		System.out.println("Total " + total);

		// O mesmo se aplica por exemplo a métodos estáticos da classe Math, conforme
		// abaixo:

		long numero = Math.round(2.9);
		System.out.println("Número arredondado: " + numero);

		// Já se for necessário chamar o método "entrar" que não é estático, é
		// necessário instanciar:

		AcessoCatraca a1 = new AcessoCatraca();
		a1.entrar("Thiago");

		AcessoCatraca a2 = new AcessoCatraca();
		a2.entrar("Leandro");

		// Abaixo será impresso a quantidade de vezes que o método foi chamado:
		
		int total2 = AcessoCatraca.recuperarTotal();
		System.out.println("Total " + total2);

	}

}
