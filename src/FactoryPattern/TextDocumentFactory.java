package FactoryPattern;

public class TextDocumentFactory extends DocumentFactory {

	@Override
	public Document create() {
		return new TextDocument();
	}

}
