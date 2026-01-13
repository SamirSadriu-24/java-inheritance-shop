package org.java.shop;

import java.util.Scanner;
import java.math.BigDecimal;

public class MadeByUser {

    public static HeadPhone creaCuffie(Scanner scanner) {
        System.out.println("Nome della Cuffia che si vuole acquistare:");
        String name = scanner.nextLine();
        System.out.println("Brand della Cuffia che si vuole acquistare");
        String brand = scanner.nextLine();
        System.out.print("Prezzo: ");
        String prezzoString = scanner.nextLine();
        BigDecimal price = new BigDecimal(prezzoString);
        System.out.print("Colore: ");
        String color = scanner.nextLine();
        System.out.print("Wireless (true/false): ");
        boolean isWireless = scanner.nextBoolean();
        scanner.nextLine();

        return new HeadPhone(name, brand, price, color, isWireless);
    }

    public static Smartphone creaSmartphone(Scanner scanner) {
        System.out.println("Nome dello Smartphone che si vuole acquistare:");
        String name = scanner.nextLine();

        System.out.println("Brand dello Smartphone che si vuole acquistare");
        String brand = scanner.nextLine();

        System.out.print("Prezzo: ");
        String prezzoString = scanner.nextLine();
        BigDecimal price = new BigDecimal(prezzoString);
        
        System.out.print("GB di Memoria: ");
        int memory = scanner.nextInt();

        return new Smartphone(name, brand, price, memory);
    }

    public static Television creaTelevisione(Scanner scanner) {
        System.out.println("Nome della Televisione che si vuole acquistare:");
        String name = scanner.nextLine();
        System.out.println("Brand della Televisione che si vuole acquistare");
        String brand = scanner.nextLine();
        System.out.print("Prezzo: ");
        String prezzoString = scanner.nextLine();
        BigDecimal price = new BigDecimal(prezzoString);
        System.out.print("Grandezza: Small/Medium/Large");
        String size = scanner.nextLine();
        System.out.println("La Televisione e' smart o no? true/false");
        boolean isSmart = scanner.nextBoolean();
        return new Television(name, brand, price, size, isSmart);

    }

}
