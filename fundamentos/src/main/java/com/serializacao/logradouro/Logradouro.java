package com.serializacao.logradouro;

import java.io.Serializable;

// somente objetos serializable e primitivos são auto serializable quando uma nova classe é criada é necessária que a mesma 
// implemente a classe de serialização, caso contrário ao executar a classe SerializadorLogradouro uma exceção será gerada

public class Logradouro implements Serializable {
	
	private long id;
	private String nome;
	private TipoLogradouro tipo;
	private String cep;

	public Logradouro() {

	}

	public Logradouro(long id, String nome, TipoLogradouro tipo, String cep) {
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.cep = cep;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoLogradouro getTipo() {
		return tipo;
	}

	public void setTipo(TipoLogradouro tipo) {
		this.tipo = tipo;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

}