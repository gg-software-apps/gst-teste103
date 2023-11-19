package br.com.astra.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
	  @Bean
	    public GroupedOpenApi controllerApi() {
	        return GroupedOpenApi.builder()
	                .group("V1")
	                .packagesToScan("br.com.astra.controller")
	                .build();
	    }
}