package com.gapsi.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gapsi.ecommerce.model.Version;
import com.gapsi.ecommerce.repository.VersionRepository;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/version")
public class VersionController {

	/**
	 * Patrón: DI ( Inyección de dependencias ). Se utiliza para que los objetos
	 * necesarios, en este caso VersionRepository sea inyectado automáticamente por
	 * Spring.
	 * 
	 */
	private final VersionRepository versionRepository;

	public VersionController(VersionRepository versionRepository) {
		this.versionRepository = versionRepository;
	}

	@Operation(summary = "Obtener versión", description = "Devuelve la versión desplegada del sitio eCommerce.")
	@GetMapping
	public Version obtenerVersion() {
		return versionRepository.findById(1L).orElse(null);
	}
}
