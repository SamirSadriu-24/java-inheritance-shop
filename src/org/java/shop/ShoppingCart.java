package org.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        System.out.println(
                "Benvenuto nel nostro shop! Inserisci il numero che ti viene richiesto a seconda del prodotto che vuoi acquistare!");
        System.out.println("-------------------------------------------------");
        Product[] ProdottiAcquistati = {};
        Scanner scanner = new Scanner(System.in);

        boolean shopping = true;
        while (shopping) {
            System.out.println("Cosa vuoi acquistare?");
            System.out.println("-------------------------------------------------");
            System.out.println("1 - Smartphone");
            System.out.println("2 - Cuffie");
            System.out.println("3 - Televisioni");
            System.out.println("4 - Esci");
            System.out.println("-------------------------------------------------");

            int input = scanner.nextInt();
            scanner.nextLine();

            // CELLULARI
            switch (input) {
                case 1:
                    Smartphone cellulare = MadeByUser.creaSmartphone(scanner);
                    ProdottiAcquistati = aggiungiProdotto(ProdottiAcquistati, cellulare);
                    break;
                // CUFFIE
                case 2:
                    HeadPhone cuffie = MadeByUser.creaCuffie(scanner);
                    ProdottiAcquistati = aggiungiProdotto(ProdottiAcquistati, cuffie);
                    break;
                // TELEVISIONE
                case 3:
                    Television tv = MadeByUser.creaTelevisione(scanner);
                    ProdottiAcquistati = aggiungiProdotto(ProdottiAcquistati, tv);
                    break;
                case 4:
                    shopping = false;
                    scanner.close();
                    break;
            }

            System.out.println("Carrello attuale:");
            BigDecimal totale = BigDecimal.ZERO;

            for (int i = 0; i < ProdottiAcquistati.length; i++) {
                System.out.println(ProdottiAcquistati[i].getName());
                System.out.println(ProdottiAcquistati[i].getPrice());
                System.out.println("------------------------------");
                totale = totale.add(ProdottiAcquistati[i].getPrice());
            }

            System.out.println("Totale: " + totale);
        }

    }

    public static Product[] aggiungiProdotto(Product[] array, Product prodotto) {
        Product[] arrayAggiornato = new Product[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            arrayAggiornato[i] = array[i];
        }
        arrayAggiornato[arrayAggiornato.length - 1] = prodotto;
        return arrayAggiornato;
    }

}
