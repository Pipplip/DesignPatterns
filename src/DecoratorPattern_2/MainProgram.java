package DecoratorPattern_2;

public class MainProgram {

	public static void main(String[] args) {
		Gericht gericht = new Salat(new Nudeln(new HueftSteak()));
		gericht.druckeBeschreibung();
		System.out.println(" fuer "+gericht.getPreis()+ " Euro");
		
		gericht = new Suppe(gericht);
		gericht.druckeBeschreibung();
		System.out.println(" fuer "+gericht.getPreis()+ " Euro");
	}

}
