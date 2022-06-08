package com.interfaces;

public interface Corredor {
	
	// método abstrato, ou seja, que não tem implementação na interface, e que deverá ter somente na classe
	void correr(int velocidade);

	// com esse modificador (default) não é necessário definir o método na classe
	// que for implementar essa interface, pois a classe já irá herdar esse método
	// sobreescrito por padrão
	default void parar() {
		System.out.println("Parando...");
	}
	
	
	// com esse modificador (static) não é possível sobreescrever o método na classe
	static void acelerar() {
		System.out.println("Acelerando...");	
	}

}
