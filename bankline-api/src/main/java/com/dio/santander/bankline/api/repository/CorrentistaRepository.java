package com.dio.santander.bankline.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.bankline.api.model.Correntista;

// Interface responsável por salvar os correntistas

// Extende da classe JPARepository que é a responsável por realizar o CRUD no banco de dados

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {

}
