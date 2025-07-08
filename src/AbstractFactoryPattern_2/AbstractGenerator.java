package AbstractFactoryPattern_2;

public interface AbstractGenerator {
    public Tier createTier();
    public Pflanze createPflanze();
    public Untergrund createUntergrund();
}
