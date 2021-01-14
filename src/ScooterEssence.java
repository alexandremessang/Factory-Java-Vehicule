
public class ScooterEssence extends Scooter {

	public ScooterEssence(int nbRoues, int volume, String marque) {
		super(nbRoues, volume, marque);
		// TODO Auto-generated constructor stub
	}
	
	public ScooterEssence() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void remplir() {
		System.out.println("Rempli le réservoir d'essence");

	}

}
