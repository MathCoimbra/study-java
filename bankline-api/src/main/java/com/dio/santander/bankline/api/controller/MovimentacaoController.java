package com.dio.santander.bankline.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.bankline.api.dto.NovaMovimentacao;
import com.dio.santander.bankline.api.model.Movimentacao;
import com.dio.santander.bankline.api.repository.MovimentacaoRepository;
import com.dio.santander.bankline.api.service.MovimentacaoService;

// RestController - anotação para definir um controller no padrão Rest para a Api
// RequestMapping - anotação para implementar parte da URL que receberá algum tipo de requisição

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {

	// repository - objeto que irá buscar no banco de dados as movimentações

	// Autowired - instaciação automática do objeto pelo Spring para utilização em
	// algum lugar do sistema posteriormente

	@Autowired
	private MovimentacaoRepository repository;

	// service - objeto responsável pelo cadastrado de uma nova movimentação seguindo
	// as regras de negócio definidas em MovimentacaoService

	@Autowired
	private MovimentacaoService service;

	// método para verificação de todas as movimentações no banco de dados

	// GetMapping - anotação para informar que a requisição é do tipo GET, para
	// consulta

	@GetMapping
	public List<Movimentacao> findAll() {
		return repository.findAll();
	}

	// método para cadastrar uma nova movimentação

	// PostMapping - anotação para informar que a requisição é do tipo POST, para
	// cadastro
	// RequestBody - anotação para informar que esse parâmetro do método faz parte
	// do corpo da requisição

	@PostMapping
	public void save(@RequestBody NovaMovimentacao movimentacao) {
		service.save(movimentacao);
	}
}
