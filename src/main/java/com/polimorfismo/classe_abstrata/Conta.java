package com.polimorfismo.classe_abstrata;

// para definição de uma classe abstrata é só adicionar a palavra abstract antes:
public abstract class Conta {

	protected double saldo;

	public void sacar(double valor) throws SaldoInsuficienteException {
		if (valor > saldo) {
			throw new SaldoInsuficienteException();
		}
		saldo = saldo - valor;
	}

	// para definição de um método abstrato é só adicionar a palavra abstract antes
	// por não ser implementado na classe abstrata a assinatura do método termina
	// com ponto e vírgula
	public abstract double verificarSaldo();
	
}
