package com.gapsi.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.gapsi.ecommerce.model.Proveedor;
import com.gapsi.ecommerce.repository.ProveedorRepository;

@Service
public class ProveedorService {

	@Autowired
	private ProveedorRepository proveedorRepository;

	public Page<Proveedor> obtenerProveedores(Pageable pageable) {
//		return proveedorRepository.findAll(pageable); // Obtiene todos los proveedores, sin importar si estan Activos o Inactivos.
		return proveedorRepository.findByActivoTrue(pageable);
	}

	public Proveedor guardarProveedor(Proveedor proveedor) {
		if (proveedorRepository.existsByNombreIgnoreCase(proveedor.getNombre())) {
			throw new IllegalArgumentException("ERROR:: Proveedor existente.");
		}
		proveedor.setActivo(true);

		return proveedorRepository.save(proveedor);
	}

	public void eliminarProveedor(Long id) {
		Proveedor proveedor = proveedorRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("ERROR:: Proveedor con ID " + id + " inexistente."));
		proveedor.setActivo(false);

		proveedorRepository.save(proveedor);
	}
}
