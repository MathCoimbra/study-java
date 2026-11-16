package com.serializacao;

//pacote
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

// a exceção ClassNotFoundException é obrigatória ao utilizar o método readObject
public class DesserializadorStrings {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// classe para receber o objeto no arquivo serialiazado
		FileInputStream fileStream = new FileInputStream("texto.ser");

		// classe para recuperar o conteúdo do objeto
		ObjectInputStream os = new ObjectInputStream(fileStream);

		// método para a leitura do conteúdo do objeto, é necessário o cast indicado o
		// tipo do objeto, caso contrário será retornado na classe padrão Object
		
		String textoRecuperado = (String) os.readObject();
		
		// retornando em tela o conteúdo recebido
		System.out.println("Texto recuperado: " + textoRecuperado);

		os.close();
		fileStream.close();
	}
}
