package be.vdab;

import java.util.Scanner;

public class Palindroom {

    public static void main(String[] args) {
        System.out.println("Tik een woord !");
        Scanner scanner = new Scanner(System.in);
        String woord = scanner.nextLine();

        System.out.println(new StringBuilder(woord).reverse()
                .toString().equals(woord)
                ? "Dit is palindrom ": "Dit is geen palindroom");

    }
}
