package com.dao;

// Interface para implementação das funcionalidades

import java.util.List;

import com.java.bean.Colaborador;

public interface ColaboradorDAO {

	public void cadastrar(Colaborador colaborador);

	public List<Colaborador> listar();

	public void atualizar(Colaborador colaborador);

	public void remover(int codigo);

	public Colaborador buscarPorId(int codigoBusca);
	
}