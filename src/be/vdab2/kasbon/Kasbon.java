package be.vdab2.kasbon;

import java.math.BigDecimal;

abstract class Kasbon {
    protected final BigDecimal beginWaarde;
    protected final int jaren;
    protected final BigDecimal intrest;

    public Kasbon(BigDecimal beginWaarde, int jaren, BigDecimal intrest) {
        this.beginWaarde = beginWaarde;
        this.jaren = jaren;
        this.intrest = intrest;
    }
    public abstract BigDecimal getEindWaarde();
}
