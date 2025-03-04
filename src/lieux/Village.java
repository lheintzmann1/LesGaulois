package lieux;

import personnages.Gaulois;

public class Village {
	private String nom;
	private Gaulois chef;
	private Gaulois villageois[];
	private int nbVillageois = 0;
	
	public Village(String nom, int NB_VILLAGEOIS_MAX) {
		this.nom = nom;
		this.villageois = new Gaulois[NB_VILLAGEOIS_MAX];
	}

	public void setChef(Gaulois chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterGaulois(Gaulois gaulois) {
		if (nbVillageois < villageois.length) {
			villageois[nbVillageois] = gaulois;
			nbVillageois ++;
		} else {
			System.out.println("Le village est plein.");
		}
	}
	
	public Gaulois trouverVillageois(int numVillageois) {
		if (villageois[numVillageois-1] != null) {
			return villageois[numVillageois-1];
		} else {
			System.out.println("Il n'y a pas autant d'habitants dans notre village !");
			return null;
		}
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village \"" + nom + "\" du chef " + chef.getNom() + " vivent les légendaires gaulois :");
		for (int i=0; i<nbVillageois; i++) {
			System.out.println("-" + trouverVillageois(i).getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
		// Gaulois gaulois = village.trouverHabitant(30);
		// renvoi "Il n'y a pas autant d'habitants dans notre village !"
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		village.setChef(abraracourcix);

		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterGaulois(asterix);

		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois.getNom());
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois.getNom());

		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterGaulois(obelix);
		
		village.afficherVillageois();
	}

}
