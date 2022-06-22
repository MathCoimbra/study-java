package com.projeto.empresa.teste.funcoes;

import com.projeto.empresa.dao.OracleColaboradorDAO;

public class RemoverColaborador {

	public static void main(String[] args) {
		
		OracleColaboradorDAO dao = new OracleColaboradorDAO();
		// remover o colaborador de id = 1
		dao.remover(1);
	}

}
