package Mediator;

public class ReseauImp extends Reseau{


	public ReseauImp(int id, String nom, MediatorInf mediator) {
		super(id, nom, mediator);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void envMsg(String msg) {
		System.out.println(this.nom+" a envoye un message "+msg); 
		mediator.sendMsg(msg, this);
	}
	
	@Override
	public void recMsg(String msg) {
		System.out.println(this.nom +" a recu un message "+msg);
		
	}
	

}
