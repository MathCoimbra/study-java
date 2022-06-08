package com.estruturas.repeticao.array.string;

public class Produto {

	String nome;
	String descricao;
	float valor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	// comando de sobrescrita ao método toString onde irá retornar todos os dados dessa classe
	
	@Override
	public String toString() {
		return "Produto [nome = " + nome + ", descrição = " + descricao + ", valor = " + valor + "]"; 
	}

}
