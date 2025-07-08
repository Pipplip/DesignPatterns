package StrategyPattern_2;

import StrategyPattern_2.LangsamLaufen;

public class MainProgram {

	public static void main(String[] args) {
		Husky husky = new Husky();
		husky.bellen();
		husky.laufen();
		husky.setLaufVerhalten(new LangsamLaufen());
		husky.laufen();
	}

}
