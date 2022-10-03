package com.junit;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class AfterBeforeTest {

    /* Anotação que indica que esse teste será executado com prioridade, antes de todos os outros testes (@Test) */
    @BeforeAll
    public static void iniciaConexao(){
        BancoDeDados.iniciarConexao();
        System.out.println("Rodou iniciaConexao");
    }

    /* Anotação que indica que esse teste será executado antes de cada teste (@Test) */
    @BeforeEach
    void insereDados() {
        BancoDeDados.inserirDados(new Pessoa("Matheus", LocalDateTime.of(2001, 9, 29, 0, 0, 0)));
    }

    /* Anotação que indica que esse teste será executado depois de cada teste (@Test)*/
    @AfterEach
    void removerDados() {
        BancoDeDados.removerDados(new Pessoa("Matheus", LocalDateTime.of(2001, 9, 29, 0, 0, 0)));
    }

    @Test
    public void validarDadosDeRetorno() {
        assertTrue(true);
    }

    /* Anotação que indica que esse teste será executado depois de outros testes (@Test) */
    @AfterAll
    public static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
        System.out.println("Rodou finalizarConexao");
    }



}
