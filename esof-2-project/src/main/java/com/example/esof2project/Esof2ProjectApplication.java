package com.example.esof2project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Esof2ProjectApplication {
	@RequestMapping("/")
	public String home() {
		return "Primeiro teste com Docker";
	}

	public static void main(String[] args) {
		SpringApplication.run(Esof2ProjectApplication.class, args);
	}

}