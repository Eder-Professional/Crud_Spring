package com.eder.crudspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.eder.crudspring.model.Product;
import com.eder.crudspring.repo.ProductRepo;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}
	
	@Bean
	CommandLineRunner initDatabase(ProductRepo productRepo){
		return args -> {
			productRepo.deleteAll();

			Product p = new Product();
			p.setName("Xbox 360");
			p.setCategory("eletronico");
			p.setPrice("R$2.500,00");
			
			productRepo.save(p);
		};
	}
}
