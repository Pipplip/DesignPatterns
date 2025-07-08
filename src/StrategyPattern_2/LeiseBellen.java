package StrategyPattern_2;

public class LeiseBellen implements BellVerhalten{

	@Override
	public void bellen() {
		System.out.println("leise bellen...");
	}

}
