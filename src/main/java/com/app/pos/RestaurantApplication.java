package com.app.pos;

import com.app.pos.entity.Cliente;
import com.app.pos.repository.ClienteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestaurantApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantApplication.class, args);
	}

//	@Bean
//	CommandLineRunner run(ClienteRepository clienteRepository) {
//		return args -> {
//			clienteRepository.save(new Cliente(null, "Alfredo", "Luna Martínez", "Luna 29, Villas del Campo, Puebla", "5545892378"));
//			clienteRepository.save(new Cliente(null, "Lourdes Sofia", "Madero Tapia", "Violetas 68, Villas del Campo, Puebla", "5569781238"));
//			clienteRepository.save(new Cliente(null, "Maria", "Clemente Sánchez", "Hinojos 34, Villas del Campo, Puebla", "5578129645"));
//			clienteRepository.save(new Cliente(null, "Daniel", "Hernández Montero", "Bambu 1559, Villas del Campo, Puebla", "5554659543"));
//		};
//	}

}
