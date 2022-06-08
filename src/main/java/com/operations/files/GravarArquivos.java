package com.operations.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GravarArquivos {

	public static void main(String[] args) {

		// especificado somente o nome do arquivo (linha 16), caso não esteja criado
		// será criado de forma auto. na raiz do projeto:

		try {
			// Classe para abrir o arquivo para gravação
			FileWriter stream = new FileWriter("arquivo.txt");
			// Classe para escrever no arquivo
			PrintWriter print = new PrintWriter(stream);

			// Escreve no arquivo
			print.println("Teste");
			print.println("Escrevendo no arquivo");
			print.println("Escrevendo no arquivo novamente");

			// Fecha a escrita
			print.close();
			// Fecha o arquivo
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// especificando aonde o arquivo será salvo (linha 39):

		try {
			// Classe para abrir o arquivo

			FileWriter stream2 = new FileWriter(
					"C:\\Users\\mathe\\Desktop\\FIAP\\Java Fundamentos - Teste de gravacao de arquivo\\arquivo.txt");
			// Classe para escrever no arquivo
			PrintWriter print = new PrintWriter(stream2);

			// Escreve no arquivo
			print.println("Teste");
			print.println("Teste2");
			print.println("Escrevendo no arquivo");

			// Fecha a escrita
			print.close();
			// Fecha o arquivo
			stream2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
