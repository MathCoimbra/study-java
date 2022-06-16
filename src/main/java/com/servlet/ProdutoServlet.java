package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProdutoServlet
 */
@WebServlet("/produto")
public class ProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProdutoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int codigo = Integer.parseInt(request.getParameter("codigo"));
		
		System.out.println("C�digo: " + codigo);
		
		request.setAttribute("cod", codigo);
		// Adicionando outro atributo, por meio da Servlet (tamb�m poderia ser adicionado no link do index):
		request.setAttribute("nome", "Caneta Vermelha");
		request.getRequestDispatcher("busca_produto.jsp").forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Recuperar os par�metros do formul�rio HTML
    	String nome = request.getParameter("nome");
    	int qtd = Integer.parseInt(request.getParameter("quantidade"));
    	double valor = Double.parseDouble(request.getParameter("valor"));
    	
    	//Exibe os valores no console do eclipse
    	System.out.println("Produto: " + nome + " " + "Quantidade: " + qtd + " " + "Valor: " + " " + valor);
    	
    	//Adiciona atributos no request para exibir na p�gina
    	request.setAttribute("nomeProduto", nome);
    	request.setAttribute("quantidade", qtd);
    	request.setAttribute("valorProduto", valor);
    	
    	request.getRequestDispatcher("sucesso.jsp").forward(request, response);
	}
}