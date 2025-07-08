package AbstractFactoryPattern_2;

public class MainProgram {
	
	// AbstractGenerator = AbstractFactory
	// Polargebietgenerator = concrete Factory
	// Tier = Product
	// Eelfant, Kamel, Sand etc. = concrete Products

	public static void main(String[] args) {
	    //An einer zentrale Stelle wird der Typ bestimmt -> schneller Austausch
	    AbstractGenerator generator = new Polargebietgenerator();
	    
	    //Objekte werden erstellt 
	    Pflanze pflanze = generator.createPflanze();
	    Tier tier = generator.createTier();
	    Untergrund untergrund = generator.createUntergrund();
	    //...
	    
	    //Welt wird gebaut
	}

	
	
	// Falscher Ansatz folgend, weil der Client zu viel von den konrekten Klassen weiss und manipulieren, bzw. mischen kann
	// Inkonsistenz: Client koennte also z.B. Kamel in Polargebiet setzen, was nicht sein soll
	// Keine Allgemeingueltigkeit: wenn Client gleiche Anzahl an Tieren oder Pflanzen in allen Welten will, 
	// muss viel Code umgeschrieben werden, d.h. hohe Wartung
	// Keine Erweiterbarkeit: Enge Kopplung an konkrete Klassen.
	
// Flags die bestimmen, welchen Weltentyp der Client bauen soll
//    boolean regenwald = true;
//    boolean polargebiet = false;
//    boolean w�ste = false;
//    
//    //Elemente holen
//    if (regenwald){
//        Regenwaldgenerator regenwaldgenerator = new Regenwaldgenerator();
//        Baum baum1 = regenwaldgenerator.createBaum();
//        Baum baum2 = regenwaldgenerator.createBaum();
//        Elefant elefant = regenwaldgenerator.createElefant();
//        Gras gras = regenwaldgenerator.createGras();
//        //Welt zusammen setzten...
//    } else if (w�ste){
//        W�stengenerator w�stengenerator = new W�stengenerator();
//        Kaktus kaktus1 = w�stengenerator.createKaktus();
//        Kaktus kaktus2 = w�stengenerator.createKaktus();
//        Kamel kamel = w�stengenerator.createKamel();
//        Sand sand = w�stengenerator.createSand();
//        //Welt zusammen setzten...
//    } else if (polargebiet){
//        Polargebietgenerator polargebietgenerator = new Polargebietgenerator();
//        // etc.
//        //Welt zusammen setzten...
//    }
	
	
	
}
