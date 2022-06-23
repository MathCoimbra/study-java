package com.projeto.empresa.factory;


import java.util.List;

import com.projeto.empresa.dao.ColaboradorDAO;
import com.projeto.empresa.java.bean.Colaborador;


public class TesteADAOFactory {

	public static void main(String[] args) {
		// para alterar o banco apenas alterar de ORACLE para SQL_SERVER 
		ColaboradorDAO dao = ADAOFactory.getADAOFactory(ADAOFactory.ORACLE).getColaboradorDAO();
		List<Colaborador> lista = dao.listar();
	}
	
}