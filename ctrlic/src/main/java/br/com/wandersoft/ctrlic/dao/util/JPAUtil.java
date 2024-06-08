package br.com.wandersoft.ctrlic.dao.util;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JPAUtil implements Serializable{
	
	/**
	 * @author Wanderson Santana Pinheiro
	 * Projeto: Controle de licenças
	 * EntityManager será responsável por gerenciar as entidades, seus ciclos de vida, efetuar operações de sincronização com a base de dados.
	 * 
	 */
	private static final long serialVersionUID = 2434903853495587045L;
	
	private static EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("ctrlic");

	/**
	 * @Produces: Esta anotação é usada para habilitar a injeção deste método em outros pontos da aplicação.
	 * @RequestScoped: Esta anotação atribui ao EntityManager o tempo de vida enquanto durar a requisição HTTP.
	 */
	@Produces 
	@RequestScoped 
	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

	public void close(@Disposes EntityManager em) {
		em.close();
	}
}
