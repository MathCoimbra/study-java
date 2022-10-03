package com.projetos.empresa.teste.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {

	public static void main(String[] args) {

		// Código para conexão com o banco de dados

		try {

			// Registrando o driver informando a partir da classe Class e o método "forName"
			// a localização do driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Abrindo conexão com o banco através do método getConnection informando a URL
			// de acesso ao banco, o usuário e senha
			Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
					"RM88698", "290901");

			System.out.println("Conectado!");

			// Fecha a conexão
			conexao.close();

			// Tratamento de erro
		} catch (SQLException e) {
			System.err.println("Não foi possível conectar no Banco de Dados");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("O Driver JDBC não foi encontrado!");
			e.printStackTrace();

		}
	}
}