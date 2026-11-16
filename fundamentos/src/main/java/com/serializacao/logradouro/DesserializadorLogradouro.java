package com.serializacao.logradouro;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DesserializadorLogradouro {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fileStream = new FileInputStream("logradouro.ser");
		ObjectInputStream os = new ObjectInputStream(fileStream);

		// única diferença em comparação a desserialização das strings é que nesse caso
		// o cast é da classe
		Logradouro logradouroRecuperado = (Logradouro) os.readObject();

		// e após a desserialização qualquer método de Logradouro pode ser invocado
		// conforme abaixo
		System.out
				.println("Logradouro recuperado: " + logradouroRecuperado.getId() + " " + logradouroRecuperado.getNome()
						+ " " + "Tipo: " + logradouroRecuperado.getTipo() + " " + logradouroRecuperado.getCep());

		os.close();
		fileStream.close();
	}
}