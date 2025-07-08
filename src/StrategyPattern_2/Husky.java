package StrategyPattern_2;

import StrategyPattern_2.SchnellLaufen;

public class Husky extends Hund {
	public Husky(){
		setBellVerhalten(new LeiseBellen());
		setLaufVerhalten(new SchnellLaufen());
	}

}
