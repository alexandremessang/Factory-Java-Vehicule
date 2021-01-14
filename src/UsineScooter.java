
public class UsineScooter extends Usine {

	public UsineScooter(String nom, int nbEmployes, String typeSociete) {
		super(nom, nbEmployes, typeSociete);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object creerVehiculeEssence() {
		return new ScooterEssence();
	}

	@Override
	public Object creerVehiculeElectrique() {
		return new ScooterElectrique();
	}

}
