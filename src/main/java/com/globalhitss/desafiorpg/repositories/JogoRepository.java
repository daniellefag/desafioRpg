package com.globalhitss.desafiorpg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globalhitss.desafiorpg.domain.TipoArma;

/**
 * @author daniellefag
 * Camada de acesso a dados referentes ao jogo
 */
@Repository
public interface JogoRepository extends JpaRepository<TipoArma, Integer> {

}
