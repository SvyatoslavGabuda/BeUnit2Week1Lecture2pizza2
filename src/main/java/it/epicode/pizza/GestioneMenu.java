package it.epicode.pizza;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.epicode.pizza.config.MenuConfig;
import it.epicode.pizza.model.Menu;
import it.epicode.pizza.model.PizzaFamilySize;
import it.epicode.pizza.model.subclasses.PizzaMargherita;
import it.epicode.pizza.model.subclasses.ToppingMozzarella;



public class GestioneMenu {
	private Menu menu;
	private AnnotationConfigApplicationContext ctx;

	public GestioneMenu() {
		ctx = new AnnotationConfigApplicationContext(MenuConfig.class);
		menu = (Menu) ctx.getBean("menu");

	}

	public void stampaMenu() {
		System.out.println("******* Menu *******");
		System.out.println("PIZZA");
		menu.getMenuPizza().forEach(p -> System.out.println(p.getMenuItemLine()));
		System.out.println();

		System.out.println("DRINK");
		menu.getMenuDrink().forEach(p -> System.out.println(p.getMenuItemLine()));

		System.out.println();

		System.out.println("FRANCHISE");
		menu.getMenuFranchise().forEach(p -> System.out.println(p.getMenuItemLine()));
		System.out.println();

	}

	public void testTopping() {
		

		PizzaMargherita pizza = ctx.getBean(PizzaMargherita.class);
		
		
		ToppingMozzarella topping1 = new ToppingMozzarella(pizza);

		System.out.println(topping1.getName());
		
		ToppingMozzarella topping2 = new ToppingMozzarella(topping1);

		System.out.println(topping2.getName());
		
		PizzaFamilySize toppingBig = new PizzaFamilySize(topping2);
		System.out.println(toppingBig.getMenuItemLine());
		System.out.println(toppingBig.getName());
		System.out.println(toppingBig.getPrice());


		
	}

}
