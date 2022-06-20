package com.projeto.fiap.store.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.projeto.fiap.store.bean.Produto;
import com.projeto.fiap.store.dao.ProdutoDAO;
import com.projeto.fiap.store.exception.DBException;
import com.projeto.fiap.store.singleton.ConnectionManager;

public class OracleProdutoDAO implements ProdutoDAO {

	private Connection conexao;
	
	@Override
	public void cadastrar(Produto produto) throws DBException {
		PreparedStatement stmt = null;

		try {
			conexao = ConnectionManager.getInstance().getConnection();
			String sql = "INSERT INTO TB_PRODUTO (CD_PRODUTO, NM_PRODUTO, QT_PRODUTO, VL_PRODUTO, DT_FABRICACAO) VALUES (SQ_TB_PRODUTO.NEXTVAL, ?, ?, ?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, produto.getNome());
			stmt.setInt(2, produto.getQuantidade());
			stmt.setDouble(3, produto.getValor());
			java.sql.Date data = new java.sql.Date(produto.getDataFabricacao().getTimeInMillis());
			stmt.setDate(4, data);

			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("Erro ao cadastradar.");
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void atualizar(Produto produto) throws DBException {
		PreparedStatement stmt = null;

		try {
			conexao = ConnectionManager.getInstance().getConnection();
			String sql = "UPDATE TB_PRODUTO SET NM_PRODUTO = ?, QT_PRODUTO = ?, VL_PRODUTO = ?, DT_FABRICACAO = ? WHERE CD_PRODUTO = ?";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, produto.getNome());
			stmt.setInt(2, produto.getQuantidade());
			stmt.setDouble(3, produto.getValor());
			java.sql.Date data = new java.sql.Date(produto.getDataFabricacao().getTimeInMillis());
			stmt.setDate(4, data);
			stmt.setInt(5, produto.getCodigo());

			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("Erro ao atualizar.");
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void remover(int codigo) throws DBException {
			PreparedStatement stmt = null;

			try {
				conexao = ConnectionManager.getInstance().getConnection();
				String sql = "DELETE FROM TB_PRODUTO WHERE CD_PRODUTO = ?";
				stmt = conexao.prepareStatement(sql);
				stmt.setInt(1, codigo);
				stmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DBException("Erro ao remover.");
			} finally {
				try {
					stmt.close();
					conexao.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}

	@Override
	public Produto buscar(int id) {
		Produto produto = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conexao = ConnectionManager.getInstance().getConnection();
			stmt = conexao.prepareStatement("SELECT * FROM TB_PRODUTO WHERE CD_PRODUTO = ?");
			stmt.setInt(1, id);
			rs = stmt.executeQuery();

			if (rs.next()){
				int codigo = rs.getInt("CD_PRODUTO");
				String nome = rs.getString("NM_PRODUTO");
				int qtd = rs.getInt("QT_PRODUTO");
				double valor = rs.getDouble("VL_PRODUTO");
				java.sql.Date data = rs.getDate("DT_FABRICACAO");
				Calendar dataFabricacao = Calendar.getInstance();
				dataFabricacao.setTimeInMillis(data.getTime());
				
				produto = new Produto(codigo, nome, valor, dataFabricacao, qtd);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				rs.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return produto;
	}

	@Override
	public List<Produto> listar() {
		List<Produto> lista = new ArrayList<Produto>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conexao = ConnectionManager.getInstance().getConnection();
			stmt = conexao.prepareStatement("SELECT * FROM TB_PRODUTO");
			rs = stmt.executeQuery();

			//Percorre todos os registros encontrados
			while (rs.next()) {
				int codigo = rs.getInt("CD_PRODUTO");
				String nome = rs.getString("NM_PRODUTO");
				int qtd = rs.getInt("QT_PRODUTO");
				double valor = rs.getDouble("VL_PRODUTO");
				java.sql.Date data = rs.getDate("DT_FABRICACAO");
				Calendar dataFabricacao = Calendar.getInstance();
				dataFabricacao.setTimeInMillis(data.getTime());
				
				Produto produto = new Produto(codigo, nome, valor, dataFabricacao, qtd);
				lista.add(produto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				rs.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return lista;
	}

}