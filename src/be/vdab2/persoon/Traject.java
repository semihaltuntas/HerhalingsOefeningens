package be.vdab2.persoon;

public class Traject {
    private String naam;

    public Traject(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public String toString() {
        return naam;
    }
}
