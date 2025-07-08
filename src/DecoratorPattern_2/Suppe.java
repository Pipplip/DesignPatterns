package DecoratorPattern_2;

public class Suppe extends Beilage {

	public Suppe(Gericht gericht) {
		super(gericht);
	}

	@Override
	public double getPreis() {
		return gericht.getPreis() + 1.50;
	}

	@Override
	public void druckeBeschreibung() {
		gericht.druckeBeschreibung();
		System.out.println(", Suppe");
	}

}
