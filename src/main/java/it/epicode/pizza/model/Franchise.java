package it.epicode.pizza.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Franchise {
	private String name;
	private Double price;
	
	public String getMenuItemLine() {
		return this.name + " - price: " + price;	
	}

}
