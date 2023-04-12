package it.epicode.pizza.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.epicode.pizza.enums.StatoTavolo;
import it.epicode.pizza.interfaces.MenuItem;
import it.epicode.pizza.model.Bevanda;
import it.epicode.pizza.model.subclasses.Pizza4Formaggi;
import it.epicode.pizza.model.subclasses.PizzaAmericana;
import it.epicode.pizza.model.subclasses.PizzaMargherita;
import it.epicode.pizza.ordini.Ordine;
import it.epicode.pizza.ordini.Tavolo;

@Configuration
public class OrdineConfig {
//	@Bean
//	public Ordine ordine() {
//		
//		Ordine ordine = new Ordine(listaOrdine1(),tavolo(1,5,StatoTavolo.OCCUPATO));
//		
//		return ordine;
//	}
//	@Bean List<MenuItem> listaOrdine1(){
//		List<MenuItem> nuova = new ArrayList<MenuItem>();
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MenuConfig.class);
//		
//		nuova.add((PizzaMargherita)ctx.getBean("pizzaMargherita"));
//		nuova.add((Pizza4Formaggi)ctx.getBean("pizza4Formaggi"));
//		nuova.add((PizzaAmericana)ctx.getBean("pizzaAmericana"));
//		nuova.add((Bevanda)ctx.getBean("drinkCola"));
//		nuova.add((Bevanda)ctx.getBean("drinkCola"));
//		nuova.add((Bevanda)ctx.getBean("drinkCola"));
//		ctx.close();
//		 return nuova;
//	}
//	@Bean Tavolo tavolo(int id,int n_cop,StatoTavolo t) {
//		return new Tavolo(id,n_cop,t);
//	}

}
