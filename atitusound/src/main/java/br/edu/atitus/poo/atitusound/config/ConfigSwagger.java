package br.edu.atitus.poo.atitusound.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class ConfigSwagger {

	@Bean
	public OpenAPI getOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("API AtituSound")
						.description("Documentação backend AtituSound")
						.version("Version 1.0.0")
						.contact(new Contact()
								.name("Desenvolvedor ABNER/ARIEL")
								.email("1134868@atitus.edu.br/1134433@atitus.edu.br.")));
	}
	
}
