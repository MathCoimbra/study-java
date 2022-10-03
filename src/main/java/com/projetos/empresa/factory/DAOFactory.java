package com.projetos.empresa.factory;

import com.projetos.empresa.dao.ColaboradorDAO;
import com.projetos.empresa.dao.OracleColaboradorDAO;


public abstract class DAOFactory {

	public static ColaboradorDAO getColaboradorDAO(){
		return new OracleColaboradorDAO();
	}
	
}