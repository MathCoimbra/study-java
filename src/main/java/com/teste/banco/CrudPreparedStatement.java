package com.teste.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CrudPreparedStatement {

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

			// PREPARED STATEMENT - utilizado para manipulação dos dados, proporciona melhor
			// performance e clareza do código
			// através de parâmetros que são definidos através do sinal de interrogação (?)

			// Inclusão de um novo colaborador
			PreparedStatement pStmtI = conexao.prepareStatement(
					"INSERT INTO TAB_COLABORADOR(CODIGO_COLABORADOR, NOME, EMAIL, SALARIO, DATA_CONTRATACAO) VALUES (SQ_COLABORADOR.NEXTVAL, ?, ?, ?, ?)");

			// Setando as posições dos parâmetros segundo o interrogogação, e seus
			// respectivos valores
			pStmtI.setString(1, "Thiago"); // Primero parâmetro (Nome)
			pStmtI.setString(2, "thiago@gmail.com");// Segundo parâmetro (Email)
			pStmtI.setDouble(3, 5000); // Terceiro parâmetro (Salário)
			// Instancia um objeto do tipo java.sql.Date com a data atual
			java.sql.Date data = new java.sql.Date(new java.util.Date().getTime());
			pStmtI.setDate(4, data);// Quarto parâmetro (data contratação)

			pStmtI.executeUpdate();

			// Alteração do salário de um colaborador
			PreparedStatement pStmtU = conexao
					.prepareStatement("UPDATE TAB_COLABORADOR SET SALARIO = ? WHERE CODIGO_COLABORADOR = ?");
			pStmtU.setDouble(1, 5000);
			pStmtU.setInt(2, 100);
			pStmtU.executeUpdate();

			// Exclusão de um colaborador
			PreparedStatement pStmtD = conexao
					.prepareStatement("DELETE FROM TAB_COLABORADOR WHERE CODIGO_COLABORADOR = ?");
			pStmtD.setInt(1, 1);
			pStmtD.executeUpdate();

			// Consulta de todos os colaboradores com um nome específico
			PreparedStatement pStmtS = conexao.prepareStatement("SELECT * FROM TAB_COLABORADOR WHERE NOME = ?");
			pStmtS.setString(1, "Thiago");
			ResultSet result = pStmtS.executeQuery();

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
