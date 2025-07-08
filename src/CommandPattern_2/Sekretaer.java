package CommandPattern_2;

public class Sekretaer {
    private DruckBefehl druckBefehl;
    
    //Aufrufer wird mit dem konkreten DruckBefehl �ber einen Setter geladen
    //Alternative: Konstruktor
    public void setDruckBefehl(DruckBefehl druckBefehl) {
        this.druckBefehl = druckBefehl;
    }

    public void druckAusloesen(String dokument){
        druckBefehl.ausfuehren(dokument);
    }
}
