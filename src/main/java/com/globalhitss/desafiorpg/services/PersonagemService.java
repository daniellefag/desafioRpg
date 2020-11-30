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
		Optional<Personagem> perso = repository.findById(id);
		if(perso == null) {
			throw new ObjectNotFoundException("Registro não encontrado! Id: " + id + ", Tipo: " + Personagem.class.getName());
		}
		return perso.orElse(null);
	}

}
