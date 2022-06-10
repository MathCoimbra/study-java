package com.teste;

import java.util.Calendar;

import com.dao.OracleColaboradorDAO;
import com.java.bean.Colaborador;

public class CadastroColaborador {

	public static void main(String[] args) {
		// Instancia o DAO
		OracleColaboradorDAO dao = new OracleColaboradorDAO();

		// Instancia o Colaborador
		Colaborador colaborador = new Colaborador();
		colaborador.setNome("Matheus");
		colaborador.setEmail("matheus@fiap.com.br");
		colaborador.setSalario(2100);
		colaborador.setDataContratacao(Calendar.getInstance());

		// Cadastra no banco de dados
		dao.cadastrar(colaborador);

		System.out.println("Cadastrado!");
	}

}
