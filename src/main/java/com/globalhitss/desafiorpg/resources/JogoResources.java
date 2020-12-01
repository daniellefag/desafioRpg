package com.globalhitss.desafiorpg.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.globalhitss.desafiorpg.domain.Personagem;
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

	@RequestMapping(value = "/calcularIniciativa")
	public Personagem calcularIniciativa(@RequestParam Integer personagem01, @RequestParam Integer personagem02) {

		Personagem personagemIniciativa = jogoservice.calcularIniciativa(personagem01, personagem02);
		return personagemIniciativa;

	}
	
	@RequestMapping(value = "/realizarAtaque")
	public Personagem realizarAtaque(@RequestParam Integer personagemAtaque, @RequestParam Integer personagemDefesa) {

		Personagem personagem = jogoservice.realizarAtaque(personagemAtaque, personagemDefesa);
		return personagem;

	}

	
	@RequestMapping(value = "/calcularDano")
	public Personagem calcularDano(@RequestParam Integer personagemAtaque, @RequestParam Integer personagemDefesa) {

		Personagem personagemSofreuDano = jogoservice.calcularDano(personagemAtaque, personagemDefesa);
        return personagemSofreuDano; 
	}
	
}
