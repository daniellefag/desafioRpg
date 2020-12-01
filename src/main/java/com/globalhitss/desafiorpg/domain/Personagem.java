package com.globalhitss.desafiorpg.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author daniellefag
 *
 */
@Entity
public class Personagem implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private Integer pontosVida;
	private Integer forcaPersonagem;
	private Integer agilidadePersonagem;
	
	@OneToOne
	@JoinColumn 
	private TiposArmas arma;


	

	
	public Personagem() {
		
	}


	

	/**
	 * @param id
	 * @param descricao
	 * @param pontosVida
	 * @param forcaPersonagem
	 * @param agilidadePersonagem
	 * @param arma
	 */
	public Personagem(Integer id, String descricao, Integer pontosVida, Integer forcaPersonagem,
			Integer agilidadePersonagem, TiposArmas arma) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.pontosVida = pontosVida;
		this.forcaPersonagem = forcaPersonagem;
		this.agilidadePersonagem = agilidadePersonagem;
		this.arma = arma;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getPontosVida() {
		return pontosVida;
	}

	public void setPontosVida(Integer pontosVida) {
		this.pontosVida = pontosVida;
	}


	public Integer getForcaPersonagem() {
		return forcaPersonagem;
	}

	public void setForcaPersonagem(Integer forcaPersonagem) {
		this.forcaPersonagem = forcaPersonagem;
	}

	public Integer getAgilidadePersonagem() {
		return agilidadePersonagem;
	}

	public void setAgilidadePersonagem(Integer agilidadePersonagem) {
		this.agilidadePersonagem = agilidadePersonagem;
	}


	

	public TiposArmas getArma() {
		return arma;
	}

	public void setArma(TiposArmas arma) {
		this.arma = arma;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personagem other = (Personagem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	

}
