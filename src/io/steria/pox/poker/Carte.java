package io.steria.pox.poker;

public class Carte {
	
	int valeur;
	Couleur couleur;
	
	public Carte(int valeur, Couleur couleur) {
		this.valeur = valeur;
		this.couleur = couleur;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	public Couleur getCouleur() {
		return couleur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return this.valeur +" " + couleur.toString();
				
	}
	
	

	
}
