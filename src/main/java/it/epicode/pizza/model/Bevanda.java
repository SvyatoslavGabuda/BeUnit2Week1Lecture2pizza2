package it.epicode.pizza.model;

import it.epicode.pizza.interfaces.FoodItem;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Bevanda implements FoodItem{
	private String name;
	private Double price;
	private Double calories;
	
	public String getMenuItemLine() {
		return this.name + " - calories: " + calories + " - price: " + price;	
	}

}
