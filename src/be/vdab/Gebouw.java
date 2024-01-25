package be.vdab;

import java.math.BigDecimal;

public class Gebouw implements Kost{
    private BigDecimal huurprijs;

    public Gebouw() {
    }

    public Gebouw(BigDecimal huurprijs) {
        this.huurprijs = huurprijs;
    }

    public BigDecimal getHuurprijs() {
        return huurprijs;
    }

    public void setHuurprijs(BigDecimal huurprijs) {
        this.huurprijs = huurprijs;
    }

    @Override
    public BigDecimal getKost() {
        return huurprijs;
    }
}
