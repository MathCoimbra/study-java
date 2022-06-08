package com.interfaces;

public interface Autenticavel {
	
	/*
	 * Todos os atributos e métodos de uma interface são implicitamente públicos.
	 * Todo atributo em uma interface é implicitamente público, final e estático
	 * (Constante). Como esses modificadores são fixos, não precisamos declará-los
	 */
	
	String MSG_LOGOUT = "Saindo";
	
	boolean login(String usuario, String senha);
	
	void logou();
	

}
