package AbstractFactoryPattern_2;

public class Polargebietgenerator implements AbstractGenerator{
    public Tier createTier(){
        return new Eisbär();
    }
    public Pflanze createPflanze(){
        return new Flechte();
    }
    public Untergrund createUntergrund(){
        return new Schnee();
    }
}
