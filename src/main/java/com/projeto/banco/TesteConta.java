package com.projeto.banco;

public class TesteConta {

	public static void main(String[] args) {

		// Para instanciar a classe é informado o nome da classe o tipo dessa classe (a
		// variável) e o operador new para criação do objeto:

		Conta contaCorrente = new Conta();
		Conta contaPoupanca = new Conta();
		Conta contaInvestimento = new Conta();

		// Associando os atributos/variáveis e valores aos novos objetos:
		
		// Esses atributos também são chamados de variáveis de instância

		contaCorrente.numero = 178568;
		contaCorrente.saldo = 2000.00;
		contaCorrente.cliente.nome = "Matheus";
		contaCorrente.cliente.idade = 19;

		contaPoupanca.numero = 178593;
		contaPoupanca.saldo = 0;
		contaPoupanca.cliente.nome = "Fulano";
		contaPoupanca.cliente.idade = 80;

		contaInvestimento.numero = 254693;
		contaInvestimento.saldo = 100.00;
		contaInvestimento.cliente.nome = "Matheus";
		contaInvestimento.cliente.idade = 19;

		// Imprimindo o valor na tela:

		System.out.println(contaCorrente.numero);
		System.out.println(contaCorrente.saldo);
		System.out.println(contaCorrente.cliente.nome);
		System.out.println(contaCorrente.cliente.idade);

		// Instanciando novo objeto para utilizar o construtor de forma manual, de forma
		// que ao adicionar os valores no objeto, já reflete para o n�mero e saldo da
		// conta que foi definido no construtor manual:

		Conta cc = new Conta(25681, 19819, 500.00);

		// Imprimindo valor do saldo definido acima atrav�s da fun��o de recuperar
		// saldo:

		System.out.println(cc.getNumero());
		System.out.println(cc.getSaldo());

		// Utilizando a herança:

		/// Instanciando novo objeto a partir da classe ContaCorrente e utilizando os
		/// métodos tanto da superclasse (Conta) quanto da própria classe:

		ContaCorrente CC = new ContaCorrente();

		CC.setAgencia(40004);
		CC.setNumero(124635);
		CC.setTipo("PF");
		CC.setChequeEspecial(5000);

		/// Instanciando novo objeto a partir da superclasse OBS.: ao fazer isso somente
		/// será possível utilizar os atributos dessa superclasse:

		Conta CC2 = new ContaCorrente();

		CC2.setAgencia(5463);
		CC2.setNumero(4589);

		//// Para que a variável CC2 possa acessar também os atributos da subclasse
		//// (ContaCorrente) é necessário fazer um downcasting, processo que possibilita
		//// o atributo acessar
		//// os métodos da subclasse:

		ContaCorrente conta = (ContaCorrente) CC2;
		conta.setChequeEspecial(1234);
		conta.setTipo("PJ");

		///// Ao realizar o processo de downcasting deve ser analisado se o objeto em
		///// que está sendo utilizado no cast está na mesma hierarquia,
		///// caso por exemplo estivesse desta forma:

		/*
		 * Conta c4 = new Conta();
		 * 
		 * ContaCorrente c5 = (ContaCorrente) c4;
		 */

		///// o Java iria apresentar um erro pois a variável c4 não está na mesma
		///// hierarquia que a classe ContaCorrente, portanto o casting não pode ser
		///// realizado

		///// Para evitar esse erro uma condição é aplicada:

		///// if (c4 instanceof ContaCorrente) {
		//// ContaCorrente c5 = (ContaCorrente) c4;
		//// }

	}
}