package com.globalhitss.desafiorpg.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.globalhitss.desafiorpg.domain.Personagem;
import com.globalhitss.desafiorpg.services.PersonagemService;

/**
 * @author daniellefag
 *
 */

@RestController
@RequestMapping(value = "/personagem")
public class PersonagemResources {

	@Autowired
	private PersonagemService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> listarPersonagem(@PathVariable Integer id) {

		Personagem obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);

	}
	
	
	@RequestMapping(value="/listarpersonagens" )
	public ResponseEntity<?> listarTodos() {

		List <Personagem > obj = service.findList();
		return ResponseEntity.ok().body(obj);

	}
	
	
}
