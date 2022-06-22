package com.projeto.empresa.factory;

import java.util.List;

import com.projeto.empresa.dao.ColaboradorDAO;
import com.projeto.empresa.java.bean.Colaborador;

public class TesteDAOFactory {

	public static void main(String[] args) {
		ColaboradorDAO dao = DAOFactory.getColaboradorDAO();
		List<Colaborador> lista = dao.listar();
	}
	
}