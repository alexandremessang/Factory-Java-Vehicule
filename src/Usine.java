
public abstract class Usine {
	
	private String nom;
	private int nbEmployes;
	private String typeSociete;


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbEmployes() {
		return nbEmployes;
	}

	public void setNbEmployes(int nbEmployes) {
		this.nbEmployes = nbEmployes;
	}

	public String getTypeSociete() {
		return typeSociete;
	}

	public void setTypeSociete(String typeSociete) {
		this.typeSociete = typeSociete;
	}

	public Usine(String nom, int nbEmployes, String typeSociete) {
		this.nom = nom;
		this.nbEmployes = nbEmployes;
		this.typeSociete = typeSociete;
	}
	
	public abstract Object creerVehiculeEssence();
	public abstract Object creerVehiculeElectrique();

}
