package com.example.springboot;

import com.example.springboot.entities.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {

		Customer cd = new Customer();
		cd.getAddress();

		SpringApplication.run(SpringbootApplication.class, args);
	}



}
