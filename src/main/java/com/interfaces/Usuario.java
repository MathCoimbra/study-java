package com.interfaces;

// Exemplo de uma clsse implementando uma interface
public class Usuario implements Autenticavel {

	/*
	 * Como a classe Usuario implementa a interface Autenticavel, ela deve
	 * implementar todos os métodos definidos pela interface. Caso isso não seja
	 * feito, teremos um erro de compilação.
	 */

	@Override
	public boolean login(String usuario, String senha) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void logou() {
		// TODO Auto-generated method stub

	}
}

//Exemplo de uma classe implementando mais de uma interface

//	public class Usuario implements Autenticavel, Serializable {
//	  // Código…
//	}

// Exemplo de uma classe que herda de uma outra classe e implementa uma interface (a herança sempre vem primeiro)

//	public class Usuario extends Pessoa implements Autenticavel {
//	  // Código…
//	}

// Exemplo de uma interface herdando de outras interfaces

//	public interface Gerenciavel extends Autenticavel {
//	}

//	public interface Gerenciavel extends Autenticavel, Serializable {
//	}