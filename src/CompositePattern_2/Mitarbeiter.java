package CompositePattern_2;

public abstract class Mitarbeiter {

    //Damit wir eine sch�ne Einr�ckung erhalten,
    //nutzen wir einen Stringparameter, der den Abstand enth�lt
    public abstract void print(String abstand);
    
    /*
     * Restlicher Code:
     */
    public abstract int getMitarbeiterAnzahl();
    
    private String name;
    private int telefonNr;

    //Konstruktor, in dem die Attribute gesetzt werden k�nnen
    public Mitarbeiter(String name, int telefonNr) {
        this.name = name;
        this.telefonNr = telefonNr;
    }
    //Getter und Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTelefonNr() {
        return telefonNr;
    }
    public void setTelefonNr(int telefonNr) {
        this.telefonNr = telefonNr;
    }
}
