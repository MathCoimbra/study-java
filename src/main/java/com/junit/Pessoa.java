package com.junit;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pessoa {

    private String nome;
    private LocalDateTime nascimento;

    public Pessoa(String nome, LocalDateTime nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public int getIdade(){
        return (int) ChronoUnit.YEARS.between(nascimento, LocalDateTime.now());
    }

    public boolean calcularSeEhMaiorDeIdade(){
        return getIdade() >= 18;
    }

}
