package com.string;

public class Concatenacao {
	
	public static void main(String[] args) {
		// Concatenar strings

		// Criação das strings para exemplo:
		String nome4 = new String("Uva");
		String detalhe = new String();
		detalhe = "é a melhor fruta";

		// Concatenação através do operador " + " :
		String propaganda = nome4 + " " + detalhe;
		System.out.println(propaganda);

		// Concatenação através do "concat":
		propaganda = nome4.concat(" ").concat(detalhe);
		System.out.println(propaganda);

		// Concatenação através do operador " += ":
		propaganda += "!";
		System.out.println(propaganda);
	}

}
