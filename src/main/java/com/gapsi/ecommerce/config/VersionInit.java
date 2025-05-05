package com.gapsi.ecommerce.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gapsi.ecommerce.model.Version;
import com.gapsi.ecommerce.repository.VersionRepository;

@Configuration
public class VersionInit {

	@Bean
	CommandLineRunner init(VersionRepository versionRepository) {
		return args -> {
			versionRepository.save(new Version(1L, "v1.0.0 - Proyecto Base"));
		};
	}
}
