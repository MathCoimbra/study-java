package com.projeto.fiap.store.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.projeto.fiap.store.bean.Produto;
import com.projeto.fiap.store.dao.ProdutoDAO;
import com.projeto.fiap.store.exception.DBException;
import com.projeto.fiap.store.factory.DAOFactory;

@WebServlet("/produto")
public class ProdutoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private ProdutoDAO dao;

	@Override
	public void init() throws ServletException {
		super.init();
		dao = DAOFactory.getProdutoDAO();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		
		switch (acao) {
		case "listar":
			listar(request, response);
			break;
		case "abrir-form-edicao":
			abrirFormEdicao(request, response);
			break;
		}
		
	}

	private void abrirFormEdicao(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("codigo"));
		Produto produto = dao.buscar(id);
		request.setAttribute("produto", produto);
		request.getRequestDispatcher("edicao-produto.jsp").forward(request, response);
	}

	private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Produto> lista = dao.listar();
		request.setAttribute("produtos", lista);
		request.getRequestDispatcher("lista-produto.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String acao = request.getParameter("acao");
		
		switch (acao) {
		case "cadastrar":
			cadastrar(request, response);
			break;
		case "editar":
			editar(request,response);
			break;
		case "excluir":
			excluir(request, response);
			break;
		}
	}

	private void excluir(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int codigo = Integer.parseInt(request.getParameter("codigo"));
		try {
			dao.remover(codigo);
			request.setAttribute("msg", "Produto removido!");
		} catch (DBException e) {
			e.printStackTrace();
			request.setAttribute("erro", "Erro ao atualizar");
		}
		listar(request,response);
	}

	private void editar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int codigo = Integer.parseInt(request.getParameter("codigo"));
			String nome = request.getParameter("nome");
			int quantidade = Integer.parseInt(request.getParameter("quantidade"));
			double preco = Double.parseDouble(request.getParameter("valor"));
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			Calendar fabricacao = Calendar.getInstance();
			fabricacao.setTime(format.parse(request.getParameter("fabricacao")));

			Produto produto = new Produto(codigo, nome, preco, fabricacao, quantidade);
			dao.atualizar(produto);

			request.setAttribute("msg", "Produto atualizado!");
		} catch (DBException db) {
			db.printStackTrace();
			request.setAttribute("erro", "Erro ao atualizar");
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", "Por favor, valide os dados");
		}
		listar(request,response);
	}

	private void cadastrar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String nome = request.getParameter("nome");
			int quantidade = Integer.parseInt(request.getParameter("quantidade"));
			double preco = Double.parseDouble(request.getParameter("valor"));
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			Calendar fabricacao = Calendar.getInstance();
			fabricacao.setTime(format.parse(request.getParameter("fabricacao")));

			Produto produto = new Produto(0, nome, preco, fabricacao, quantidade);
			dao.cadastrar(produto);

			request.setAttribute("msg", "Produto cadastrado!");
		} catch (DBException db) {
			db.printStackTrace();
			request.setAttribute("erro", "Erro ao cadastrar");
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", "Por favor, valide os dados");
		}
		request.getRequestDispatcher("cadastro-produto.jsp").forward(request, response);
	}

}