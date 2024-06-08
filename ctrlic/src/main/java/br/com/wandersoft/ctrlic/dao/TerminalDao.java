package br.com.wandersoft.ctrlic.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.wandersoft.ctrlic.modelo.Terminal;



public class TerminalDao implements IDao<Terminal>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1337758425810087454L;

	@Inject
	EntityManager manager;
	
	private DAO<Terminal> dao;
	
	@PostConstruct
	void init() {
		this.dao = new DAO<Terminal>(manager, Terminal.class);
	}
	

	public void adiciona(Terminal t) {
		dao.adiciona(t);
		
	}


	public void remove(Terminal t) {
		dao.remove(t);
		
	}


	public void atualiza(Terminal t) {
		dao.atualiza(t);
		
	}


	public List<Terminal> listaTodos() {
		return dao.listaTodos();
	}


	public Terminal buscaPorId(Integer id) {
		return dao.buscaPorId(id);
	}


	public List<Terminal> listaPaginada(int firstResult, int maxResults) {
		
		return dao.listaPaginada(firstResult, maxResults);
	}

}
