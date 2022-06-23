package com.projeto.empresa.factory;

import com.projeto.empresa.dao.ColaboradorDAO;


public abstract class ADAOFactory {

	//Constanstes que definem os tipos de Data Source suportados
	public static final int SQL_SERVER = 1;
	public static final int ORACLE = 2;
	
	//Atributos que armazenam as instancias de cada Fábrica
	private static ADAOFactory oracleAdaoFactory;
	private static ADAOFactory sqlaAdaoFactory;
	
	//Método que retorna a instancia de uma fábrica de acordo com o banco
	public static ADAOFactory getADAOFactory(int banco){
		switch (banco) {
		case SQL_SERVER:
			if (sqlaAdaoFactory == null)
				sqlaAdaoFactory = new SQLADAOFactory();
			return sqlaAdaoFactory;
		case ORACLE:
			if (oracleAdaoFactory == null)
				oracleAdaoFactory = new OracleADAOFactory();
			return oracleAdaoFactory;
		default:
			return null;
		}
	}
	
	//Assinaturas de métodos que retornam a instancia do DAO
	public abstract ColaboradorDAO getColaboradorDAO();
	
}