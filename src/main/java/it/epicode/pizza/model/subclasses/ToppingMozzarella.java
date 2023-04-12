package it.epicode.pizza.model.subclasses;


import it.epicode.pizza.interfaces.Pizza;
import it.epicode.pizza.model.PizzaTopping;

public class ToppingMozzarella extends PizzaTopping{
	public ToppingMozzarella(Pizza pizza) {
		super(pizza,"Mozzarella", 0.69, 92d);
	}
}
