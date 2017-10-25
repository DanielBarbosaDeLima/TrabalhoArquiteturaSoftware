package br.com.projeto.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import br.com.projeto.entity.Contrato;
import br.com.projeto.util.Conexao;

public class ContratoDAO  implements InterfacePacote_Seguro{
	
	EntityManagerFactory emf = Conexao.getInstance();
	
	public void cadastrar(Contrato c) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		
		em.close();	
	}

	
	public void excluir(Contrato c) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Contrato contrato = em.find(Contrato.class, c.getId());
		em.remove(contrato);
		em.getTransaction().commit();
		
		em.close();	
	}

	
	public List<Contrato> listar() {
		EntityManager em = Conexao.getInstance().
				createEntityManager();
		Query q = em.createQuery("from Contrato");
		
		return q.getResultList();
	}
	
}
