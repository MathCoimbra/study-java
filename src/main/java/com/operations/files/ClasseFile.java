package com.operations.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ClasseFile {

	public static void main(String[] args) {

		File arquivo1 = new File("File.txt");

		// Verifica se o arquivo existe caso não é criado
		if (arquivo1.exists()) {
			System.out.println("O arquivo existe!" + " Pode ser lido: " + arquivo1.canRead() + " Pode ser gravado: "
					+ arquivo1.canWrite() + " Tamanho: " + arquivo1.length() + " Caminho: " + arquivo1.getPath());
		} else {
			// Cria o arquivo
			try {
				if (arquivo1.createNewFile())
					System.out.println("Arquivo criado!");
				else
					System.out.println("Arquivo não criado!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// Verifica se um diretório existe caso não é criado
		File diretorio = new File("diretorio teste");

		if (diretorio.exists()) {
			System.out.println("Diretório existe!");
		} else {
			if (diretorio.mkdir())
				System.out.println("Diretório criado!");
			else
				System.out.println("Diretório não criado.");
		}

		// Criando um arquivo dentro do diretório criado
		File arquivo2 = new File(diretorio, "teste.txt");
		try {
			if (arquivo2.createNewFile())
				System.out.println("Arquivo criado!");
			else
				System.out.println("Arquivo não criado!");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// A classe File pode ser utilizada junto com as outras classes de leitura e
		// gravação de dados, bastando apenas utilizar o objeto criado:

		try {
			// GRAVAÇÃO DE DADOS NO ARQUIVO 1 - File.txt

			// Abrindo o primeiro arquivo para escrita
			FileWriter writer = new FileWriter(arquivo1);

			// Classe para escrever no primeiro arquivo
			PrintWriter print = new PrintWriter(writer);

			// Escrevendo no primeiro arquivo
			print.println("Teste");
			print.println("Escrevendo no arquivo");
			print.println("Escrevendo no arquivo novamente");

			// Fechando a escrita
			print.close();
			// Fechando o arquivo
			writer.close();

			// LEITURA DOS DADOS NO ARQUIVO 2 - teste.txt

			// Abrindo o segundo arquivo para leitura
			FileReader stream = new FileReader(arquivo2);

			// Classe para leitura dos dados do segundo arquivo
			BufferedReader reader = new BufferedReader(stream);

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
			// Fecha o segundo arquivo
			stream.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
