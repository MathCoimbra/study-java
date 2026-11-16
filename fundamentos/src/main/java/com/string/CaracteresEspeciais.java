package com.string;

public class CaracteresEspeciais {
	
	public static void main(String[] args) {

		// Caracteres especiais:

		// \n = quebra de linha
		String descricao = "Tipo Gala \nA maça mais doce do mercado";
		System.out.println(descricao);

		// \t =  espaçamento de um tab
		descricao = "Tipo Gala \tA maça mais doce do mercado";
		System.out.println(descricao);

		// abertura (\") e fechamento (\") =  permite imprimir um caractere com aspas
		// duplas sem interferir nas aspas propriamente incluídas para execução do código
		descricao = "Tipo Gala: \"A maça mais doce do mercado\"";
		System.out.println(descricao);


	}

}
