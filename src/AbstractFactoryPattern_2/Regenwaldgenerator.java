package AbstractFactoryPattern_2;

public class Regenwaldgenerator {
    public Tier createTier(){
        return new Elefant();
    }
    public Pflanze createPflanze(){
        return new Baum();
    }
    public Untergrund createUntergrund(){
        return new Gras();
    }
}
