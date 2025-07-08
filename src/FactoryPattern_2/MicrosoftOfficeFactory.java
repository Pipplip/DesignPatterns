package FactoryPattern_2;

public class MicrosoftOfficeFactory extends SoftwareShop{

	@Override
	protected OfficeProgramm createOfficeProgram(Kategorie zuHolendesProg) {
        OfficeProgramm programm = null; 
        if (zuHolendesProg.equals(Kategorie.Textverarbeitung)) { 
            programm = new Word(); 
        } 
        else if (zuHolendesProg.equals(Kategorie.Presentation)) { 
            programm = new Powerpoint(); 
        } 
        else if (zuHolendesProg.equals(Kategorie.Tabellenkalkulation)) { 
            programm = new Excel(); 
        } 
        else { 
            System.err.println("Ungültig!"); 
        } 
        return programm; 
	}

}
