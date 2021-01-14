
public class UsineAutomobile extends Usine {

	public UsineAutomobile(String nom, int nbEmployes, String typeSociete) {
		super(nom, nbEmployes, typeSociete);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object creerVehiculeEssence() {
		return new AutomobileEssence();
	}

	@Override
	public Object creerVehiculeElectrique() {
		return new AutomobileElectrique();
	}

}
