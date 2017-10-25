package br.com.projeto.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	
	static EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("TrabalhoArquiteturaSoftware");
	

	public static EntityManagerFactory getInstance() {
		return emf;
	}
}
