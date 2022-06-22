package com.serializacao.logradouro;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerializadorLogradouro {
	public static void main(String[] args) throws IOException {
		FileOutputStream fileStream = new FileOutputStream("logradouro.ser");

		Logradouro logradouro = new Logradouro(1, "Rua Ze Locao", TipoLogradouro.RUA, "12345-000");

		ObjectOutputStream os = new ObjectOutputStream(fileStream);
		os.writeObject(logradouro);

		os.close();
		fileStream.close();
	}
}