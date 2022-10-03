package com.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class CondicionalsTest {

    @Test
    /* Execução do teste com a condição de que seja no windows por exemplo */
    @EnabledOnOs(OS.WINDOWS)
    void validarUsuario(){
        Assertions.assertEquals(10, 5+5);
    }
}

