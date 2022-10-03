package com.projetos.imposto.util;

import java.io.IOException;
import java.util.Properties;

public class AliquotaSingleton {

	// Atributo privado static pertence à classe e não ao objeto, será
	// compartilhado por todos os objetos que o acessarem
	private static Properties properties;
	
	private static final String ARQ = "/resources/conf.properties";	
	// O construtor da classe é privado 
	// outros objetos não podem instanciar AliquotaSingleton
	private AliquotaSingleton(){
		
	}
	
	// A única maneira de obter um objeto Properties 
	// é através do método público e estático getInstance()
	// que sempre retornará uma única instância dessa classe
	
	public static Properties getInstance(){
		
		// Se properties é nulo, instancia um para retornar
		// desta forma instanciamos apenas um properties
		if(properties == null){
			properties = new Properties();
			try{
				properties.load(AliquotaSingleton
                                 .class.getResourceAsStream(ARQ));
			} catch(IOException e){
				e.printStackTrace();
			}
		}
		return properties;
	}	
}