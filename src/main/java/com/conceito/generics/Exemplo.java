package com.conceito.generics;

import java.util.ArrayList;
import java.util.List;

public class Exemplo {

	// abaixo é criada uma lista do tipo Livro onde a mesma pode receber qualquer
	// coisa desde que seja da classe Livro, essa possibilidade de insersão de
	// qualquer valor é o que define o conceito de generics (generalizar)

	public static void main(String[] args) {

		Relogio relogio = new Relogio();
		Livro livro = new Livro();
		Livro livro2 = new Livro();

		List<Livro> caixaDeLivros = new ArrayList<Livro>();

		caixaDeLivros.add(livro);
		caixaDeLivros.add(livro2);
		// caixaDeLivros.add(relogio);
	}

}
