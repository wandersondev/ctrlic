package br.com.wandersoft.ctrlic.bean;

import java.util.List;
/**
 * @author Wanderson Santana Pinheiro
 * Projeto: Controle de licenças
 * 
 * Interface que contém a lista de métodos básicos para operações CRUD de manipulação de registros.
 * Alterar para:
 * public interface IBean<T, ID> {
 *
 *   public T carregaPorId(ID id);
 *   public String grava(T t);
 *   public void altera(T t);
 *   public void remove(ID id);
 *   public List<T> lista();
 *   
 * }
 * 
 * */
public interface IBean<T> {

	public void carregaPorId();
	public String grava();
	public void altera(T t);
	public void remove(T t);
	public List<T> lista();
	
	
}
