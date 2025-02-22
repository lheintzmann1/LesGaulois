package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix;
		Gaulois obelix;
		Druide panoramix;
		Romain minus;
		Romain brutus;
		
		asterix = new Gaulois("Asterix", 8);
		obelix = new Gaulois("Obélix", 16);
		panoramix = new Druide("Panoramix", 2);
		minus = new Romain("Minus", 6);
		brutus = new Romain("Brutus", 14);
		
		asterix.parler("Bonjour Obélix.");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?)");
		asterix.parler("Oui très bonne idée.");
		System.out.println("Dans la forêt " + asterix.getNom() + " et " + obelix.getNom() + " tombe nez à nez sur le romain " + minus.getNom() + ".");
		for (int i = 0; i < 3; i++) {
			asterix.frapper(minus);
		}
		
		panoramix.fabriquerPotion(4, 3);
		panoramix.booster(obelix);
		panoramix.booster(asterix);

		for (int i = 0; i < 3; i++) {
			asterix.frapper(brutus);
		}
		

	}
}

