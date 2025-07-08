package FactoryPattern;

public class SpreadSheetDocFactory extends DocumentFactory {

	@Override
	public Document create() {
		return new SpreadSheetDocument();
	}

}
