package com.projetos.empresa.factory;


import java.util.List;

import com.projetos.empresa.dao.ColaboradorDAO;
import com.projetos.empresa.java.bean.Colaborador;


public class TesteADAOFactory {

	public static void main(String[] args) {
		// para alterar o banco apenas alterar de ORACLE para SQL_SERVER 
		ColaboradorDAO dao = ADAOFactory.getADAOFactory(ADAOFactory.ORACLE).getColaboradorDAO();
		List<Colaborador> lista = dao.listar();
	}
	
}