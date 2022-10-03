package com.projetos.empresa.teste.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSetMethods {

	public static void main(String[] args) {
		try {
			// Registra o Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Abre uma conexão
			Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
					"RM88698", "290901");

			System.out.println("Conectado!");

			PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM TAB_COLABORADOR WHERE NOME = ?");
			stmt.setString(1, "Thiago");
			
			// RESULTSET - responsável pelo retorno dos dados de um SELECT sendo possível através de seus métodos
			// percorrer pelos registros retornados conforme o while abaixo. Caso nenhum dado for encontrado retorna false
			
			ResultSet result = stmt.executeQuery();

			// Percorre todos os registros encontrados
			while (result.next()) {
				// Recupera os valores de cada coluna
				int codigo = result.getInt("CODIGO_COLABORADOR");
				String nome = result.getString("NOME");
				String email = result.getString("EMAIL");
				double salario = result.getDouble("SALARIO");
				java.sql.Date data = result.getDate("DATA_CONTRATACAO");
				// também tem o getBoolean que retorna um valor booleano do Java
				// Exibe as informações do registro
				System.out.println(codigo + " " + nome + " " + email + " " + salario + " " + data);
			}

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
