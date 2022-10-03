package com.projetos.fiap.store.factory;

import com.projetos.fiap.store.dao.ProdutoDAO;
import com.projetos.fiap.store.dao.impl.OracleProdutoDAO;

public class DAOFactory {

	public static ProdutoDAO getProdutoDAO() {
		return new OracleProdutoDAO();
	}
	
}