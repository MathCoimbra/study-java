package com.projeto.empresa.teste.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CommitRollback {

	@SuppressWarnings("null")
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

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

			// Desabilita o autocommit
			conexao.setAutoCommit(false);

			// Primeira transação - Atualiza o salário
			PreparedStatement stmt = conexao
					.prepareStatement("UPDATE TAB_COLABORADOR SET SALARIO = ? WHERE CODIGO_COLABORADOR = ?");
			stmt.setDouble(1, 5000);
			stmt.setInt(2, 1);
			stmt.executeUpdate();

			// Segunda transação - Atualiza o e-mail
			PreparedStatement stmt2 = conexao
					.prepareStatement("UPDATE TAB_COLABORADOR SET EMAIL = ? WHERE CODIGO_COLABORADOR = ?");
			stmt2.setString(1, "teste@teste.com.br");
			stmt2.setInt(2, 1);
			stmt2.executeUpdate();

			// Efetiva as duas transações
			conexao.commit();

			// Tratamento de erro
		} catch (SQLException e) {
			System.err.println("Não foi possível conectar no Banco de Dados");
			e.printStackTrace();
			Connection conexao = null;
			// Não efetiva as transações
			conexao.rollback();
		} catch (ClassNotFoundException e) {
			System.err.println("O Driver JDBC não foi encontrado!");
			e.printStackTrace();
		}
	}
}
