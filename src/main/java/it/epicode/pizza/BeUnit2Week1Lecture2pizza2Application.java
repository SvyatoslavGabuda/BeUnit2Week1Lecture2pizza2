package it.epicode.pizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class BeUnit2Week1Lecture2pizza2Application {

	public static void main(String[] args) {
		SpringApplication.run(BeUnit2Week1Lecture2pizza2Application.class, args);
		
		GestioneMenu stampa = new GestioneMenu();
		stampa.stampaMenu();
		stampa.testTopping();
		
	}

}
