package br.com.wandersoft.ctrlic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

public class DAO<T> implements IDao<T>{
	private final Class<T> classe;
	private EntityManager em;
	
	public DAO(EntityManager manager, Class<T> classe) {
		this.em = manager;
		this.classe = classe;
	}
	
	public void adiciona(T t) {
		em.persist(t);
	}
	
	public void remove(T t) {
		em.remove(em.merge(t));
	}
	
	public void atualiza(T t) {
		em.merge(t);
	}
	
	public List<T> listaTodos(){
		CriteriaQuery<T> query = em.getCriteriaBuilder().createQuery(classe);
		query.select(query.from(classe));
		List<T> lista = em.createQuery(query).getResultList();
		return lista;
	}
	
	public T buscaPorId(Integer id) {
		T instancia = em.find(classe, id);
		return instancia;
	}
	
	public List<T> listaPaginada(int firstResult, int maxResults){
		CriteriaQuery<T> query = em.getCriteriaBuilder().createQuery(classe);
		query.select(query.from(classe));
		List<T> lista =  em.createQuery(query).setFirstResult(firstResult).
					setMaxResults(maxResults).getResultList();
		return lista;
	}
	
	
}
