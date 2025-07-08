package DecoratorPattern_2;

public class HueftSteak implements Gericht{

	@Override
	public double getPreis() {
		return 13.0;
	}

	@Override
	public void druckeBeschreibung() {
		System.out.println("Hüftsteak");
	}

}
