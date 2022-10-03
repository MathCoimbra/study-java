package com.junit;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {

    @Test
    void validarUsuario(){
        /* supondo que o usuário não seja o root execute a assertion abaixo  */
        Assumptions.assumeFalse("root".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5+5);
    }
}
