package Proxy;

public class Proxy implements Sujet{

	CSujet cs;
	

	public Proxy() {
		cs = new CSujet();
	}

	@Override
	public void TransfertMessage(String message) {
		System.out.println("Proxy Controle de message");
		System.out.println("______________________");
		
		if(message.equals("youtube") || message.equals("facebook")) {
			System.out.println("Proxy : Message "+ message + " Bloque !");
			System.out.println("______________________");
		}
		else {
			System.out.println("Proxy : Message "+ message + " Transfere !");
		}
		
	}
	

}
