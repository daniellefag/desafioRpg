package com.globalhitss.desafiorpg.resources;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.globalhitss.desafiorpg.domain.Dado;
import com.globalhitss.desafiorpg.domain.Personagem;
import com.globalhitss.desafiorpg.services.JogoService;
import com.globalhitss.desafiorpg.services.PersonagemService;

/**
 * @author daniellefag
 *
 */
@RestController
@RequestMapping(value="/jogo")
public class JogoResources {
	
	@Autowired
	private PersonagemService service;
	
	@Autowired
	private  JogoService jogoservice;


	
	@RequestMapping(method = RequestMethod.GET)
	public String iniciarJogo (Personagem jogador1, Personagem jogador2) {
		Personagem jog01 = service.buscar(jogador1.getId());
		Personagem jog02 = service.buscar(jogador2.getId());
		Dado dado = new Dado();
		jogoservice.iniciarJogo(jog01, jog02, dado);
		
		return null;
		
	}
}
