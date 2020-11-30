/**
 * 
 */
package com.globalhitss.desafiorpg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globalhitss.desafiorpg.domain.TiposArmas;

/**
 * @author daniellefag
 * Camada de acesso a dados referentes a tipos de armas
 */
@Repository
public interface TipoArmasRepository extends JpaRepository<TiposArmas, Integer> {

}
