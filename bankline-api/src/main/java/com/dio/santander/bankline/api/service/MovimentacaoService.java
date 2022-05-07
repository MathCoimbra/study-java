package com.dio.santander.bankline.api.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.santander.bankline.api.dto.NovaMovimentacao;
import com.dio.santander.bankline.api.model.Correntista;
import com.dio.santander.bankline.api.model.Movimentacao;
import com.dio.santander.bankline.api.model.MovimentacaoTipo;
import com.dio.santander.bankline.api.repository.CorrentistaRepository;
import com.dio.santander.bankline.api.repository.MovimentacaoRepository;

// classe que contém a lógica do sistema e que se comunica com a camada de dados, no caso abaixo
// é utilizado para o cadastramento de uma nova movimentação 

@Service
public class MovimentacaoService {

	@Autowired
	private MovimentacaoRepository repository;

	@Autowired
	private CorrentistaRepository correntistaRepository;

	public void save(NovaMovimentacao novaMovimentacao) {

		Movimentacao movimentacao = new Movimentacao();

		// uso de operador ternário, onde se o tipo de movimentação for receita o valor
		// deve ser positivo, caso não será negativo (multiplicando o valor por -1)

		Double valor = novaMovimentacao.getTipo() == MovimentacaoTipo.RECEITA ? novaMovimentacao.getValor()
				: novaMovimentacao.getValor() * -1;

		movimentacao.setDatahora(LocalDateTime.now());
		movimentacao.setDescricao(novaMovimentacao.getDescricao());
		movimentacao.setIdConta(novaMovimentacao.getIdConta());
		movimentacao.setTipo(novaMovimentacao.getTipo());
		movimentacao.setValor(valor);

		// Regra de negócio para que seja atualizado no saldo da conta do usuário a
		// movimentação registrada

		// findbyId - método de busca pelo ID herdado da família da classe JpaRepository
		// orElse - método para retornar um valor nulo caso um valor não seja retornado

		Correntista correntista = correntistaRepository.findById(novaMovimentacao.getIdConta()).orElse(null);

		if (correntista != null) {
			correntista.getConta().setSaldo(correntista.getConta().getSaldo() + valor);
			correntistaRepository.save(correntista);
		}

		// Movimentação sendo registrada
		
		repository.save(movimentacao);
	}

}
