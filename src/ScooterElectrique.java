
public class ScooterElectrique extends Scooter {

	public ScooterElectrique(int nbRoues, int volume, String marque) {
		super(nbRoues, volume, marque);
		// TODO Auto-generated constructor stub
	}
	
	public ScooterElectrique() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void remplir() {
		System.out.println("Recharge la batterie");
	}

}
