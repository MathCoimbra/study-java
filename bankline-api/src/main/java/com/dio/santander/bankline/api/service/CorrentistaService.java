package com.dio.santander.bankline.api.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.santander.bankline.api.dto.NovoCorrentista;
import com.dio.santander.bankline.api.model.Conta;
import com.dio.santander.bankline.api.model.Correntista;
import com.dio.santander.bankline.api.repository.CorrentistaRepository;

// classe que contém a lógica do sistema e que se comunica com a camada de dados, no caso abaixo
// é utilizado para o cadastramento de um novo correntista 

@Service
public class CorrentistaService {

	@Autowired
	private CorrentistaRepository repository;
	
	public void save(NovoCorrentista novoCorrentista) {
		
		Correntista correntista = new Correntista();
		correntista.setCpf(novoCorrentista.getCpf());
		correntista.setNome(novoCorrentista.getNome());
		
		Conta conta  = new Conta();
		conta.setSaldo(0.0);
		// número da conta será com base na data e hora de cadastro do correntista
		conta.setNumero(new Date().getTime());
		
		correntista.setConta(conta);
		
		repository.save(correntista);
	}

}
