package com.projeto.fiap.store.dao;

import java.util.List;

import com.projeto.fiap.store.bean.Produto;
import com.projeto.fiap.store.exception.DBException;

public interface ProdutoDAO {
	
	void cadastrar(Produto produto) throws DBException;
	void atualizar(Produto produto) throws DBException;
	void remover(int codigo) throws DBException;
	Produto buscar(int id);
	List<Produto> listar();
}