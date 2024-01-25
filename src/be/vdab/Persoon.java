package be.vdab;

public class Persoon {
    private String familienaam;
    private String voornaam;

    public Persoon(String familienaam, String voornaam) {
        this.familienaam = familienaam;
        this.voornaam = voornaam;
    }

    public String getFamilienaam() {
        return familienaam;
    }

    public String getVoornaam() {
        return voornaam;
    }


    public String getNaam() {
        return voornaam + " " + familienaam;
    }
}
