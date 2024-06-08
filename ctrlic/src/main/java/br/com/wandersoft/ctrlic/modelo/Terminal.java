package br.com.wandersoft.ctrlic.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Terminal implements Serializable {
	/**
	 * @author Wanderson Santana Pinheiro
	 * Projeto: Controle de licenças
	 * 
	 */
	private static final long serialVersionUID = -4552545726774488054L;
	
	@Id
	@SequenceGenerator(name = "terminal_id_seq", sequenceName = "terminal_id_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "terminal_id_seq")
	private Integer id;
	private String hostName;
	private String macAddress;
	
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
	
	@Override
	public String toString() {
		return "Terminal [id=" + id + ", hostName=" + hostName + ", macAddress=" + macAddress + "]";
	}
	
	
}
