package it.epicode.pizza.model;

import it.epicode.pizza.interfaces.Pizza;

public class PizzaFamilySize  implements Pizza{
	private Pizza pizza;
	private Double calories = 1.95;
	private Double price = 4.15;

	public PizzaFamilySize(Pizza pizza) {
		this.pizza = pizza;
		this.calories = this.getPizza().getCalories() *1.5;
		this.price = this.getPizza().getPrice() + 3.2;
	}

	@Override
	public String getName() {
		return this.getPizza().getName() + " - " + "Family size";
	}

	@Override
	public Double getPrice() {
		return this.getPizza().getPrice() + price;
	}

	@Override
	public Double getCalories() {
		return this.getPizza().getCalories() * calories;
	}

	@Override
	public String getMenuItemLine() {
		return this.pizza.getName()+ " Family size" + " - Calories: x" + this.calories + " - Price: " + price;
	}

	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

}
