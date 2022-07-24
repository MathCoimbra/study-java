package com.array;

import com.estruturas.repeticao.Produto;

public class Tipos {
	
	public static void main(String[] args) {
		
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
	}

}
