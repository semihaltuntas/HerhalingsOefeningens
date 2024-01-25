package be.vdab2.kasbon;

import javax.crypto.spec.PSource;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        var kasbon1 = new NietKapitaliseerbareKasbon(
                BigDecimal.valueOf(10_000), 3, BigDecimal.valueOf(0.1));
        System.out.println(kasbon1.getEindWaarde());

        var kasbon2 = new KapitaliseerbareKasbon(
                BigDecimal.valueOf(10_000), 3, BigDecimal.valueOf(0.1));
        System.out.println(kasbon2.getEindWaarde());

        var klant = new Klant();
        klant.add(kasbon1);
        klant.add(kasbon2);
        System.out.println(klant.getEindWaarde());


    }
}
