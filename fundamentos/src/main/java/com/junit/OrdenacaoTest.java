package com.junit;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrdenacaoTest {

    @Order(3)
    @Test
    void validarFluxoA() {
        Assertions.assertTrue(true);
    }

    @Order(2)
    @Test
    void validarFluxoB() {
        Assertions.assertTrue(true);
    }

    @Order(1)
    @Test
    void validarFluxoC() {
        Assertions.assertTrue(true);
    }

}
