package com.heranca.polimorfismo.classe_abstrata;

public class Teste {

	public static void main(String[] args) {

		// Existem dois métodos sacar um da classe Conta e outro da classe Conta
		// Corrente
		// abaixo como foi o objeto ContaCorrente que foi armazenado na variável
		// logo o método sacar da classe desse objeto será utilizado

		Conta cc = new ContaCorrente();
		try {
			cc.sacar(20);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}

		try {
			System.out.println(cc.verificarSaldo());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Conta cp = new ContaPoupanca();
		
		try {
			System.out.println(cp.verificarSaldo());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
