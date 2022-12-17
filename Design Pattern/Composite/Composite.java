package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Composant{
	

	public Composite(String nom, int niveau) {
		super(nom, niveau);
		// TODO Auto-generated constructor stub
	}

	private List<Composant> cps = new ArrayList<Composant>();
	@Override
	public void operation() {
		String tab="";
		for(int i =0; i<niveau; i++) tab+=("-----");
		System.out.println(tab+ "Composite "+nom);
		for(Composant c:cps) {
			c.operation();
		}
		
	}
	
	public void addCp(Composant c) {
		c.niveau = this.niveau+1;
		cps.add(c);
	}
	
	public List<Composant> getChailds(){
		return cps;
	}
	

}
