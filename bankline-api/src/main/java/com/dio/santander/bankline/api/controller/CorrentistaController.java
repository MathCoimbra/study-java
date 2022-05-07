package com.dio.santander.bankline.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.bankline.api.dto.NovoCorrentista;
import com.dio.santander.bankline.api.model.Correntista;
import com.dio.santander.bankline.api.repository.CorrentistaRepository;
import com.dio.santander.bankline.api.service.CorrentistaService;

// RestController - anotação para definir um controller no padrão Rest para a Api
// RequestMapping - anotação para implementar parte da URL que receberá algum tipo de requisição

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {

	// repository - objeto que irá buscar no banco de dados os correntistas

	// Autowired - instaciação automática do objeto pelo Spring para utilização em
	// algum lugar do sistema posteriormente

	@Autowired
	private CorrentistaRepository repository;

	// service - objeto responsável pelo cadastrado de um novo correntista seguindo
	// as regras de negócio definidas em CorrentistaService

	@Autowired
	private CorrentistaService service;

	// método para verificação de todos os correntistas no banco de dados

	// GetMapping - anotação para informar que a requisição é do tipo GET, para
	// consulta

	@GetMapping
	public List<Correntista> findAll() {
		return repository.findAll();
	}

	// método para cadastrar um novo correntista

	// PostMapping - anotação para informar que a requisição é do tipo POST, para
	// cadastro
	// RequestBody - anotação para informar que esse parâmetro do método faz parte
	// do corpo da requisição

	@PostMapping
	public void save(@RequestBody NovoCorrentista correntista) {
		service.save(correntista);
	}
}
