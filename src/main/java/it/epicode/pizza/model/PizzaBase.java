package it.epicode.pizza.model;

import it.epicode.pizza.interfaces.Pizza;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@AllArgsConstructor
public class PizzaBase implements Pizza{

	private final String name;
	private final Double price;
	private final Double calories;

	public String getMenuItemLine() {
		return this.name + " - calories: " + calories + " - price: " + price;	
	}

}
