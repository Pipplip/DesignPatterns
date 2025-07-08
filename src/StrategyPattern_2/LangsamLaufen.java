package StrategyPattern_2;

public class LangsamLaufen implements LaufVerhalten {

	@Override
	public void laufen() {
		System.out.println("langsam laufen...");
	}

}
