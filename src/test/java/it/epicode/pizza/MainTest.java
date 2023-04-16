package it.epicode.pizza;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.epicode.pizza.enums.StatoTavolo;
import it.epicode.pizza.model.subclasses.Pizza4Formaggi;
import it.epicode.pizza.ordini.Ordine;
import it.epicode.pizza.ordini.Tavolo;

class MainTest {
	private Ordine testOrdine;
	@BeforeEach
	public void setUp() {
		Tavolo t = new Tavolo(4,4,StatoTavolo.LIBERO);
		testOrdine = new Ordine();
	}

	@Test
	void test() {
		Pizza4Formaggi p = new Pizza4Formaggi();
		assertEquals(600.5, p.getCalories());
	}

}
