package com.example.datarest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.datarest")
public class DataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataRestApplication.class, args);
	}

}
