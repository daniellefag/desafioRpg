package com.globalhitss.desafiorpg;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.globalhitss.desafiorpg.domain.Personagem;
import com.globalhitss.desafiorpg.domain.TiposArmas;
import com.globalhitss.desafiorpg.repositories.PersonagemRepository;
import com.globalhitss.desafiorpg.repositories.TipoArmasRepository;

@SpringBootApplication
public class DesafiorpgApplication implements CommandLineRunner {

	@Autowired
	private PersonagemRepository personagemRepository;
	
	@Autowired
	private TipoArmasRepository tipoArmasRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DesafiorpgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		TiposArmas ta1 = new TiposArmas(null, "Espada Longa", 2, 1, 6);
		TiposArmas ta2 = new TiposArmas(null, "Clava de Madeira", 1, 0, 8);

		Personagem p1 = new Personagem(null, "Humano", 12, 1, 2, ta1);
		Personagem p2 = new Personagem(null, "Orc", 20, 2, 0, ta2);

		tipoArmasRepository.saveAll(Arrays.asList(ta1, ta2));
		personagemRepository.saveAll(Arrays.asList(p1, p2));
		
	}

}
