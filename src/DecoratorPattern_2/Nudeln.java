package DecoratorPattern_2;

public class Nudeln extends Beilage{

	public Nudeln(Gericht gericht) {
		super(gericht);
	}

	@Override
	public double getPreis() {
		return gericht.getPreis() + 4.50;
	}

	@Override
	public void druckeBeschreibung() {
		gericht.druckeBeschreibung();
		System.out.println(", Nudeln");
	}

}
