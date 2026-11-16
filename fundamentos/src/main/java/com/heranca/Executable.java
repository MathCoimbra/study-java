package com.heranca;

public class Executable {

	public static void main(String[] args) {
		
		//Testando a herança
		
		//Instanciando a classe Cachorro e utilizando os métodos da classe Animal e também da classe Cachorro, não é declarada a classe Animal pois já é realizado isso na herança
		
		Cachorro maguie = new Cachorro();
		maguie.setAlimenta("Maguie come ração");
		maguie.setLocomove("Maguie anda");
		maguie.setLatido("Maguie late");

		//Instanciando a classe Gato a partir da super classe Animal, nesse procedimento somente os métodos da super classe podem ser utilizados
		
		Animal milena = new Gato();
		milena.setAlimenta("Milena come ração");
		milena.setLocomove("Milena anda");

	}

}
