package be.vdab;

import java.math.BigDecimal;

public class Instructeur implements Kost,Opbrengst {

    private BigDecimal maandwedde;
    private BigDecimal uurPrijsPerles;
    private int aantalUrenLesAanWerknemers;

    public Instructeur() {
    }

    public Instructeur(BigDecimal maandwedde, BigDecimal uurPrijsPerles, int aantalUrenLesAanWerknemers) {
        this.maandwedde = maandwedde;
        this.uurPrijsPerles = uurPrijsPerles;
        this.aantalUrenLesAanWerknemers = aantalUrenLesAanWerknemers;
    }

    public void setMaandwedde(BigDecimal maandwedde) {
        this.maandwedde = maandwedde;
    }

    public void setUurPrijsPerles(BigDecimal uurPrijsPerles) {
        this.uurPrijsPerles = uurPrijsPerles;
    }

    public void setAantalUrenLesAanWerknemers(int aantalUrenLesAanWerknemers) {
        this.aantalUrenLesAanWerknemers = aantalUrenLesAanWerknemers;
    }

    public BigDecimal getUurPrijsPerles() {
        return uurPrijsPerles;
    }

    public int getAantalUrenLesAanWerknemers() {
        return aantalUrenLesAanWerknemers;
    }

    @Override
    public BigDecimal getKost() {
        return maandwedde;
    }

    @Override
    public BigDecimal getOpbrengst() {
        return uurPrijsPerles.multiply(BigDecimal.valueOf(aantalUrenLesAanWerknemers));
    }
}
