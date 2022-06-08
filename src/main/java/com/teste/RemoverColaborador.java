package com.teste;

import com.dao.ColaboradorDAO;

public class RemoverColaborador {

	public static void main(String[] args) {
		
		ColaboradorDAO dao = new ColaboradorDAO();
		// remover o colaborador de id = 1
		dao.remover(1);
	}

}
