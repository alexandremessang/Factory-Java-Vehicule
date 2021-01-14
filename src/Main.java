
public class Main {

	public static void main(String[] args) {
		System.out.println("******************AUTOMOBILE******************");
		Usine usineAuto = new UsineAutomobile("autoCrea", 5, "SAS");
		Automobile auto = (AutomobileElectrique) usineAuto.creerVehiculeElectrique();
		auto.remplir();
		auto = (AutomobileEssence) usineAuto.creerVehiculeEssence();
		auto.remplir();
		System.out.println("**********************************************");
		
		System.out.println("******************SCOOTER*********************");
		Usine usineScooter = new UsineScooter("DébriScoot", 10, "Ecran");
		Scooter scoot = (ScooterEssence) usineScooter.creerVehiculeEssence();
		scoot.remplir();
		scoot = (ScooterElectrique) usineScooter.creerVehiculeElectrique();
		scoot.remplir();
		System.out.println("**********************************************");
	}

}
