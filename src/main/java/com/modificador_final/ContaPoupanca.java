package com.modificador_final;

import com.polimorfismo.classe_abstrata.Conta;

// ao declarar que essa classe é final a mesma não pode ser estendida, conforme exemplo na classe ContaPoupancaEspecial

public final class ContaPoupanca extends Conta {

	@Override
	public double verificarSaldo() {
		return saldo;
	}

}