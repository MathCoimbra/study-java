package com.junit;

public class TransferenciaEntreContas {

    public void tranferir(Conta contaOrigem, Conta contaDestino, int valor) {
        if (valor <= 0) throw new IllegalArgumentException("Valor deve ser maior que zero");
    }
}
