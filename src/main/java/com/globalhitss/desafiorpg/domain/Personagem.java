package com.globalhitss.desafiorpg.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


import com.fasterxml.jackson.annotation.JsonGetter;

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
	private TipoArma arma;

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
			Integer agilidadePersonagem, TipoArma arma) {
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

	public TipoArma getArma() {
		return arma;
	}

	public void setArma(TipoArma arma) {
		this.arma = arma;
	}

	@JsonGetter
	public String getStatus() {
		if(pontosVida <= 0) {
			return "derrotado";
		}

		return "em combate";
	}

}
