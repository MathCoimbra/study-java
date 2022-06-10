package com.teste;

import java.util.List;

import com.dao.OracleColaboradorDAO;
import com.java.bean.Colaborador;

public class ListarColaborador {

	public static void main(String[] args) {

		OracleColaboradorDAO dao = new OracleColaboradorDAO();

		List<Colaborador> lista = dao.listar();
		for (Colaborador item : lista) {
			System.out.println(item.getCodigo() + " " + item.getNome() + " " + item.getEmail() + " " + item.getSalario()
					+ " " + item.getDataContratacao().getTime());
		}
	}

}