package br.com.wandersoft.ctrlic.bean;

import java.io.Serializable;

import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.wandersoft.ctrlic.dao.TerminalDao;
import br.com.wandersoft.ctrlic.modelo.Terminal;

@Named
@ViewScoped
public class TerminalBean implements Serializable, IBean<Terminal>{

	private static final long serialVersionUID = -5166979944714547811L;
	
	private Terminal terminal = new Terminal();
	private Integer terminalId;
	
	@Inject
	private TerminalDao dao;
	
	

	public Integer getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(Integer terminalId) {
		this.terminalId = terminalId;
	}

	public Terminal getTerminal() {
		return terminal;
	}
	

	public String grava() {
		if (terminal.getId() == null) {
		
			this.dao.adiciona(this.terminal);
		}else {
			this.dao.atualiza(terminal);
		}
		return "empresa?faces-redirect=true";
	}

	public void altera(Terminal terminal) {
		this.terminal = terminal;

	}
		public void remove(Terminal terminal) {
			this.dao.remove(terminal);
		
	}

	public List<Terminal> lista() {
		return this.dao.listaTodos();
	}


	public void carregaPorId() {
		this.terminal = this.dao.buscaPorId(terminalId);
		
	}

}
