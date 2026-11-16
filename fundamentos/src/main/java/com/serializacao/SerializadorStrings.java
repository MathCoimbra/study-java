package com.serializacao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// obrigatório a utilização da IOException
public class SerializadorStrings {
	public static void main(String[] args) throws IOException {
		
		// classe usada para a serializacao do objeto no arquivo texto.ser
		FileOutputStream fileStream = new FileOutputStream("texto.ser");

		// texto que será enviado no arquivo
		String texto = "Não sou dono do mundo, mas sou filho do dono!";

		// classe para criar o objeto que irá receber o texto
		ObjectOutputStream os = new ObjectOutputStream(fileStream);
		// método para a escrita do texto no objeto
		os.writeObject(texto);

		// fechamento da escrita do objeto
		os.close();
		// fechamento da serializacao
		fileStream.close();
	}
}