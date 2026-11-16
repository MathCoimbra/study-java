package com.junit;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDateTime;

public class AssertionsTest {

    /* Anotação para indicar um teste */
    @Test
    public void deveCalcularIdadeCorreta() {
        Pessoa matheus = new Pessoa("Matheus", LocalDateTime.of(2001, 9, 29, 0, 0, 0));
        /* Assertions de equivalência */
        Assertions.assertEquals(21, matheus.getIdade());
    }

    @Test
    public void deveRetornarSeForMaiorIdade() {
        Pessoa thiago = new Pessoa("Thiago", LocalDateTime.of(2001, 9, 29, 0, 0, 0));
        /* Assertions de valor boolean */
        Assertions.assertTrue(thiago.calcularSeEhMaiorDeIdade());

        Pessoa theo = new Pessoa("Theo", LocalDateTime.of(2021, 10, 23, 0, 0, 0));
        /* Assertions de valor boolean */
        Assertions.assertFalse(theo.calcularSeEhMaiorDeIdade());
    }

}