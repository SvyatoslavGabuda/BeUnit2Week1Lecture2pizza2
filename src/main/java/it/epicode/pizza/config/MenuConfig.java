package it.epicode.pizza.config;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.epicode.pizza.enums.StatoTavolo;
import it.epicode.pizza.interfaces.MenuItem;
import it.epicode.pizza.model.Bevanda;
import it.epicode.pizza.model.Franchise;
import it.epicode.pizza.model.Menu;
import it.epicode.pizza.model.subclasses.BevandaCola;
import it.epicode.pizza.model.subclasses.BevandaSprite;
import it.epicode.pizza.model.subclasses.FranchisePortaChiavi;
import it.epicode.pizza.model.subclasses.Pizza4Formaggi;
import it.epicode.pizza.model.subclasses.PizzaAmericana;
import it.epicode.pizza.model.subclasses.PizzaDiavola;
import it.epicode.pizza.model.subclasses.PizzaHawaiiana;
import it.epicode.pizza.model.subclasses.PizzaMargherita;
import it.epicode.pizza.model.subclasses.ToppingMozzarella;
import it.epicode.pizza.model.subclasses.ToppingPatatine;
import it.epicode.pizza.ordini.Ordine;
import it.epicode.pizza.ordini.Tavolo;


@Configuration
public class MenuConfig {
	@Bean
	public Ordine ordine() {
		
		Ordine ordine = new Ordine(listaOrdine1(),tavolo(1,5,StatoTavolo.OCCUPATO));
		
		return ordine;
	}
	@Bean List<MenuItem> listaOrdine1(){
		List<MenuItem> nuova = new ArrayList<MenuItem>();
		nuova.add(pizza4Formaggi());
		nuova.add(pizzaSalami());
		nuova.add(pizza4Formaggi());
		nuova.add(drinkCola());
		nuova.add(drinkCola());
		nuova.add(drinkCola());
		nuova.add(pizza4FormPat());
		 return nuova;
	}
	@Bean Tavolo tavolo(int id,int n_cop,StatoTavolo t) {
		return new Tavolo(id,n_cop,t);
	}
	@Bean
	public Menu menu() {

		Menu menu = new Menu();

		menu.getMenuPizza().add(pizzaMargherita());
		menu.getMenuPizza().add(pizzaHawaiian());
		menu.getMenuPizza().add(pizzaSalami());
		menu.getMenuPizza().add(pizza4Formaggi());
		menu.getMenuPizza().add(pizzaAmericana());

		menu.getMenuTopping().add(new ToppingMozzarella(pizzaSalami()));
		menu.getMenuTopping().add(new ToppingPatatine(pizzaHawaiian()));


		menu.getMenuDrink().add(drinkCola());
		menu.getMenuDrink().add(drinkSprite());
		menu.getMenuDrink().add(drinkGenerico("Fanta", 2.0, 150.0));
		
		menu.getMenuFranchise().add(franchisePortaChiavi());
		

		return menu;

	}
	@Bean
	public ToppingPatatine pizza4FormPat() {
		
		return new ToppingPatatine(pizza4Formaggi());
	}

	@Bean
	public PizzaMargherita pizzaMargherita() {
		return new PizzaMargherita();
	}
	@Bean
	public Pizza4Formaggi pizza4Formaggi() {
		return new Pizza4Formaggi();
	}
	@Bean
	public PizzaAmericana pizzaAmericana() {
		return new PizzaAmericana();
	}

	@Bean
	public PizzaHawaiiana pizzaHawaiian() {
		return new PizzaHawaiiana();
	}

	@Bean
	public PizzaDiavola pizzaSalami() {
		return new PizzaDiavola();
	}

	@Bean
	public Bevanda drinkCola() {
		return new BevandaCola();
	}
	@Bean
	public Bevanda drinkGenerico(String nome,Double prezzo,Double calorie) {
		return new Bevanda(nome,prezzo,calorie);
	}
	
	@Bean
	public Bevanda drinkSprite() {
		return new BevandaSprite();
	}
	
	@Bean
	public Franchise franchisePortaChiavi() {
		return new FranchisePortaChiavi();
	}
}
