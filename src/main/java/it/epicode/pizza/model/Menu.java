package it.epicode.pizza.model;

import java.util.ArrayList;
import java.util.List;

import it.epicode.pizza.interfaces.Pizza;
import lombok.Getter;


@Getter
public class Menu {
	private final List<Pizza> menuPizza = new ArrayList<>();
	private final List<PizzaTopping> menuTopping = new ArrayList<>();
	private final List<Bevanda> menuDrink = new ArrayList<>();
	private final List<Franchise> menuFranchise = new ArrayList<>();

}
