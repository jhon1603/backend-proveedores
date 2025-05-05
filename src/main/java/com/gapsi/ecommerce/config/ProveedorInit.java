package com.gapsi.ecommerce.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gapsi.ecommerce.model.Proveedor;
import com.gapsi.ecommerce.repository.ProveedorRepository;

@Configuration
public class ProveedorInit {

	@Bean
	CommandLineRunner initProveedores(ProveedorRepository repo) {
		return args -> {
			repo.save(new Proveedor("Proveedor Uno", "ABC1234567", "Calle 1"));
			repo.save(new Proveedor("Proveedor Dos", "DEF7654321", "Calle 2"));
			repo.save(new Proveedor("Proveedor Tres", "GHI9876543", "Calle 3"));
			repo.save(new Proveedor("Proveedor Cuatro", "GHI9876543", "Calle 4"));
			repo.save(new Proveedor("Proveedor Cinco", "GHI9876543", "Calle 5"));
			repo.save(new Proveedor("Proveedor Seis", "GHI9876543", "Calle 6"));
			repo.save(new Proveedor("Proveedor Siete", "GHI9876543", "Calle 7"));
			repo.save(new Proveedor("Proveedor Ocho", "GHI9876543", "Calle 8"));
			repo.save(new Proveedor("Proveedor Nueve", "GHI9876543", "Calle 9"));
			repo.save(new Proveedor("Proveedor Diez", "GHI9876543", "Calle 10"));
			repo.save(new Proveedor("Proveedor Once", "GHI9876543", "Calle 11"));
			repo.save(new Proveedor("Proveedor Doce", "GHI9876543", "Calle 12"));
			repo.save(new Proveedor("Proveedor Trece", "GHI9876543", "Calle 13"));
			repo.save(new Proveedor("Proveedor Catorce", "GHI9876543", "Calle 14"));
			repo.save(new Proveedor("Proveedor Quince", "GHI9876543", "Calle 15"));
			repo.save(new Proveedor("Proveedor Dieciseis", "GHI9876543", "Calle 16"));
			repo.save(new Proveedor("Proveedor Diecisiete", "GHI9876543", "Calle 17"));
			repo.save(new Proveedor("Proveedor Dieciocho", "GHI9876543", "Calle 18"));
			repo.save(new Proveedor("Proveedor Diecinueve", "GHI9876543", "Calle 19"));
			repo.save(new Proveedor("Proveedor Veinte", "GHI9876543", "Calle 20"));
		};
	}
}
