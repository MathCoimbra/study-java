package com.projeto.imposto.model;

import java.util.Observable;

import com.projeto.imposto.util.AliquotaSingleton;

// O Model é um Observable
// A Classe Pis da camada Model não possui referência a View ou ao // Controller
// Ao implementar Imposto, teremos maior flexibilidade no Controller
@SuppressWarnings("deprecation")
public class Pis extends Observable implements Imposto{
	
	private final float ALIQUOTA = Float.parseFloat(AliquotaSingleton.getInstance().getProperty("aliquotaPis"));
	private float valorDoPis = 0;
		
	public Pis() {
		System.out.println("Construtor do Model chamado");
	}

	public float getAliquota() {
		return ALIQUOTA;
	}
	
	public float getValorDoPis() {
		return valorDoPis;
	}
	
	public void calcularImposto(float valor) {
		valorDoPis = valor * ALIQUOTA;
		// setChanged Altera o estado interno do objeto 
           // para true, pois houve alteração no estado valorDoPis 
		setChanged();
		// Os observadores devem ser notificados
		// Envia o valor do PIS como parte da mensagem de 
           // notificação para a View que é um Observer
		notifyObservers(valorDoPis);
	}

	@Override
	public String toString() {
		return "Pis [ALIQUOTA=" + ALIQUOTA 
                                    + ", valorDoPis=" + valorDoPis + "]";
      }
}