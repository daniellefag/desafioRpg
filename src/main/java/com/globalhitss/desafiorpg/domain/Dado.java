/**
 * 
 */
package com.globalhitss.desafiorpg.domain;

import java.io.Serializable;
import java.util.Random;




/**
 * @author daniellefag
 *
 */

public class Dado implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer numero;
	

	
	public Dado() {
		this.setNumero(numero);
		
	}



	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		if (numero > 0 && numero < 21) {
			this.numero = numero;
		} else {
			this.numero = 1;
		}
	}


	public void JogarDado() {
		Random resultado = new Random();
		this.setNumero(resultado.nextInt(20) + 1);
		System.out.println(resultado);
	}
	

}
