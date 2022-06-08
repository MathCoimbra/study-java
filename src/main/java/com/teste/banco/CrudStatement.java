package com.teste.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudStatement {

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

			// STATEMENT - utilizado para executar um comando SQL estático
			// Não recomendado pois um ataque de SQL Injection pode ser facilmente realizado

			// Inclusão dos dados um colaborador
			Statement stmtI = conexao.createStatement();
			stmtI.executeUpdate(
					"INSERT INTO TAB_COLABORADOR(CODIGO_COLABORADOR, NOME, EMAIL, SALARIO, DATA_CONTRATACAO) VALUES (SQ_COLABORADOR.NEXTVAL, 'Matheus', 'mathcoimbra@teste.com', 1500, TO_DATE('10/12/2009','dd/mm/yyyy'))");

			// Atualização do salário de um colaborador
			Statement stmtU = conexao.createStatement();
			stmtU.executeUpdate("UPDATE TAB_COLABORADOR SET SALARIO = 5000 WHERE CODIGO_COLABORADOR = 1");

			// Exclusão de um colaborador
			Statement stmtD = conexao.createStatement();
			stmtD.executeUpdate("DELETE FROM TAB_COLABORADOR WHERE CODIGO_COLABORADOR = 1");

			// Consulta de todos os colaboradores
			Statement stmtS = conexao.createStatement();
			ResultSet rs = stmtS.executeQuery("SELECT * FROM TAB_COLABORADOR");

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
