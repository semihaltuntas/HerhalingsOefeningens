package be.vdab;

public class Politieker extends Persoon{
    private PolitiekePartij partij;

    public Politieker(String familienaam, String voornaam) {
        super(familienaam, voornaam);
    }

    public PolitiekePartij getPartij() {
        return partij;
    }

    public void setPartij(PolitiekePartij partij) {
        this.partij = partij;
    }

    @Override
    public String toString() {
        return getNaam()+ " "+ getPartij().getNaam()+" "+getPartij().getAantalLeden() ;
    }
}
