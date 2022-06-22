package com.projeto.empresa.factory;

import com.projeto.empresa.dao.ColaboradorDAO;
import com.projeto.empresa.dao.OracleColaboradorDAO;


public abstract class DAOFactory {

	public static ColaboradorDAO getColaboradorDAO(){
		return new OracleColaboradorDAO();
	}
	
}