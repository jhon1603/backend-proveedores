/**
 * Patrón Repository.
 * 
 * Encargado única y exclusivamente de la comunicación con la BD H2. Se definen interfaces para dejar que Spring Data JPA, se
 * encargue de las operaciones con la BD.
 */
package com.gapsi.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gapsi.ecommerce.model.Version;

public interface VersionRepository extends JpaRepository<Version, Long> {
}
