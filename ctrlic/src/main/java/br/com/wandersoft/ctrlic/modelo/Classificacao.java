package br.com.wandersoft.ctrlic.modelo;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Classificacao implements Serializable {

	/**
	 * @author Wanderson Santana Pinheiro
	 * Projeto: Controle de licenças
	 */
	private static final long serialVersionUID = 4296169128293327041L;
	@Id
	@SequenceGenerator(name = "classificacao_id_seq", sequenceName = "classificacao_id_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "classificacao_id_seq")
	private Integer id;
	private String nome;
	private String descricaoDetalhada;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricaoDetalhada() {
		return descricaoDetalhada;
	}
	public void setDescricaoDetalhada(String descricaoDetalhada) {
		this.descricaoDetalhada = descricaoDetalhada;
	}
	@Override
	public int hashCode() {
		return Objects.hash(descricaoDetalhada, id, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Classificacao other = (Classificacao) obj;
		return Objects.equals(descricaoDetalhada, other.descricaoDetalhada) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome);
	}
	@Override
	public String toString() {
		return "Classificacao [id=" + id + ", nome=" + nome + ", descricaoDetalhada=" + descricaoDetalhada + "]";
	}
}
