/**
 * 
 */
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
	
	//arma
	private Integer ataqueArma;
	private Integer defesaArma;
	
	//personagem
	private Integer forcaPersonagem;
	private Integer agilidadePersonagem;
	
	//dados
	private Integer facesDado;
	
	public Personagem() {
		
	}

	/**
	 * @param id
	 * @param descricao
	 * @param pontosVida
	 * @param ataqueArma
	 * @param defesaArma
	 * @param forcaPersonagem
	 * @param agilidadePersonagem
	 * @param facesDado
	 */
	public Personagem(Integer id, String descricao, Integer pontosVida, Integer ataqueArma, Integer defesaArma,
			Integer forcaPersonagem, Integer agilidadePersonagem, Integer facesDado) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.pontosVida = pontosVida;
		this.ataqueArma = ataqueArma;
		this.defesaArma = defesaArma;
		this.forcaPersonagem = forcaPersonagem;
		this.agilidadePersonagem = agilidadePersonagem;
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

	public Integer getPontosVida() {
		return pontosVida;
	}

	public void setPontosVida(Integer pontosVida) {
		this.pontosVida = pontosVida;
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

	public Integer getFacesDado() {
		return facesDado;
	}

	public void setFacesDado(Integer facesDado) {
		this.facesDado = facesDado;
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
