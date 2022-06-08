package com.polimorfismo.classe_abstrata;

public class ContaPoupanca extends Conta {

	// assim como a classe ContaCorrente essa classe que herda da classe abstrata
	// deve implementar obrigatoriamente o método abstrato
	public double verificarSaldo() {
		return saldo;
	}

}