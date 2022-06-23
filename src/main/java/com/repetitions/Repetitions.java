package com.repetitions;

public class Repetitions {
	
	public static void main(String[] args) {
		
		// While - a condição de parada do loop é realizada e somente após a instrução 
		// é validada
		
		int cc = 0;
		while (cc < 4) {
			System.out.println("cambalhota" + cc);
			cc++; 
		}
		
		// Continue - utilizado abaixo para interromper no valor 2 e 4 e reiniciar o loop
		// não executando o print
		
		int c = 0;
		while (c <= 10) {
			c++;
			if (c == 2 || c == 4 ) {
				continue; 	
			}
			System.out.println("mortal" + c);
		}
		
		// Break - utilizado para interromper o loop nesses valores e finalizar o loop
		
		int c2 = 0;
		while (c2 <= 10) {
			c2++;
			if (c2 == 2 || c2 == 4 ) {
				break;
			}	
			System.out.println("borboleta" + c2);
		}
			
		// Do While - a instrução é realizada e somente após a condição de parada do loop
		// é validada
		
		int c3 = 0;
		
		do {
			System.out.println("cambalhota" + cc);
			cc++; 
		} while (cc < 4);
		
		// For tradicional - realizada a atribuição do valor da variável c4, adicionada a condição de
		// parada do loop e o que será realizado caso a condição seja aceita (incremento de c4)
		// e é printado o texto em sysout
		
		for (int c4=0;c4<=3;c4++) {
			System.out.println("cambalhota");
		}
		
		// contagem de 1 a 100
		
		for (int c5=0;c5<101;c5+=10) {
			
			if (c5==0) {
				System.out.println(1);
			} else {
				System.out.println(c5);
			}
		
		// For tradicional alinhado
			
		for (int I = 1; I< 4;I++) {
			for(int J = 0; J< 3;J+=2) {
				System.out.println(I + " " + J);
			}
		}
		
		// For Each - funciona especificamente para vetores
		// nesse for é atribuído na variável valor os valores do vetor n a cada volta do loop
		// diferença do For tradicional - aqui somente é atribuído um valor e é utilizado os dois pontos
		
		int n[] = {16,04,17,02,22};
		
		for (int valor: n) {
			System.out.println(valor);
		}
		
		}		
	}
}
