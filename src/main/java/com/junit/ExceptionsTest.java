package com.junit;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;


public class ExceptionsTest {

    @Test
    public void validarExcecaoTransferencia() {
        Conta contaOrigem = new Conta("12454541", 0);
        Conta contaDestino = new Conta("54786561", 500);


        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        /* assertion que valida se uma exceção será lançada no método */
        Assertions.assertThrows(IllegalArgumentException.class, () -> transferenciaEntreContas.tranferir(contaOrigem, contaDestino, -1));

        /* assertion que valida se uma exceção não será lançada no método */
        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.tranferir(contaOrigem, contaDestino, 1));
    }
}
