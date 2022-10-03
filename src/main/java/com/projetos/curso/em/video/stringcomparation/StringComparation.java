package com.projetos.curso.em.video.stringcomparation;

public class StringComparation {

	public static void main(String[] args) {

		String nome = "Matheus";
		String nome2 = new String("Matheus");
		String nome3 = new String("matheus");
		String nome4 = new String("MATHEUS");
		String r = (nome == nome2) ? "igual" : "diferente"; /* o resultado é diferente, apesar de terem o mesmo valor,
																pois nome é uma variável, já nome2 é um objeto */ 
		System.out.println(r);
		
		String r2 = (nome2.equals(nome)) ? "igual" : "diferente";	/* o resultado é igual por que foi utilizado o método equals
																	   para validar o valor da variável nome */ 
		System.out.println(r2);
		
		String r3 = (nome3.equalsIgnoreCase(nome4)) ? "igual" : "diferente"; /* o resultado é igual pois o método equalsIgnoreCase ignora
																			 	letras maiúsculas ou minúsculas */
		System.out.println(r3);

		String facu = "FIAP - A Melhor Faculdade de Tecnologia";
		
		// método para verificar se a string começa com algum caractere
		
		if (facu.startsWith("FIAP")){
		    System.out.println("A string começa com FIAP");
		}else{
		    System.out.println("A string não começa com FIAP");
		}
		
		// método para verificar se a string termina com algum caractere
		
		if (facu.endsWith("gia")){
		    System.out.println("A string termina com gia");
		}else{
		    System.out.println("A string não termina com gia");
		}
		
		// método para verificar a quantidade de caracteres na string
		
		int caracteres = facu.length();
		System.out.println("A string possui " + caracteres + " caracteres");
		
		// método para recuperar um caractere de uma string através de um índice, assim como ocorre com vetores, o índice se inicia em zero,
		// portanto há 38 índices nessa string de 39 caracteres, obs.: espaços em branco também contam
		
		char caracter = facu.charAt(38);
		System.out.println("O segundo caracter da string é " + caracter);
		
		// método para recuperar o índice de algum caractere
		
		int posicaoValida = facu.indexOf('a');
		System.out.println("O índice do caracter 'a' na string é " + posicaoValida);
		
			// caso não seja encontrado o índice será retornado "-1"
		int posicaoInvalida = facu.indexOf('x');
		System.out.println("O índice do caracter 'a' na string é " + posicaoInvalida);
		
			// também pode procurar uma sequência de caracteres (uma palavra)
		int posicaoCaracter = facu.indexOf("Tecnologia");
		System.out.println("O índice do caracter \"Tecnologia\" na string é " + posicaoCaracter);
		
				// caso houver repetições o índice da primeira palavra é retornada
		String facu2 = "FIAP - A Melhor Faculdade de Tecnologia - Tecnologia";
		int posicaoCaracter2 = facu2.indexOf("Tecnologia");
		System.out.println("O índice do caracter \"Tecnologia\" na string é " + posicaoCaracter2);
		
		// método para recuperar o índice da última palavra ou caractere
		
		String facu3 = "FIAP - A Melhor Faculdade de Tecnologia - Faculdade";
		int ultimaPosicao = facu3.lastIndexOf('a');
		System.out.println("O índice do último caracter 'a' na string é " + ultimaPosicao);
		int ultimaPosicao2 = facu3.lastIndexOf("Faculdade");
		System.out.println("O índice do último caracter \"Faculdade\" na string é " + ultimaPosicao2);
		
		// método para criar uma string a partir de outra já criada
			
			// utilizado o método indexOf para retornar o índice da string, caso não soubermos
		String nova = facu.substring(facu.indexOf('M'), 25);
		System.out.println("A nova string é: " + nova);
		
			// caso somente o índice inicial seja declarado será copiado até o final da string original
		String nova2 = facu.substring(16);
		System.out.println("A nova2 string é: " + nova2);
		
		// método que transforma caracteres em minúsculo
		
		System.out.println(facu.toLowerCase());
		
		// método que transforma caracteres em maiúsculo
		
		System.out.println(facu.toUpperCase());
		
		// método que realiza a substituição de caracteres
		
		String descricao = new String ("Prefiro uva sem semente");
		System.out.println(descricao.replace("uva", "mexerica"));
		System.out.println(descricao.replace("P", "p"));
		System.out.println(descricao.replace("e", "E"));
		
		// método para separar strings através de um delimitador que deve ser informado no método, no caso abaixo um espaço em branco
		
		String[] palavras = facu.split(" ");
		for (String p : palavras) {
		    System.out.println(p);
		}
		
		System.out.println(" ");
		
			// outro exemplo usando um ponto e vírgula como delimitador
		String disciplinas = "LTP;Web;Algoritmos;Banco de Dados";
		String[] dis = disciplinas.split(";");
		for (String d : dis) {
		    System.out.println(d);
		}
		
		
	}
}
