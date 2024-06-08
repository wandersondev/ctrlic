package br.com.wandersoft.ctrlic.modelo;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.wandersoft.ctrlic.dao.util.JPAUtil;

public class CadastroDeUsuario {
	@Inject
	static EntityManager em;

	public static void salvarUsuario() {
		try {
			em = new JPAUtil().getEntityManager();
		
		Usuario usu = new Usuario();
		usu.setEmail("email@email.com");
		usu.setSenha("1");
			
		em.getTransaction().begin();
		em.persist(usu);
		em.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		salvarUsuario();

	}

}
