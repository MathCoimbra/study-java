package com.modificador_static;

public class AcessoCatraca {

	// o modificador static pode ser atribuído a um atributo ou método

	/*
	 * O exemplo abaixo define um atributo estático (totalAcesso) e um atributo não
	 * estático (nome).
	 */

	private static int totalAcesso;

	private String nome;

	/*
	 * O método "entrar" depende do atributo nome. Dessa forma, o método não pode
	 * ser estático, pois ele precisa utilizar um atributo não estático. E também
	 * pode utilizar um atributo estático conforme abaixo:
	 */

	public void entrar(String nome) {
		this.nome = nome;
		totalAcesso = totalAcesso + 1;
	}

	/*
	 * Já o método recuperar Total é estático pois utiliza somente o atributo
	 * totalAcesso que também é estático. Assim, ela não depende de nenhum atributo
	 * de instância da classe.
	 */

	public static int recuperarTotal() {
		return totalAcesso;
	}

	/*
	 * Um detalhe é que se retirarmos o modificador static do método recuperar Total
	 * não causaria nenhum problema de compilação. Porém a melhor opção seria deixar
	 * o método estático, pois ele poderá ser acessado sem uma instância da classe
	 * por realizar uma tarefa comum a todos os objetos
	 */

}