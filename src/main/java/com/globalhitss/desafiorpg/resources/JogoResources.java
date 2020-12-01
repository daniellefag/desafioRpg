package com.globalhitss.desafiorpg.resources;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.globalhitss.desafiorpg.services.JogoService;

/**
 * @author daniellefag
 *
 */
@RestController
@RequestMapping(value="/jogo")
public class JogoResources {

	@Autowired
	private JogoService jogoservice;

	@RequestMapping(method = RequestMethod.GET)
	public String iniciarJogo(Integer personagem01, Integer personagem02) {

		jogoservice.calcularIniciativa(personagem01, personagem02);
		return null;

	}
}
