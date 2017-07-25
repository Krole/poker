package io.steria.pox.poker;

import java.util.ArrayList;
import java.util.List;

public class FabriqueDeck {

	public List<Carte> generer52() {
		List<Carte> listCartes52 = new ArrayList<>();

		for (Couleur couleur : Couleur.values()) {

			for (int j = 1; j <= 14; j++) {
				Carte carte = new Carte(j, couleur);
				listCartes52.add(carte);
			}
		}
		System.out.println(listCartes52);
		return listCartes52;
	}

	public List<Carte> generer32() {
		List<Carte> listCartes32 = new ArrayList<>();

		for (Couleur couleur : Couleur.values()) {

			for (int j = 7; j <= 14; j++) {
				Carte carte = new Carte(j, couleur);
				listCartes32.add(carte);
			}
		}
		System.out.println(listCartes32);
		return listCartes32;

	}

}
