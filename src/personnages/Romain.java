package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force > 0 : "La force doit être supérieure à 0";
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
		return "Le Romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert forceCoup > 0 : "La force du coup doit être supérieure à 0";
		int oldforce = force;
		force -= forceCoup;
		if (force <= 0) {
			parler("J'abandonne !");
		} else {
			parler("Aïe");
		}
		assert force < oldforce : "La force n'a pas diminué";		
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
	}
	
}
