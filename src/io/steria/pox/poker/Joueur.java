package io.steria.pox.poker;

import java.util.ArrayList;
import java.util.List;

public class Joueur {

	List<Carte> mains = new ArrayList<>();
	FabriqueDeck deck = new FabriqueDeck();

	public void prendCarte(Carte carte) {
		mains.add(carte);
	}

	public Carte donneCarte(Carte carteJouee) {
		// Carte carteJouee = new Carte(carteJouee.valeur, carteJouee.couleur);
		mains.remove(carteJouee);
		return carteJouee;
	}

	@Override
	public String toString() {
		return "Joueur [mains=" + mains + "]";
	}

}
