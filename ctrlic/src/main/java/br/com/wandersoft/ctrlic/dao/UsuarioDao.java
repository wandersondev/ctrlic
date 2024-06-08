package br.com.wandersoft.ctrlic.dao;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.com.wandersoft.ctrlic.dao.util.JPAUtil;
import br.com.wandersoft.ctrlic.modelo.Usuario;


public class UsuarioDao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Inject
	EntityManager em;

	public boolean existeUsuario(Usuario usuario) {

		TypedQuery<Usuario> query = em.createQuery(
				  " select u from Usuario u "
				+ " where u.email = :pEmail and u.senha = :pSenha", Usuario.class);
		
		query.setParameter("pEmail", usuario.getEmail());
		query.setParameter("pSenha", usuario.getSenha());
		try {
			Usuario resultado =  query.getSingleResult();
		} catch (NoResultException ex) {
			return false;
		}
		
		return true;
	}
	
	public boolean existe(Usuario usuario) {

	TypedQuery<Usuario> query = em
				.createQuery(
						"select u from Usuario u where u.email = :pEmail and u.senha = :pSenha",
						Usuario.class);

		query.setParameter("pEmail", usuario.getEmail());
		query.setParameter("pSenha", usuario.getSenha());

		try {
			Usuario resultado = query.getSingleResult();
			em.close();
			return true;
		} catch (NoResultException ex) {
			em.close();
			return false;
		}
	}

}
