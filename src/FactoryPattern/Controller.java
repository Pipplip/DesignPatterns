package FactoryPattern;

public class Controller {
	Document document;
	DocumentFactory factory;
	
	public void initialize(){
		document = factory.createDocument();
		document.open();
	}
	
	public void setFactory(DocumentFactory factory){
		this.factory = factory;
	}
}
