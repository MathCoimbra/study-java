package com.projetos.banco;

public class Conta {

	// Criação dos atributos, também denominados de variáveis da classe

	// Foi utilizado o tipo "double" pois futuramente esse atributo "saldo" será
	// utilizado para algum cálculo

	int numero;
	int agencia;
	double saldo;

	// Instanciando a classe Cliente
	
	Cliente cliente = new Cliente();

	// Construtor padrão:

	public Conta() {

	}

	// Construtor de classe:

	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}

	// Sintaxe de criação de métodos com e sem argumentos:

	public double getSaldo() {
		return this.saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public int getNumero() {
		return numero;
	}

	//

	public void setNumero(int numero) {
		this.numero = numero;
	}

	// Subcarga de métodos:

	public void retirar(int valor) {
		this.saldo -= valor;
	}

	public void retirar(int valor, double taxa) {
		this.saldo -= valor - taxa;
	}

	//

	public int getAgencia() {
		return agencia;
	}

	// Subcarga de atributo e variável:

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

}