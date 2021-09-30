package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSoapServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapServiceApplication.class, args);
	}

	// WSDL URL : http://localhost:8080/ws/countries.wsdl

}
