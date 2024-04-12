package com.infnet.catalogofilmes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("com.infnet.catalogofilmes")
public class CatalogoFilmesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogoFilmesApplication.class, args);
	}

}
