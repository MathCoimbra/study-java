package com.projeto.fiap.store.factory;

import com.projeto.fiap.store.dao.ProdutoDAO;
import com.projeto.fiap.store.dao.impl.OracleProdutoDAO;

public class DAOFactory {

	public static ProdutoDAO getProdutoDAO() {
		return new OracleProdutoDAO();
	}
	
}