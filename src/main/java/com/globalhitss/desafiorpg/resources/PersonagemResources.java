/**
 * 
 */
package com.globalhitss.desafiorpg.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.globalhitss.desafiorpg.domain.Personagem;

/**
 * @author daniellefag
 *
 */
@RestController
@RequestMapping(value="/personagens")
public class PersonagemResources {

	@RequestMapping(method=RequestMethod.GET)
	public List<Personagem> listar() {
		
		Personagem p1 = new Personagem(1, "Orc", null, null, null, null, null, null);
		Personagem p2 = new Personagem(2, "Humano", null, null, null, null, null, null);
		
		List<Personagem> listaPersonagem = new ArrayList<>();
		listaPersonagem.add(p1);
		listaPersonagem.add(p2);
		
		
		return listaPersonagem;
	}
}
