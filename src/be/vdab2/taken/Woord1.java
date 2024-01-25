package be.vdab2.taken;

import java.util.Scanner;
import java.util.TreeMap;

public class Woord1 {
    public static void main(String[] args) {
        TreeMap<String, Integer> woordenEnAantalen = new TreeMap<>();

        System.out.println("Schrijf zinnen :");
        Scanner scanner = new Scanner(System.in);

        for (String zin; !(zin = scanner.nextLine()).equalsIgnoreCase("STOP"); ) {
            String[] woorden = zin.split(" ");
            for (var woord : woorden) {
                var aantal = woordenEnAantalen.get(woord);
                if (aantal == null) {
                    woordenEnAantalen.put(woord, 1);
                } else {
                    woordenEnAantalen.put(woord, aantal + 1);
                }
            }
        }
        for (var entry : woordenEnAantalen.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
