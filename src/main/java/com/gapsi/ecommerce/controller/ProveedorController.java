package com.gapsi.ecommerce.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gapsi.ecommerce.model.Proveedor;
import com.gapsi.ecommerce.service.ProveedorService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/proveedores")
public class ProveedorController {

	private final ProveedorService proveedorService;

	public ProveedorController(ProveedorService proveedorService) {
		this.proveedorService = proveedorService;
	}

	@Operation(summary = "Obtener proveedores paginados", description = "Devuelve una lista paginada de proveedores activos.")
	@GetMapping
	public Page<Proveedor> listarProveedores(Pageable pageable) {
		return proveedorService.obtenerProveedores(pageable);
	}

	@Operation(summary = "Insertar proveedores", description = "Agrega un proveedor con estatus activo dentro de la BD.")
	@PostMapping
	public ResponseEntity<?> agregarProveedor(@RequestBody Proveedor proveedor) {
		try {
			Proveedor guardado = proveedorService.guardarProveedor(proveedor);

			return ResponseEntity.ok(guardado);
		} catch (IllegalArgumentException ex) {
			return ResponseEntity.badRequest().body(ex.getMessage());
		}
	}

	@Operation(summary = "Eliminar proveedores", description = "Elimina un proveedor con estatus inactivo dentro de la BD.")
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminarProveedor(@PathVariable Long id) {
		try {
			proveedorService.eliminarProveedor(id);

			return ResponseEntity.noContent().build();
		} catch (IllegalArgumentException ex) {
			return ResponseEntity.notFound().build();
		}
	}
}
