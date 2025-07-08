package FactoryPattern;

public abstract class DocumentFactory {
	public abstract Document create();
	Document createDocument(){
		Document d = create();
		return d;
	}
}
