package Mediator;

public class Application {

	public static void main(String[] args) {
		MediatorInf mediator = new MediatorImplement();
		Reseau u1 = new ReseauImp(1, "Mehdi", mediator);
		Reseau u2 = new ReseauImp(2, "Soufiane", mediator);
		Reseau u3 = new ReseauImp(3, "AMINE", mediator);
		
		mediator.ajouterUser(u1);
		mediator.ajouterUser(u2);
		mediator.ajouterUser(u3);
		
		u3.envMsg("hi");
		
	}
}
