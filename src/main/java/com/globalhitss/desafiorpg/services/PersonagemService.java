/**
 * 
 */
package com.globalhitss.desafiorpg.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.globalhitss.desafiorpg.domain.Personagem;
import com.globalhitss.desafiorpg.repositories.PersonagemRepository;
import com.globalhitss.desafiorpg.services.exceptions.ObjectNotFoundException;


/**
 * @author daniellefag
 * camada de acesso a serviços
 */
@Service
public class PersonagemService {
	
	@Autowired
	private PersonagemRepository repository;
	
	public Personagem buscar(Integer id) {
		Optional<Personagem> personagem = repository.findById(id);
		if(!personagem.isPresent()) {
			throw new ObjectNotFoundException("Personagem não encontrado! Id: " + id + ", Tipo: " + Personagem.class.getName());
		}
		return personagem.orElse(null);
	}

}
