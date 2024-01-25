package be.vdab2.persoon;

import java.io.Serializable;

public class Persoon implements Serializable, Comparable<Persoon> {
    private String voornaam;
    private String familienaam;
    private static final long serialVersionUID = 1L;

    public Persoon(String voornaam, String familienaam) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getFamilienaam() {
        return familienaam;
    }

    public void setFamilienaam(String familienaam) {
        this.familienaam = familienaam;
    }

    @Override
    public String toString() {
        return voornaam + " " + familienaam;
    }


    @Override
    public int compareTo(Persoon ander) {
        var familienaamVergelijking = familienaam.compareTo(ander.familienaam);
        if (familienaamVergelijking == 0) {
            return voornaam.compareTo(ander.voornaam);
        }
        return familienaamVergelijking;
    }
}
