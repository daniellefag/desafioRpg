package com.globalhitss.desafiorpg.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * @author daniellefag
 *
 */
@Entity
public class TipoArma implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private Integer ataqueArma;
	private Integer defesaArma;
	
    private Integer facesDado;
	
	public TipoArma() {
		
	}

	/**
	 * @param id
	 * @param descricao
	 * @param ataqueArma
	 * @param defesaArma
	 * @param facesDado
	 */
	public TipoArma(Integer id, String descricao, Integer ataqueArma, Integer defesaArma, Integer facesDado) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.ataqueArma = ataqueArma;
		this.defesaArma = defesaArma;
		this.facesDado = facesDado;
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

	public Integer getAtaqueArma() {
		return ataqueArma;
	}

	public void setAtaqueArma(Integer ataqueArma) {
		this.ataqueArma = ataqueArma;
	}

	public Integer getDefesaArma() {
		return defesaArma;
	}

	public void setDefesaArma(Integer defesaArma) {
		this.defesaArma = defesaArma;
	}

	public Integer getFacesDado() {
		return facesDado;
	}

	public void setFacesDado(Integer facesDado) {
		this.facesDado = facesDado;
	}

}
