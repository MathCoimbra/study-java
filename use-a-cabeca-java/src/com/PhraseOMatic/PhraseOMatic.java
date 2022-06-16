package com.PhraseOMatic;

public class PhraseOMatic {
	public static void main(String[] args) {

		String[] wordListOne = { "Java", "HTML", "CSS", "Javascript", "Python", "Front-end",
				"Back-end", ".Net", "C", "COBOL" };

		String[] wordListTwo = { "é bom ", "não é bom", "é melhor", "não é melhor", "pode ser melhor", "é horrível",
				"não é tão ruim", "é mediano", "da pro gasto" };

		String[] wordListThree = {"para iniciantes", "para intermediarios", "para avançados"};

		// pegando número de itens das listas
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		// gerando 3 números aleatórios
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);

		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

		// formando frase com os itens
		System.out.println(phrase);

	}
}
