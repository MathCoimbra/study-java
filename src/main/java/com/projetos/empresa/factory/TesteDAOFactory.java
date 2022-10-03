package com.projetos.empresa.factory;

import java.util.List;

import com.projetos.empresa.dao.ColaboradorDAO;
import com.projetos.empresa.java.bean.Colaborador;

public class TesteDAOFactory {

	public static void main(String[] args) {
		ColaboradorDAO dao = DAOFactory.getColaboradorDAO();
		List<Colaborador> lista = dao.listar();
	}
	
}