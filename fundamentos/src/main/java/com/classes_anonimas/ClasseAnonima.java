package com.classes_anonimas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClasseAnonima {
	
	public static void main(String[] args) {
	
		List<Car> myCars = new ArrayList<>() {{
			add(new Car("Gol", 1253, "azul"));
			add(new Car("Pálio", 5512, "branco"));
			add(new Car("Lancer", 5312, "preto"));
		}};
		
		// Sem classe anônima

		myCars.sort(new ComparatorPlaca());

		// Com classe anônima

		myCars.sort(new Comparator<Car>() {

			@Override
			public int compare(Car c1, Car c2) {
				return Integer.compare(c1.getPlaca(), c2.getPlaca());
			}
		});
		
	}
	
}

class Car {

	private String name;
	private Integer placa;
	private String cor;
	
	public Car(String name, Integer placa, String cor) {
		super();
		this.name = name;
		this.placa = placa;
		this.cor = cor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPlaca() {
		return placa;
	}

	public void setPlaca(Integer placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
}

class ComparatorPlaca implements Comparator<Car> {

	@Override
	public int compare(Car c1, Car c2) {
		return Integer.compare(c1.getPlaca(), c2.getPlaca());
	}

}