package com.carService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.carService.model, com.carService.service"})
public class CarDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarDatabaseApplication.class, args);
	}

}
