package com.condicionals;

import java.util.Scanner;

public class Condicionals {

	public static void main(String[] args) {
		
		// Encadeado
		
		Scanner t = new Scanner(System.in);
		System.out.print("Em que ano você nasceu ?");
		int nasc = t.nextInt();
		int i = 2022-nasc;
		System.out.println("Sua idade é " + i);
		if (i<16) {
			System.out.print("Não vota");
		} else if ((i>=16 && i<18) || (i>70)) {
				System.out.print("Voto opcional");
			} else {
				System.out.print("Voto obrigatório");
		}
		
		// 	Múltipla escolha
		
			// Limitações do switch: não pode ter um intervalo de valores e os mesmos só podem ser inteiros
			// Em alguns casos é melhor que o if else
		
		Scanner t2 = new Scanner(System.in);
		System.out.print("Quantas pernas ? ");
		int pernas = t2.nextInt();
		String tipo;
		switch (pernas) {
		case 1:
			tipo = "Saci";
			break;
		case 2:
			tipo = "Bípede";
			break;
		case 4:
			tipo = "Quadrúpede";
			break;
		case 6,8:
			tipo = "Aranha";
			break;
		default:
			tipo = "ET";
		}
		System.out.println("Isso é um: " + tipo);
	}
}
	


