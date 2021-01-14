
public abstract class Automobile {
	private int nbChevaux;
	private String marque;
	private int nbPlaces;
	private String pneus;
	private int nbVitesses;
	
	public Automobile() {}
	
	public Automobile(int nbChevaux, String marque, int nbPlaces, String pneus, int nbVitesses) {
		this.nbChevaux = nbChevaux;
		this.marque = marque;
		this.nbPlaces = nbPlaces;
		this.pneus = pneus;
		this.nbVitesses = nbVitesses;
	}
	
	public int getNbChevaux() {
		return nbChevaux;
	}

	public void setNbChevaux(int nbChevaux) {
		this.nbChevaux = nbChevaux;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getNbPlaces() {
		return nbPlaces;
	}

	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}

	public String getPneus() {
		return pneus;
	}

	public void setPneus(String pneus) {
		this.pneus = pneus;
	}

	public int getNbVitesses() {
		return nbVitesses;
	}

	public void setNbVitesses(int nbVitesses) {
		this.nbVitesses = nbVitesses;
	}

	// Affiche le type de remplissage
	public abstract void remplir();

}
