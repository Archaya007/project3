package com.example.sp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class Sp2Application {

	public static void main(String[] args) {
		SpringApplication.run(Sp2Application.class, args);
	}

}
 