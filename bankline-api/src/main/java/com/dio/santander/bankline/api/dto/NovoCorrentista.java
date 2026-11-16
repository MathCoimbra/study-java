package com.dio.santander.bankline.api.dto;

// classe de dados para cadastrar somente o que for necessário para um novo correntista

public class NovoCorrentista {

	private String nome;
	private String cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
