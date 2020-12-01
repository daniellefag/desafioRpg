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

	public static Integer jogarDado(Integer faces) {
		Random resultado = new Random();
		return resultado.nextInt(faces) + 1;
	}
}