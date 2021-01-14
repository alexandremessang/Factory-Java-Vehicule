
public class AutomobileEssence extends Automobile {
	
	private boolean automatique;
	
	/*public AutomobileEssence(int nbChevaux, String marque, int nbPlaces, String pneus, int nbVitesses, boolean automatique) {
		super(nbChevaux, marque, nbPlaces, pneus, nbVitesses);
		this.automatique = automatique;
	}*/

	public AutomobileEssence() {
	}

	@Override
	public void remplir() {
		System.out.println("Rempli le réservoir d'essence");

	}

}
