
public class Vliegtuig {

    int gewicht;
    int persoon;
    boolean baggage;
    boolean toestemming;
    int tegenwind;
    int lading;
    boolean nederland;


    public Vliegtuig(int gewicht, int persoon, boolean baggage, boolean toestemming, int tegenwind, int lading, boolean nederland) {
        this.gewicht = gewicht;
        this.persoon = persoon;
        this.baggage = baggage;
        this.toestemming = toestemming;
        this.tegenwind = tegenwind;
        this.lading = lading;
        this.nederland = nederland;
    }

    public int getGewicht() {
        return gewicht;
    }

    public int getPersoon() {
        return persoon;
    }

    public boolean getBaggage() {
        return baggage;
    }

    public boolean getToestemming() {
        return toestemming;
    }

    public int getTegenwind() {
        return tegenwind;
    }
    public int getLading() {
        return lading;
    }
    public boolean getNederland() {
        return nederland;
    }
}