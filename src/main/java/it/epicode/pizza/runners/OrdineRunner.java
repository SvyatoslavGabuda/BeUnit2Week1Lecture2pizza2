package it.epicode.pizza.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import it.epicode.pizza.config.MenuConfig;
import it.epicode.pizza.ordini.Ordine;

@Component
public class OrdineRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ordine runner ");
		stampaOrdine();

	}

	public void stampaOrdine() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MenuConfig.class);
		Ordine primoOrdine = (Ordine) ctx.getBean("ordine");
		System.out.println("ORDINE:");
		primoOrdine.getOrdine().forEach(p -> System.out.println(p.getMenuItemLine()));
		System.out.println("IMPORTO TOTALE: " + primoOrdine.getImporto_tot());
		System.out.println("---------------------------------------");
	}
}
