package it.epicode.pizza.ordini;

import java.util.Iterator;
import java.util.List;

import it.epicode.pizza.enums.StatoOrdine;
import it.epicode.pizza.interfaces.MenuItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ordine {
	private List<MenuItem> ordine;
	private Tavolo tavolo;
	private StatoOrdine statoOrdine;
	private Double importo_tot;

	public Ordine(List<MenuItem> ordine, Tavolo tavolo) {
		this.ordine = ordine;
		this.tavolo = tavolo;
		this.statoOrdine = StatoOrdine.IN_CORSO;

	this.importo_tot= calcolaImporto();

	}
	private Double calcolaImporto() {
		double tot= 0;
		for (int i = 0;i< this.ordine.size();i++) {
			tot = tot + this.ordine.get(i).getPrice();
			}
		tot = tot + (this.tavolo.getN_coperti()*2);
		return tot;
	}
}
