package com.vicenteportfilo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan( basePackages = "com.vicenteportfilo.domains")
@ComponentScan( basePackages = {"com.*"})
public class PortifolioSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortifolioSpringBootApplication.class, args);
	}

}
