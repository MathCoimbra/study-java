package com.teste;

import com.dao.OracleColaboradorDAO;
import com.java.bean.Colaborador;

public class AlterarColaborador {

	public static void main(String[] args) {

		OracleColaboradorDAO dao = new OracleColaboradorDAO();
		// Recupera o colaborador com código 1
		Colaborador colaborador = dao.buscarPorId(1);
		// Imprime os valores do colaborador
		System.out.println(colaborador.getCodigo() + " " + colaborador.getNome() + " " + colaborador.getEmail() + " "
				+ colaborador.getSalario() + " " + colaborador.getDataContratacao().getTime());
		// Altera os valores de alguns atributos do colaborador
		colaborador.setSalario(1500);
		colaborador.setEmail("teste@fiap.com.br");
		// Atualiza no banco de dados
		dao.atualizar(colaborador);
	}
}
