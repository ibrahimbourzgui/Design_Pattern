package Composite;

public class Main {

	public static void main(String[] args) {
		
		Composite racine = new Composite("Composite1", 1);
		Composite cp2 = new Composite("Composite2" ,2);
		Element e1 = new Element("Element2" , 2);
		Element e2 = new Element("Element1" , 1);
		Element e3 = new Element("Element1" , 1);
		
		racine.addCp(cp2);
		cp2.addCp(e1);
		cp2.addCp(e2);
		racine.addCp(e3);
		racine.operation();
		

	}

}
