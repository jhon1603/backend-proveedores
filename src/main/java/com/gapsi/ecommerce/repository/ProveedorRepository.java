package com.gapsi.ecommerce.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.gapsi.ecommerce.model.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {

	boolean existsByNombreIgnoreCase(String nombre);
	Page<Proveedor> findByActivoTrue(Pageable pageable);
}
