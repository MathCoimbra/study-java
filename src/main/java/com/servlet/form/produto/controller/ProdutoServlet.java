package com.servlet.form.produto.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.form.produto.bean.Produto;

/**
 * Servlet implementation class ProdutoServlet
 */
@WebServlet("/produto")
public class ProdutoServlet extends HttpServlet {
    private static List<Produto> lista = new ArrayList<Produto>();
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
		// TODO Auto-generated method stub
		request.setAttribute("produtos", lista);
		request.getRequestDispatcher("lista-produto.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  //Recupera os parâmetros do formulário
		  String nome = request.getParameter("nome");
		  int qtd = Integer.parseInt(request.getParameter("quantidade"));
		  double valor = Double.parseDouble(request.getParameter("valor"));
		  
		  //Cria um objeto do tipo Produto
		  Produto produto = new Produto(nome, qtd, valor);
		  //Adiciona o produto na lista
		  lista.add(produto);
		  
		  //Mensagem de sucesso
		  request.setAttribute("msg","Produto cadastrado!");
		  
		  request.getRequestDispatcher("cadastro-produto.jsp").forward(request, response);
	}

}
