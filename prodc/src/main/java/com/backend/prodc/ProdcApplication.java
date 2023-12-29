package com.backend.prodc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.backend.prodc" })
public class ProdcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdcApplication.class, args);
	}

}
