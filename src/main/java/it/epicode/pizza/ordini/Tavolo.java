package it.epicode.pizza.ordini;

import it.epicode.pizza.enums.StatoTavolo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tavolo {
private int n_tavolo;
private int n_coperti;
private StatoTavolo statoTavolo;
}
