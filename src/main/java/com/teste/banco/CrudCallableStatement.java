package com.teste.banco;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CrudCallableStatement {

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

			// CALLABLE STATEMENT - utilizado para chamar stored procedures (procedimento
			// armazenado) ou functions (funções) que armazenam um conjunto de comandos SQL
			// para execução

			// Exemplo de chamada de uma store procedure com parâmetro:
			
			// CallableStatement cs = conexao.prepareCall("{call proc(?)}");

			// Exemplo de chamada de uma store procedure sem parâmetro:
			
			// CallableStatement cs = conexao.prepareCall("{call proc()}");

			// Criando exemplo com parâmetro
			CallableStatement cs = conexao.prepareCall("{call SP_Contar_Colaboradores(?,?)}");

			// Define o tipo do parâmetro de saída (primeiro ?)
			cs.registerOutParameter(1, java.sql.Types.INTEGER);

			// Define o valor do parâmetro de entrada (segundo ?)
			cs.setDouble(2, 1500);

			// Executa a procedure
			cs.executeUpdate();

			// Recupera o valor do parâmetro de saída
			int total = cs.getInt(1);
			System.out.println("Total de colaboradores com salário maior que 1500: " + total);

			// Fecha a conexão
			conexao.close();
			
//			Exemplo de uma store procedure que retorna o resultado de um SELECT:
	
			//Cria o CallableStatement
//			CallableStatement cs = conexao.prepareCall("{call SP_Retornar_Todos_Colaboradores(?,?)}");
//						
//			//Define o valor do parâmetro de entrada 
//			cs.setDouble(1,1500);
//
//			//Define o tipo do parâmetro de saída
//			cs.registerOutParameter(2, OracleTypes.CURSOR);
//						
//			//Executa a procedure
//			cs.execute();
//						
//			//Recupera o valor do parâmetro de saída
//			ResultSet cursor = (ResultSet) cs.getObject(2);
//						
//			//Percorre todos os registros encontrados
//			while (cursor.next()){
//			  //Recupera os valores de cada coluna
//			  int codigo = cursor.getInt("CODIGO_COLABORADOR");
//			  String nome = cursor.getString("NOME");
//			  System.out.println(codigo + " " + nome);
//			}

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
