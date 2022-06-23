package com.projeto.empresa.singleton;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {

	//Atributo que armazena a única instancia de ConnectionManager
	private static ConnectionManager instance;
	
	//Construtor privado
	private ConnectionManager(){}
	
	public static ConnectionManager getInstance(){
		if (instance == null){
			instance = new ConnectionManager();
		}
		return instance;
	}
	
	public Connection getConnection(){
		Connection connection = null;
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			connection = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM88698",
					"290901");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	
}
