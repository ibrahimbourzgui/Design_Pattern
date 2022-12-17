package Mediator;

public abstract class  Reseau {
	private int id;
	protected String nom;
	protected MediatorInf mediator;
	
	public Reseau() {
		super();
	}


	public Reseau(int id, String nom, MediatorInf mediator) {
		super();
		this.id = id;
		this.nom = nom;
		this.mediator = mediator;
	}


	public abstract void envMsg(String msg);
	
	public abstract void recMsg(String msg);
}
