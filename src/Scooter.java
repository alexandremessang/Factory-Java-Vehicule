
public abstract class Scooter {
	
	private int nbRoues;
	private int volume;
	private String marque;

	public Scooter(int nbRoues, int volume, String marque) {
		this.nbRoues = nbRoues;
		this.volume = volume;
		this.marque = marque;
	}
	
	public Scooter() {
		
	}
	
	// Affiche le type de remplissage
		public abstract void remplir();

	public int getNbRoues() {
		return nbRoues;
	}

	public void setNbRoues(int nbRoues) {
		this.nbRoues = nbRoues;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

}
