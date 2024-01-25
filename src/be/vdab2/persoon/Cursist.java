package be.vdab2.persoon;

public class Cursist extends Persoon {

    private Traject traject;

    public Cursist(String naam, String voornaam, Traject traject) {
        super(naam, voornaam);
        this.traject = traject;
    }

    public Traject getTraject() {
        return traject;
    }

    public void setTraject(Traject traject) {
        this.traject = traject;
    }

}
