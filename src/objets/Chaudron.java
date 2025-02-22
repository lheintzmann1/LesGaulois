package objets;

public class Chaudron {
	private int quantite;
	private int forcePotion;

	public boolean resterPotion() {
		return quantite > 0;
	}

	public void remplirChaudron(int quantite, int forcePotion) {
		this.quantite = quantite;
		this.forcePotion = forcePotion;
	}

	public int prendreLouche() {
		this.quantite--;
		return forcePotion;
	}

}
