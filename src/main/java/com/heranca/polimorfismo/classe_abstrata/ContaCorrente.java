package com.heranca.polimorfismo.classe_abstrata;

public class ContaCorrente extends Conta {

	private double limite;

	/*
	 * Com o polimorfismo, é possível escrever um código que não tenha que ser
	 * alterado quando novos tipos de subclasse forem introduzidos no sistema.
	 * Porém, a utilização mais importante do polimorfismo se dá quando dois
	 * objetos, sendo um da superclasse (classe Conta) e outro da subclasse (classe
	 * ContaCorrente), executam ações diferentes quando o mesmo método é invocado
	 * através da sobreescrita do método (como o método sacar abaixo)
	 */

	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		if (valor > saldo + limite) {
			throw new SaldoInsuficienteException();
		}
		saldo = saldo - valor;
	}

	// obrigatória a implementação do método abstrato da classe abstrata Conta em
	// suas subclasses (classes concretas):
	@Override
	public double verificarSaldo() {
		return saldo + limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
}