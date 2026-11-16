package com.dio.santander.bankline.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.bankline.api.model.Movimentacao;

// Interface responsável por salvar as movimentações

// Extende da classe JPARepository que é a responsável por realizar o CRUD no banco de dados

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {

}
