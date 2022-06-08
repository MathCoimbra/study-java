package com.estruturas.repeticao.array.string;

import java.util.Arrays;

public class Caixa {

	public static void main(String[] args) {

		int qtdProdutos = 5;
		int registro = 0;

		// ESTRUTURAS DE REPETICÃO:

//		WHILE

		while (registro < qtdProdutos) {
			registro++;
			System.out.println("O produto número " + registro + " foi registrado");
		}

//		
////	DO WHILE
//
//		 do { registro++; System.out.println("O caixa registrou o produto " +
//		 	registro); } while (registro < qtdProdutos);
//
//		 
//		
////	FOR
//
//		 for (int i = 1; i <= qtdProdutos; i++) {
//			 
//		 	System.out.println("O caixa registrou o produto " + i); }

		// ARRAY de TIPOS PRIMITIVOS:

		float[] valores = new float[5];

		// Também pode ser declarada uma array com os colchetes na variável:
		// float valores[] = new float[5];

		valores[0] = 10;
		valores[1] = 20;
		valores[2] = 30;
		valores[3] = 40;
		valores[4] = 50;

		System.out.println(valores[1]);

		// Também pode ser inicializado os valores da seguinte forma:
		// float[] valores { 10, 20, 30, 40, 50 };
		// float[] valores = new float[] { 10, 20, 30, 40, 50 };

		// ARRAY com CLASSES/OBJETOS:

		Produto[] produtos = new Produto[2];

		Produto prod1 = new Produto();
		prod1.setNome("Limão");
		prod1.setDescricao("Galego");
		prod1.setValor(4);

		Produto prod2 = new Produto();
		prod2.setNome("Maça");
		prod2.setDescricao("Gala");
		prod2.setValor(5);

		// Atribuindo a array produto aos objetos "prod" criados

		produtos[0] = prod1;
		produtos[1] = prod2;

		// Estrutura de repetição FOR
		// length = atributo que retorna o tamanho da array produtos

		for (int i = 0; i < produtos.length; i++) {
			// esse comando irá retornar através do método toString todos os valores da
			// array sendo cada um em um índice
			System.out.println(produtos[i].toString());

		}

		// Forma mais fácil para percorrer a array de objetos também utilizando o FOR:

		// Para cada variável com nome "prod" do tipo "Produto" na array "produtos"
		// printe com o método sobrecarregado toString()
		for (Produto prod : produtos) {
			System.out.println(prod.toString());
		}

		// Código para caso seja necessário atribuir uma localização do produto assim
		// como qual prateleira ele está:

		// 10 corredores com 3 prateleiras cada

		// Abaixo é criado uma nova array do tipo Produto com dois índices, uma para o
		// corredor e outro para a prateleira (array multidimensional = matriz)

		Produto[][] localizacaoProduto = new Produto[10][3];

		// Aqui é atribuído as variáveis a sua posição no corredor e na prateleira
		localizacaoProduto[1][2] = prod1;
		localizacaoProduto[0][1] = prod2;

		// Para printar foi chamado a array de localização mais o método para imprimir o
		// nome
		System.out.println(localizacaoProduto[0][1].getNome());

		// STRING - Formas de declaração

		// 1° forma:

		// Declaração
		String nome;
		// Instanciação
		nome = new String();
		// Inicialização:
		nome = "Maça";

		// 2° forma:

		// Declaração // Instanciação // Inicialização (através do construtor)
		String nome2 = new String("Banana");

		// 3° forma:

		// Declaração // Inicialização
		String nome3 = "Maça";

		// Nesta última forma o dado será armazenado em um pool de memória (equivalente
		// a cache do Java) e não uma área própria da variável assim como nas demais, pois
		// desta forma não foi realizada a instanciação

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
		System.out.println(descricao.length());
		
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
		
		float[] valor = new float[4];

		valor[0] = 1;
		valor[1] = 2;
		valor[2] = 3;

		System.out.print(valor[3]);
		
	}

}

