package com.projetos.imposto.view;

import com.projetos.imposto.controller.ImpostoController;
import com.projetos.imposto.model.Pis;

public class TestaCalculo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Pis modelPis = new Pis();
		CalculaPis viewCalculaPis = new CalculaPis();
		// Adiciona um observador para o objeto observado Pis
		modelPis.addObserver(viewCalculaPis);
		// Instancia um Controller e informa quem ele controlará
		ImpostoController controller = 
				new ImpostoController(modelPis, viewCalculaPis);
		// Envia o controller criado para a View 
		viewCalculaPis.addController(controller);
	}
}