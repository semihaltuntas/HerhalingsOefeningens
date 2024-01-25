package be.vdab;

import java.util.Scanner;

public class Breuk {

    private final int teller;
    private final int noemer;

    public Breuk(int teller, int noemer) {
        if (noemer == 0) {
            throw new IllegalArgumentException("Noemer mag niet O zijn !");
        }
        this.teller = teller;
        this.noemer = noemer;
    }

    public int getTeller() {
        return teller;
    }

    public int getNoemer() {
        return noemer;
    }

    public int deel() {
        return teller / noemer;
    }

    @Override
    public String toString() {
        return teller + "/" + noemer;
    }

    public static void main(String[] args) {
        System.out.println("Tik een getal voor teller :");
        Scanner scanner = new Scanner(System.in);
        Integer teller = scanner.nextInt();

        try {
            System.out.println("Tik een getal voor noemer :");
            int noemer = scanner.nextInt();
            Breuk breuk = new Breuk(teller, noemer);
            System.out.println(breuk);
            System.out.println(breuk.deel());


        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
