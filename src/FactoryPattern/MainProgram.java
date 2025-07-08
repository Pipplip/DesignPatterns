package FactoryPattern;

public class MainProgram {

	public static void main(String[] args) {
		Controller controller = new Controller();
		controller.setFactory(new TextDocumentFactory());
		
		controller.initialize();
	}

}
