/**
 * 
 */
package com.globalhitss.desafiorpg.services;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.globalhitss.desafiorpg.domain.Dado;
import com.globalhitss.desafiorpg.domain.Personagem;




/**
 * @author daniellefag
 * camada de acesso a serviços
 */
@Service
public class JogoService {
	

	
	@Autowired
	private PersonagemService personagemService;
	
	public Personagem calcularIniciativa(Integer personagem01, Integer personagem02) {

		Personagem jogador01 = personagemService.buscar(personagem01);
		Personagem jogador02 = personagemService.buscar(personagem02);

		Personagem personagemComIniciativa = null;

		int resultadoJogador1 = 0;
		int resultadoJogador2 = 0;

		while (resultadoJogador1 == resultadoJogador2) {
			resultadoJogador1 = jogador01.getAgilidadePersonagem() + Dado.jogarDado(20);
			resultadoJogador2 = jogador02.getAgilidadePersonagem() + Dado.jogarDado(20);

			if (resultadoJogador1 > resultadoJogador2) {
				personagemComIniciativa = jogador01;
			} else if (resultadoJogador2 > resultadoJogador1) {
				personagemComIniciativa = jogador02;
			}
		}

		return personagemComIniciativa;
	}

	public Personagem realizarAtaque(Integer personagemAtaque, Integer personagemDefesa) {

		Personagem jogador01 = personagemService.buscar(personagemAtaque);
		Personagem jogador02 = personagemService.buscar(personagemDefesa);

		Personagem vencedor = null;

		int resultadoAtaque = 0;
		int resultadoDefesa = 0;

		while (resultadoAtaque == resultadoDefesa) {
			resultadoAtaque = jogador01.getAgilidadePersonagem() + jogador01.getArma().getAtaqueArma()
					+ Dado.jogarDado(20);
			resultadoDefesa = jogador02.getAgilidadePersonagem() + jogador02.getArma().getAtaqueArma()
					+ Dado.jogarDado(20);

			if (resultadoAtaque > resultadoDefesa) {
				vencedor = jogador01;
			} else if (resultadoDefesa > resultadoAtaque) {
				vencedor = jogador02;

			}
		}
		return vencedor;

	}
	
	public Personagem calcularDano(Integer personagemAtaque, Integer personagemDefesa) {
		Personagem ataque = personagemService.buscar(personagemAtaque);
		Personagem defesa = personagemService.buscar(personagemDefesa);

		int totalPontosVidaAtaque = ataque.getPontosVida();
		int totalPontosVidaDefesa = 0;

//		if (totalPontosVidaDefesa = defesa.getPontosVida() > 0) {
//			int ataqueJog01 = ataque.getForcaPersonagem() + Dado.jogarDado(ataque.getArma().getFacesDado());
//			int valorAtaqueJog01 = ataqueJog01 - totalPontosVidaAtaque;
//		}


		int ataqueJog02 = defesa.getForcaPersonagem() + Dado.jogarDado(defesa.getArma().getFacesDado());
		int valorAtaqueJog02 = ataqueJog02 - totalPontosVidaDefesa;

		return null;
	}
}
