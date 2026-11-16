package com.interfaces;

// a classe não apresenta nenhum erro pois o método foi definido como default e
// por isso não precisa ser definido nessa classe

public class Avestruz extends Animal implements Corredor {
	
	// implementação do método abstrato
	@Override
	public void correr(int velocidade) {
		
		
	}
	
	// diferença entre o método default e static, conforme abaixo o método default
	// pode ser sobreescrito:

	@Override
	public  void parar() {
		System.out.println("Avestruz parando...");
	}
	
	// já o método static se descomentado conforme abaixo apresetará erro, pois não pode ser sobreescrito
	
//	@Override
//	public void acelerar() {
//		System.out.println("Avestruz parando...");
//	}

	
}
