package com.operations.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivos {

	public static void main(String[] args) {

		// especificado somente o nome do arquivo que será lido (linha 15)

		try {
			// Classe para abrir o arquivo para leitura
			FileReader stream = new FileReader("arquivo.txt");
			// Classe para leitura dos dados do arquivo
			BufferedReader reader = new BufferedReader(stream);

			System.out.println("Dados do arquivo da raiz do projeto:");

			// Lê uma linha do arquivo através do método readLine que ao ler retorna uma
			// string com o valor lido ou null (caso não tenha mais o que ser lido)
			String linha = reader.readLine();

			// Loop para percorrer cada linha do arquivo e printar no console através do
			// método readLine
			while (linha != null) {
				System.out.println(linha);
				// Lê a próxima linha do arquivo
				linha = reader.readLine();
			}

			// Fecha a leitura do arquivo
			reader.close();
			// Fecha o arquivo
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// especificando aonde o arquivo será lido (linha 47):

		try {
			// Classe para abrir o arquivo

			FileReader stream2 = new FileReader(
					"C:\\Users\\mathe\\Desktop\\FIAP\\Java Fundamentos - Teste de gravacao de arquivo\\arquivo.txt");
			// Classe para escrever no arquivo
			BufferedReader reader2 = new BufferedReader(stream2);

			System.out.println("Dados do arquivo do diretório especificado:");

			// Lê uma linha do arquivo através do método readLine que ao ler retorna uma
			// string com o valor lido ou null (caso não tenha mais o que ser lido)
			String linha2 = reader2.readLine();

			// Loop para percorrer cada linha do arquivo e printar no console através do
			// método readLine
			while (linha2 != null) {
				System.out.println(linha2);
				// Lê a próxima linha do arquivo
				linha2 = reader2.readLine();
			}

			// Fecha a leitura do arquivo
			reader2.close();
			// Fecha o arquivo
			stream2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
