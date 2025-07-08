package FactoryPattern_2;

public class AppleWorkFactory extends SoftwareShop{

	@Override
	protected OfficeProgramm createOfficeProgram(Kategorie zuHolendesProg) {
        OfficeProgramm programm = null; 
        if (zuHolendesProg.equals(Kategorie.Textverarbeitung)) { 
            programm = new Pages(); 
        } 
        else if (zuHolendesProg.equals(Kategorie.Presentation)) { 
            programm = new Keynode(); 
        } 
        else if (zuHolendesProg.equals(Kategorie.Tabellenkalkulation)) { 
            programm = new Numbers(); 
        } 
        else { 
            System.err.println("Ungültig!"); 
        } 
        return programm; 
	}

}
