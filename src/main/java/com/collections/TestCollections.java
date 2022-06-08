package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestCollections {

	public static void main(String[] args) {
		
		// ARRAY LIST
		
		ArrayList carrinho = new ArrayList();
		
		// Criando os valores
		
		Double valor = 50.99;
		int valor2 = 10;
		int valor3;
		
		// adicionando os valores a lista carrinho através do comando "add"
		
		carrinho.add(valor);
		carrinho.add("Uva");
		carrinho.add(valor2);
		
		// método get utilizado para recuperar o valor de uma lista através de um índice
		
		System.out.println(carrinho.get(1));
		
		// Quando não usado o conceito de Generics conforme exemplo abaixo é necessário utilizar um cast no método get
		// para retornar o valor, no caso abaixo foi atribuído o mesmo dado da variável "valor2"
		
		valor3 = (int) carrinho.get(2);
		
		System.out.println(valor3);
		
		System.out.println("////");
		
		// INTERFACE LIST e uso de GENERICS 
		// Generics não permite uso de tipos primitivos
		
		// Abaixo é criada uma variável do tipo lista que é declarada como uma ArrayList de Strings utilizando Generics
		List<String> carrinho2 = new ArrayList<String>();
		
		// isEmpty = retorna em verdadeiro se a lista estiver vazia e falso caso não esteja vazia
		System.out.println(carrinho2.isEmpty());
		
		carrinho2.add("Laranja");
		carrinho2.add("Maça");
		carrinho2.add("Banana");
		carrinho2.set(1,"Uva");
		
		System.out.println(carrinho2.isEmpty());
		
		// size = retorna o tamanho da ArrayList
		System.out.println(carrinho2.size());
		
		// contains = verifica se o valor está disponível na ArrayList
		System.out.println(carrinho2.contains("Banana"));
		
		// indexOf = retorna o primeiro índice da ocorrência especificada, no caso abaixo a primeira Laranja
		System.out.println(carrinho2.get(carrinho2.indexOf("Laranja")));
		
		// lastIndexOf = retorna o último índice da ocorrência especificada, no caso abaixo a última Laranja 
		System.out.println(carrinho2.get(carrinho2.lastIndexOf("Laranja")));
		
		System.out.println("////");
		
		// INTERFACE SET
		// Abaixo é criada uma variável do tipo set que é declarada como uma HashSet de Strings
		Set<String> cesta = new HashSet<String>();
	
		System.out.println(cesta.isEmpty());
		
		cesta.add("Laranja");
		cesta.add("Laranja");
		cesta.add("LARANJA");
		System.out.println(cesta.isEmpty());
		
		// o resultado desse print abaixo será 2 pois a classe HashSet não permite itens duplicados
		System.out.println(cesta.size());
		
		// através desse print pode-se ver que não há itens duplicados
		System.out.println(cesta);
		
		System.out.println("////");
		
		// INTERFACE MAP
		// Abaixo há dois tipos, pois é o tipo da chave e do valor (key and value)
		Map<String, String> caixa = new HashMap<String, String>();
		
		// put = comando para incluir a chave e o valor na variável caixa
		caixa.put("M2225", "Fernando");
		caixa.put("M2226", "Maria");
		caixa.put("M2227", "Soraya");
		caixa.put("M2228", "Ketelyn");
		
		System.out.println(caixa);
		
		System.out.println(caixa.isEmpty());
		System.out.println(caixa.size());
		
		// containsKey = comando para verificar se existe uma determinada chave na hashmap 
		System.out.println(caixa.containsKey("M2225"));
		
		// containsValue = comando para verificar se existe um determinado valor na hashmap
		System.out.println(caixa.containsValue("Fernando"));
		
		// get = recuperando valor através da chave
		System.out.println(caixa.get("M2225"));
		
		caixa.remove("M2228");
		
		System.out.println(caixa.get("M2228"));
		
		System.out.println(caixa);
		
		// quando um array de float é instanciado todos os itens dessa lista são atribuídos com zero, se nada for atribuído:
		
		float valores[] = new float[3];
		
		valores[0] = 10;
		valores[1] = 20;
		
		System.out.println(valores[2]);
	}

}
 