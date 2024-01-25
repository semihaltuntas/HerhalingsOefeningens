package be.vdab;

import java.math.BigDecimal;
import java.util.Scanner;

public class GoedeDoel {
    private final String naamVanGoedeDoel;
    private BigDecimal saldo = BigDecimal.ZERO;

    public GoedeDoel(String naamVanGoedeDoel) {
        this.naamVanGoedeDoel = naamVanGoedeDoel;

    }

    public String getNaamVanGoedeDoel() {
        return naamVanGoedeDoel;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void storten(BigDecimal bedrag) {
        if (bedrag.compareTo(BigDecimal.ZERO) > 0) {
           saldo = saldo.add(bedrag);
        }else throw new NullPointerException("je moet een bedrag storten groter dan 0!");
    }


    @Override
    public String toString() {
        return naamVanGoedeDoel + " " + getSaldo();
    }

    public static void main(String[] args) {

        GoedeDoel doel = new GoedeDoel("Unesco");
        System.out.println("geef een bedrag aub.!");
        Scanner scanner = new Scanner(System.in);
        BigDecimal bedrag = scanner.nextBigDecimal();

        while (bedrag.compareTo(BigDecimal.ZERO) != 0) {
            doel.storten(bedrag);
            bedrag = scanner.nextBigDecimal();
        }

        System.out.println(doel.toString());
    }

}
