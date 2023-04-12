package it.epicode.pizza.model;

import it.epicode.pizza.interfaces.Pizza;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor
@Setter
@Getter
public class PizzaTopping implements Pizza{
	private Pizza pizza;
	private String name;
	private Double price;
	private Double calories;	
	
	@Override
	public String getName() {
		return this.pizza.getName() + " + " + this.name;
	}

	@Override
	public Double getPrice() {
		return this.pizza.getPrice() + this.price;
	}

	@Override
	public Double getCalories() {
		return this.pizza.getCalories() + this.calories;
	}
	
	public String getMenuItemLine() {
		return this.pizza.getName() + "aggiunta " + this.name + " - calories: " + (this.pizza.getCalories()+this.calories) + " - price: " + (this.pizza.getPrice()+this.price);	
	}
}
