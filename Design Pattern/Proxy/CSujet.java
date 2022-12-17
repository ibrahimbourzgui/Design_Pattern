package Proxy;

public class CSujet implements Sujet {

	@Override
	public void TransfertMessage(String message) {
		System.out.println("Message accepte " +message);
	}

}
