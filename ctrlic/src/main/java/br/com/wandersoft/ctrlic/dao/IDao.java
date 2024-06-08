package br.com.wandersoft.ctrlic.dao;

import java.util.List;

public interface IDao<T> {
	
	public void adiciona(T t);
	
	public void remove(T t);
	
	public void atualiza(T t);
	
	public List<T> listaTodos();
	
	public T buscaPorId(Integer id);
	
	public List<T> listaPaginada(int firstResult, int maxResults);


}
