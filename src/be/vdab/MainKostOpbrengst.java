package be.vdab;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.Stream;

public class MainKostOpbrengst {
    public static void main(String[] args) {

        Gebouw gebouw = new Gebouw();
        gebouw.setHuurprijs(BigDecimal.valueOf(1000));
        Instructeur instructeur = new Instructeur();
        instructeur.setMaandwedde(BigDecimal.valueOf(2000));
        Kost[] kosten = new Kost[]{gebouw, instructeur};
//        BigDecimal totaleKost= BigDecimal.ZERO;
//
//       for (var kost : kosten){
//           totaleKost = totaleKost.add(kost.getKost());
//       }
        BigDecimal totaleKost = Stream.of(kosten)
                .map(Kost::getKost)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println(totaleKost);

    }
}
