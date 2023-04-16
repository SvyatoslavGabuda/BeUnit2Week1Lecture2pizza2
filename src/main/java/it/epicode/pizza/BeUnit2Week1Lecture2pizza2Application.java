package it.epicode.pizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import lombok.extern.slf4j.Slf4j;


@Slf4j
@SpringBootApplication
public class BeUnit2Week1Lecture2pizza2Application {

	public static void main(String[] args) {
		SpringApplication.run(BeUnit2Week1Lecture2pizza2Application.class, args);
		log.warn("ciao mondo");
		GestioneMenu stampa = new GestioneMenu();
		stampa.stampaMenu();
		stampa.testTopping();
		
	}

}
