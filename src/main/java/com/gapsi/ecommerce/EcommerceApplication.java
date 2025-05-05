package com.gapsi.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Patrón: DI ( Inyección de dependencias ). Se utiliza para que los objetos
 * necesarios, en este caso VersionRepository sea inyectado automáticamente por
 * Spring.
 * 
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.gapsi.ecommerce")
@EntityScan(basePackages = "com.gapsi.ecommerce.model")
@EnableJpaRepositories(basePackages = "com.gapsi.ecommerce.repository")
public class EcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

}
