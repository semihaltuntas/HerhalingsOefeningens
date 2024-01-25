package be.vdab2.persoon;

import java.util.TreeSet;

public class MainPersoon {
    public static void main(String[] args) {
        var personen = new Personen();
        personen.add(new Persoon("Joe", "Dalton"));
        personen.add(new Persoon("Sarah", "Bernhardt"));


        var manager = new PersoonManager();
        manager.save(personen); // slaat op in een bestand op de harde schijf
        Personen personen2 = manager.load(); // leest de data van het bestand terug
        System.out.println(personen2);

        System.out.println("--------");
        var personen1 = new TreeSet<Persoon>();
        personen1.add(new Persoon("Semih", "Altuntas"));
        personen1.add(new Persoon("Ayhan", "Altuntas"));
        personen1.add(new Persoon("Esra", "Altuntas"));
        personen1.add(new Persoon("Mehmet","Akıncı"));

        personen1.forEach(System.out::println);


    }
}
