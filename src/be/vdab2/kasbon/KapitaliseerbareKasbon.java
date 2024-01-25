package be.vdab2.kasbon;

import java.math.BigDecimal;

public class KapitaliseerbareKasbon extends Kasbon {
    public KapitaliseerbareKasbon(BigDecimal beginWaarde, int jaren, BigDecimal intrest) {
        super(beginWaarde, jaren, intrest);
    }

    @Override
    public BigDecimal getEindWaarde() {
        var totaalIntrest = BigDecimal.ZERO;
        for (int jaar=0; jaar < 0; jaar++){
            totaalIntrest = totaalIntrest.add
                    (beginWaarde.multiply(intrest)).add(totaalIntrest.multiply(intrest));
        }
        return totaalIntrest;
    }

}
