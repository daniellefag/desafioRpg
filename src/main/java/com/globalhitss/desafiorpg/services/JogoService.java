/**
 * 
 */
package com.globalhitss.desafiorpg.services;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.globalhitss.desafiorpg.domain.Dado;
import com.globalhitss.desafiorpg.domain.Personagem;
import com.globalhitss.desafiorpg.repositories.JogoRepository;



/**
 * @author daniellefag
 * camada de acesso a serviços
 */
@Service
public class JogoService {
	
	@Autowired
	private JogoRepository repository;
	
	public String iniciarJogo(Personagem jogador1, Personagem jogador2, Dado dado) {
        Integer resultadoJogador1 = jogador1.getAgilidadePersonagem() + dado.getNumero();
        Integer resultadoJogador2 = jogador2.getAgilidadePersonagem() + dado.getNumero();
        
        if(resultadoJogador1 == resultadoJogador2) {
        	return "Empate! Rolar o dado novamente.";
        } else if (resultadoJogador1 > resultadoJogador2) {
        	return "Jogador 1 inicia o jogo!";
        }else {
        	return "Jogador 2 inicia o jogo!";
        }
  
	}

	public String atacarAdversario(Personagem personagemAtaque, Personagem
			personagemDefesa, Dado dado) {
        Integer ataque = personagemAtaque.getAgilidadePersonagem() + personagemAtaque.getArma().getAtaqueArma() + dado.getNumero();
        Integer defesa = personagemDefesa.getAgilidadePersonagem() + personagemAtaque.getArma().getDefesaArma() +  dado.getNumero();
        
        if(ataque == defesa) {
        	return "Empate!";
        } else if(ataque > defesa) {
        	return "Personagem ataque venceu!";
        } else {
        	return "Personagem defesa venceu!";
        }
        		

	}
	
	public Integer calcularDano(Integer idpersonagem1, Integer idpersonagem2) {
//		Optional<Personagem> p1 = repository.findById(id);
		return 0;
	}
}
