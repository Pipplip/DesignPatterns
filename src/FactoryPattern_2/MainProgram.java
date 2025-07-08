package FactoryPattern_2;

public class MainProgram {

	public static void main(String[] args) {
		// SoftwareShop kennt nur Abstraktion OfficeProgramm und ist somit zu den konkreten Klassen entkoppelt
		SoftwareShop appleShop = new AppleWorkFactory();
		OfficeProgramm appleTextProgram = appleShop.holeApp(Kategorie.Textverarbeitung);
		appleTextProgram.starten();
		
		SoftwareShop msShop = new MicrosoftOfficeFactory();
		OfficeProgramm wordPresProgram = msShop.holeApp(Kategorie.Presentation);
		wordPresProgram.starten();
	}

}
