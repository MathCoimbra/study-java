package com.string;

import java.util.Arrays;

public class Metodos {
	public static void main(String[] args) {
		
		// MÉTODOS DE STRINGS

		// Declaração das strings de exemplo:
		String nome5 = new String("pera");
		String nome6 = new String("Pera");
		String nome7 = new String("pera");

		// Método para comparação dos valores das strings acima:

		// equals = método para comparação
		System.out.println(nome5.equals(nome6));

		// equalsIgnoreCase = método para ignorar a diferença entre as strings
		System.out.println(nome5.equalsIgnoreCase(nome6));

		// Para comparação também existe o operador ( == ), mas não é o mais indicado,
		// pois ele não compara o valor da variável e sim a sua posição na memória
		
		// No caso abaixo pode-se ver que a variável nome5 e nome7 são iguais porém retorna false, 
		// justamente por estarem em posições diferentes na memória
		boolean teste = (nome5 == nome7);
		System.out.println(teste);
		
		// Caso as variáveis não fossem instanciadas, os seus valores ficariam em um pool da memória
		// e logo por ficarem na mesma posição ao utilizar o operador ( == ) para comparação o mesmo 
		// iria retornar true, conforme exemplo abaixo:
		
		String nome8 = "laranja";
		String nome9 = "laranja";
		
		teste = (nome8 == nome9);
		System.out.println(teste);
		
		// length = método que retorna o tamanho da string
		String descricao2 = new String ("Mexerica é muito bom");
		System.out.println(descricao2.length());
		
		// startsWith = método para saber qual o ínicio de uma string
		System.out.println(descricao2.startsWith("Mexerica"));
		
		// endsWith = método para saber qual o fim de uma string
		System.out.println(descricao2.endsWith("!"));
		
		// charAt = método para retornar um caractere através de seu índice (lembrando, que o índice começa em zero)
		System.out.println(descricao2.charAt(1));
		
		// indexOf = método que retorna o índice de um caractere
		System.out.println(descricao2.indexOf("m"));
		System.out.println(descricao2.indexOf("muito"));
		
		// lastindexOf = retorna o índice da última correspondência do caractere
		System.out.println(descricao2.indexOf("e"));
		System.out.println(descricao2.lastIndexOf("e"));
		
		// replace = realiza a substituição de caracteres
		String descricao3 = new String ("Prefiro uva sem semente");
		System.out.println(descricao3.replace("uva", "mexerica"));
		System.out.println(descricao3.replace("P", "p"));
		System.out.println(descricao3.replace("e", "E"));

		
		// Arrays.toString = utilizado para transformar o split em uma array de strings
		System.out.println(Arrays.toString(descricao3.split(" ")));
		
		// toLowerCase = transforma caracteres em minúsculo
		System.out.println(descricao3.toLowerCase());
		
		// toUpperCase = transforma caracteres em maiúsculo
		System.out.println(descricao3.toUpperCase());
		
		// substring = retorna um trecho de caracteres através de um índice de início e fim
		System.out.println(descricao3.substring(0,7));
		// quando definido somente o índice de início, demais caracteres após esse índice serão exibidos 
		System.out.println(descricao3.substring(8));
		// utilizando indexOf para definir o índice de início e fim
		System.out.println(descricao3.substring(descricao3.indexOf(" "), descricao3.indexOf("semente")));
		
	}

}
