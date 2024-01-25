package be.vdab2.taken;

import java.util.Scanner;
import java.util.TreeMap;

public class Land {
    public static void main(String[] args) {
        TreeMap<String, Integer> landInformaties = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef een Landcode !");
        for (String code; !(code = scanner.nextLine()).equalsIgnoreCase("STOP"); ) {
            System.out.println("Geef aantal İnwoners van Land !");
            var aantalInwoners = scanner.nextInt();
            landInformaties.put(code, aantalInwoners);
            scanner.nextLine();
        }
        var totaale = 0;

        for (var enrty : landInformaties.entrySet()) {
            System.out.println(enrty.getKey() + " : " + enrty.getValue());
            totaale += enrty.getValue();
        }
        System.out.println(totaale);
    }
}


//TreeMap<String, Integer> landcodes = new TreeMap<>();
//
//Scanner scanner = new Scanner(System.in);
//        System.out.println("Geef een landcode !");
//        for (String code; !(code = scanner.nextLine()).equalsIgnoreCase("stop"); ) {
//        System.out.println("geef aantal İnwoners van Land!");
//var aantalInwoners = scanner.nextInt();
//            landcodes.put(code, aantalInwoners);
//            scanner.nextLine();
//        }
//var totaal = 0;
//        for (var entry : landcodes.entrySet()) {
//        System.out.println(entry.getKey() + " : " + entry.getValue());
//totaal += entry.getValue();
//        }
//                System.out.println(totaal);