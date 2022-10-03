package com.projetos.fiap.store.dao;

import java.util.List;

import com.projetos.fiap.store.bean.Produto;
import com.projetos.fiap.store.exception.DBException;

public interface ProdutoDAO {
	
	void cadastrar(Produto produto) throws DBException;
	void atualizar(Produto produto) throws DBException;
	void remover(int codigo) throws DBException;
	Produto buscar(int id);
	List<Produto> listar();
}