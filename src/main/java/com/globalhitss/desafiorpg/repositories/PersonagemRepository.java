package com.globalhitss.desafiorpg.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.globalhitss.desafiorpg.domain.Personagem;


/**
 * @author daniellefag
 *Camada de acesso a dados referentes ao personagem
 */

@Repository
public interface PersonagemRepository extends JpaRepository<Personagem, Integer> {



}
