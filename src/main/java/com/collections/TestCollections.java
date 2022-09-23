package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestCollections {

	public static void main(String[] args) {

		System.out.println("/*********** INTERFACE LIST ***********/");
		
		System.out.println();
		
		System.out.println("/***** Array List *****/");

		ArrayList carrinho = new ArrayList();

		Double valor = 50.99;
		int valor2 = 10;
		int valor3;

		// adicionando os valores à lista de carrinho através do comando "add"

		carrinho.add(valor);
		carrinho.add("Uva");
		carrinho.add(valor2);

		// método get utilizado para recuperar o valor de uma lista através de um índice

		System.out.println("Todos os itens: " + carrinho);
		
		System.out.println("Item do índice 1 através do método get: " + carrinho.get(1));

		// Quando não usado o conceito de Generics conforme exemplo abaixo é necessário
		// utilizar um cast no método get
		// para retornar o valor, no caso abaixo foi atribuído o mesmo dado da variável
		// "valor2"

		valor3 = (int) carrinho.get(2);

		System.out.println();

		System.out.println("/***** List *****/");
		
		// método asList - torna a lista imutável, sem adição ou remoção de itens, mas
		// permite a alteração de itens existentes
		
		List<Double> notas = Arrays.asList(7d, 8.5, 7.26, 6d);

		// método of - torna a lista criada imutável sem adição ou remoção de itens

		List<Double> notas2 = List.of(7d, 6.0, 5.0, 4d);
		
		// método min da Collections - retorna o menor valor da lista
		
		System.out.println("Numero minímo das notas através do método min: " + Collections.min(notas));
		
		// método max da Collections - retorna o maior valor da lista
		
		System.out.println("Numero máximo das notas através do método max: " + Collections.max(notas));
		
		// iterator - usado para percorrer um array, no caso abaixo utilizado para somar os valores
		
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;
		while (iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		
		System.out.println("Soma das notas após loop com iterator: " + soma);
		
		List<String> cars = new ArrayList<>();
		
		cars.add("celta");
		cars.add("gol");
		
		// método para limpar toda a lista
		
		cars.clear();
		
		System.out.println("Lista de carros após o método clear(): " + cars);
		
		/***** Uso de GENERICS *****/

		// Generics não permite uso de tipos primitivos

		// Abaixo é criada uma variável do tipo list que é declarada como uma ArrayList
		// de Strings utilizando Generics
		List<String> carrinho2 = new ArrayList<String>();

		// isEmpty = retorna em verdadeiro se a lista estiver vazia e falso caso não
		// esteja vazia
		System.out.println("A lista de carrinho está vazia? " + carrinho2.isEmpty());

		carrinho2.add("Laranja");
		carrinho2.add("Maça");
		carrinho2.add("Limão");
		carrinho2.add("Banana");
		
		// método set - utilizado para substituição de um item, se espera o índice e o valor a ser substituído
		carrinho2.set(1, "Uva");

		// size = retorna o tamanho da ArrayList
		System.out.println("Tamanho da lista de carrinho: " + carrinho2.size());

		// contains = verifica se o valor está disponível na ArrayList
		System.out.println("Tem banana no carrinho? " + carrinho2.contains("Banana"));

		// shuffle - método da Collections para deixar a ordem dos itens aleatória
		Collections.shuffle(carrinho2);
		System.out.println("Ordem aleatória dos itens: " + carrinho2);
		
		// sort - método da Collections para deixar a ordem dos itens de forma alfabética
		Collections.sort(carrinho2);
		System.out.println("Ordem alfabética dos itens: " + carrinho2);

		System.out.println();
		
		System.out.println("/*********** INTERFACE SET ***********/");
		
		// Abaixo é criada uma variável do tipo set que é declarada como uma HashSet de
		// Strings 
		Set<String> cesta = new HashSet<String>();
		
		cesta.add("CEREAL");
		cesta.add("Cereal");
		cesta.add("Cereal");
		cesta.add("Salgadinho");
		cesta.add("Biscoito");
		cesta.add("Chocolate");
		cesta.add("Amendoim");		
	
		// o resultado desse print abaixo será 2 pois a classe HashSet não permite itens
		// duplicados
		System.out.println("Quantos itens tem na cesta? " + cesta.size());

		// através desse print pode-se ver que não há itens duplicados
		System.out.println("Há mais um item igual nessa lista, porém no print é desconsiderado, devido a interface não permitir valores duplicados: " + cesta);

		// método contains
		System.out.println("Tem chocolate na cesta? " + cesta.contains("Chocolate"));

		// LinkedHashSet - utilizado abaixo para ordenar de acordo com a inserção
		Set<String> cesta2 = new LinkedHashSet<String>();

		cesta2.add("Salgadinho");
		cesta2.add("CEREAL");
		cesta2.add("Biscoito");
		cesta2.add("Cereal");
		cesta2.add("Chocolate");
		cesta2.add("Cereal");
		cesta2.add("Amendoim");
		
		//ordem por inserção dos itens
		System.out.println("Ordenado por inserção através da implementação da LinkedHashSet: " + cesta2);
		
		// TreeSet - utilizado abaixo para ordenar de forma alfabética
		Set<String> cesta3 = new TreeSet<String>();

		cesta3.add("Salgadinho");
		cesta3.add("CEREAL");
		cesta3.add("Biscoito");
		cesta3.add("Cereal");
		cesta3.add("Chocolate");
		cesta3.add("Cereal");
		cesta3.add("Amendoim");
		
		//ordem por inserção dos itens
		System.out.println("Ordenado de forma alfabética através da implementação da TreeSet: " + cesta3);
		
		System.out.println();

		System.out.println("/*********** INTERFACE MAP ***********/");
		
		// Abaixo há dois tipos, pois é o tipo da chave e do valor (key and value)
		Map<String, String> caixa = new HashMap<>();

		// put = comando para incluir a chave e o valor na variável caixa
		caixa.put("M2225", "Fernando");
		caixa.put("M2226", "Maria");
		caixa.put("M2227", "Soraya");
		
		// containsKey = comando para verificar se existe uma determinada chave na
		// hashmap
		System.out.println("A lista possui a chave M2225? " + caixa.containsKey("M2225"));

		// containsValue = comando para verificar se existe um determinado valor na
		// hashmap
		System.out.println("A lista possui o valor Fernando? " + caixa.containsValue("Fernando"));

		// get = recuperando valor através da chave
		System.out.println("Qual o valor da chave M2225? " + caixa.get("M2225"));

		caixa.remove("M2228");

		System.out.println("Lista após exclusão do item da chave M2228:" + caixa);

		// keySet - retorna todas as chaves (em uma lista do tipo Set)
		System.out.println("Lista de todas as chaves: " + caixa.keySet());
		
		// values - retorna todas os valores (em uma coleção/collection)
		System.out.println("Lista de todas as chaves: " + caixa.values());
		
		// LinkedHashMap - utilizado para ordenar de acordo com a inserção
		
		Map<String, String> caixa2 = new LinkedHashMap<>();

		caixa2.put("M2228", "Adesvaldo");
		caixa2.put("M2229", "Eriscleuda");
		caixa2.put("M22210", "Osvalido");
		
		System.out.println("Lista ordenada por ordem de inserção: " + caixa2 );
		
		// TreeMap - utilizado abaixo para ordenação através da chave
		
		Map<Double, String> caixa3 = new TreeMap<>();

		caixa3.put(22212d, "Maria");
		caixa3.put(22213d, "Juli");
		caixa3.put(22211d, "Matthew");
		caixa3.put(22214d, "Thi");
		
		System.out.println("Lista ordenada pela chave: " + caixa3 );
		
		// quando um array de float é instanciado todos os itens dessa lista são
		// atribuídos com zero, se nada for atribuído:

		float valores[] = new float[3];

		valores[0] = 10;
		valores[1] = 20;

		System.out.println("Valor de um array de float que foi instaciado, mas não possui atribuição de valor: " + valores[2]);
	}

}
