package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

// Classe que será utilizada somente para conexão com o banco de dados, evitando a repetição desse código nas operações CRUD

public class EmpresaDBManager {

	public static Connection obterConexao() {
		Connection conexao = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM88698",
					"290901");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conexao;
	}

}
