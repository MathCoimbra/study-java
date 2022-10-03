package com.projetos.banco;

public class ContaCorrente extends Conta{

	// atributos específicos da classe ContaCorrente
	private String tipo;
	private double chequeEspecial;
	
	// métodos já no padrão Java Bean
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getChequeEspecial() {
		return chequeEspecial;
	}
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	// método novo utilizando atributo da classe pai
	
	public double getSaldoDisponivel() {
		return super.getSaldo() + chequeEspecial;
				
	}
	
}
