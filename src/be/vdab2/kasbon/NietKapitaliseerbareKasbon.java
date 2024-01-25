package be.vdab2.kasbon;

import java.math.BigDecimal;

public class NietKapitaliseerbareKasbon extends Kasbon {
    public NietKapitaliseerbareKasbon(BigDecimal beginWaarde, int jaren, BigDecimal intrest) {
        super(beginWaarde, jaren, intrest);
    }

    @Override
    public BigDecimal getEindWaarde() {
        return beginWaarde.add(beginWaarde.multiply(intrest).multiply(BigDecimal.valueOf(jaren)));
    }
}
