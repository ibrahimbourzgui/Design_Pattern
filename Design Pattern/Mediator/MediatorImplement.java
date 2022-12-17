package Mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorImplement implements MediatorInf{
	
	private List<Reseau> users;
	
	public MediatorImplement() {
		this.users = new ArrayList<>();
	}

	@Override
	public void sendMsg(String msg, Reseau r) {
		for(Reseau u : this.users) {
			if(u != r) {
				u.recMsg(msg);
			}
			
		}
		
	}

	@Override
	public void ajouterUser(Reseau r) {
		this.users.add(r);
		
	}

}
