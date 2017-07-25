package io.steria.pox.poker;

import java.util.Collections;
import java.util.List;

public class Partie {

	public static void main(String[] args) {
		
		FabriqueDeck deck = new FabriqueDeck();
		List<Carte> deckTotal52 = deck.generer52();
		
		FabriqueDeck deck2 = new FabriqueDeck();
		List<Carte> deckTotal32 =deck2.generer32();
		
		Collections.shuffle(deckTotal52);
		Collections.shuffle(deckTotal32);
		
		Joueur joueur1 = new Joueur();
		Joueur joueur2 = new Joueur();
		
		for (int i = 0 ; i < deckTotal52.size()/2; i++){
			joueur1.prendCarte(deckTotal52.get(i));			
		}
		System.out.println(joueur1);
		
		for (int i = 0 ; i > deckTotal52.size()/2; i--){
			joueur2.prendCarte(deckTotal52.get(i));			
		}
		System.out.println(joueur1);
		
		
	}
	
}
