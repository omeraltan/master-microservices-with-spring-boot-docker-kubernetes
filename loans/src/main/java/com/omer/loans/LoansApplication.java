package com.omer.loans;

import com.omer.loans.dto.LoansContactInfoDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {LoansContactInfoDto.class})
@OpenAPIDefinition(
	info = @Info(
		title = "Loans microservice REST API Documentation",
		description = "Bank Loans microservice REST API Documentation",
		version = "v1",
		contact = @Contact(
			name = "Ömer ALTAN",
			email = "omeraltan66@gmail.com",
			url= "https://github.com/omeraltan"
		),
		license = @License(
			name = "Apache 2.0",
			url = "https://github.com/omeraltan"
		)
	),
	externalDocs = @ExternalDocumentation(
			description = "Bank Loans microservice REST API Documentation",
			url = "https://www.examplebank.com/swagger-ui.html"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}
}
