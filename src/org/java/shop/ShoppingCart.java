package org.java.shop;

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        System.out.println(
                "Benvenuto nel nostro shop! Inserisci il numero che ti viene richiesto a seconda del prodotto che vuoi acquistare!");
        System.out.println("-------------------------------------------------");
        Product[] ProdottiAcquistati = new Product[99];
        int ProdottiInseriti = 0;
        Scanner scanner = new Scanner(System.in);

        boolean shopping = true;
        while (shopping) {
            System.out.println("-------------------------------------------------");
            System.out.println("1 - Smartphone");
            System.out.println("2 - Cuffie");
            System.out.println("3 - Televisioni");
            System.out.println("4 - Esci");
            System.out.println("-------------------------------------------------");



            int input = scanner.nextInt();

            // CELLULARI
            switch (input) {
                case 1:{
                    Smartphone SamsungA32 = new Smartphone("SamsungA32", "Un Telefono perfetto per tuo figlio!", "Samsung",
                        130.35f,
                        22, "1024059381920398", 32);

                    Smartphone SamsungS25 = new Smartphone("SamsungS25", "Un Telefono perfetto se vuoi il top di gamma!",
                        "Samsung",
                        130.35f,
                        22, "1024059381920398", 256);
                    System.out.println("Hai scelto di comprare un Cellulare!    Questi sono quelli Disponibili: ");
                    System.out.println(SamsungA32.getName());
                    System.out.println(SamsungS25.getName());
                    System.out.println("-------------------------------------------------");
                    System.out.println("Quale ti interessa? Indica il numero del prodotto che ti interessa.");
                    System.out.println("1" + " " + SamsungA32.getName());
                    System.out.println("2" + " " + SamsungS25.getName());
                    Product[] CellulariDisponibili = { SamsungA32, SamsungS25 };

                    boolean isDone = false;
                    while (!isDone) {
                        int sceltaCellulare = scanner.nextInt();
                        if (sceltaCellulare == 1) {
                        ProdottiAcquistati[ProdottiInseriti] = SamsungA32;
                        ProdottiInseriti++;
                        System.out.println(
                                "Hai messo nel carrello il " + SamsungA32.getName()
                                        + " vuoi proseguire con gli acquisti dei cellulari?");
                        System.out.println("1 - Si");
                        System.out.println("2 - No");
                        int ProseguiAcquistiCellulare = scanner.nextInt();

                        if (ProseguiAcquistiCellulare == 1) {
                            isDone = false;
                            for (int i = 0; i < CellulariDisponibili.length; i++) {
                                CellulariDisponibili[i].getName();
                                System.out.println((i + 1) + " " + CellulariDisponibili[i].getName());
                            }
                        } else if (ProseguiAcquistiCellulare == 2) {
                            isDone = true;
                        } else {
                            System.err.println("Scelta non valida, riprova");
                        }

                    } else if (sceltaCellulare == 2) {
                        ProdottiAcquistati[ProdottiInseriti] = SamsungS25;
                        ProdottiInseriti++;
                        System.out.println(
                                "Hai messo nel carrello il " + SamsungS25.getName()
                                        + " vuoi proseguire con gli acquisti dei cellulari?");
                        System.out.println("1 - Si");
                        System.out.println("2 - No");
                        int ProseguiAcquistiCellulare = scanner.nextInt();

                        if (ProseguiAcquistiCellulare == 1) {
                            isDone = false;
                            for (int i = 0; i < CellulariDisponibili.length; i++) {
                                CellulariDisponibili[i].getName();
                                System.out.println((i + 1) + " " + CellulariDisponibili[i].getName());
                            }
                        } else if (ProseguiAcquistiCellulare == 2) {
                            isDone = true;
                        } else {
                            System.err.println("Scelta non valida, riprova");
                        }

                    }
                    }}
                    break;
                // CUFFIE
                case 2: {
                    HeadPhone CuffieBellissime = new HeadPhone("WH-134ST",
                        "Cuffie con suono bellissimo che riproducono qualsiasi canzone al top", "Xiaomi", 40.40f, 22,
                        "Black", true);
                    HeadPhone CuffieGaming = new HeadPhone("Trust-Gaming-Tytan",
                        "Cuffie con suono adatto ad ogni tuo gioco!", "Xiaomi", 80.00f, 22,
                        "Black", true);

                    System.out.println("Hai scelto di comprare una Cuffia! Queste sono quelle Disponibili: ");
                    System.out.println(CuffieBellissime.getName());
                    System.out.println(CuffieGaming.getName());
                    System.out.println("-------------------------------------------------");
                    System.out.println("Quale ti interessa? Indica il numero del prodotto che ti interessa.");
                    Product[] CuffieDisponibili = { CuffieBellissime, CuffieGaming };
                    System.out.println("1" + " " + CuffieBellissime.getName());
                    System.out.println("2" + " " + CuffieGaming.getName());

                    boolean isDone = false;
                    while (!isDone) {
                    int sceltaCuffia = scanner.nextInt();
                    if (sceltaCuffia == 1) {
                        ProdottiAcquistati[ProdottiInseriti] = CuffieBellissime;
                        ProdottiInseriti++;
                        System.out.println(
                                "Hai messo nel carrello " + CuffieBellissime.getName()
                                        + " vuoi proseguire con gli acquisti delle cuffie?");
                        System.out.println("1 - Si");
                        System.out.println("2 - No");
                        int ProseguiAcquistiCuffie = scanner.nextInt();

                        if (ProseguiAcquistiCuffie == 1) {
                            isDone = false;
                            for (int i = 0; i < CuffieDisponibili.length; i++) {
                                CuffieDisponibili[i].getName();
                                System.out.println((i + 1) + " " + CuffieDisponibili[i].getName());
                            }
                        } else if (ProseguiAcquistiCuffie == 2) {
                            isDone = true;
                        } else {
                            System.err.println("Scelta non valida, riprova");
                        }

                    } else if (sceltaCuffia == 2) {
                        ProdottiAcquistati[ProdottiInseriti] = CuffieGaming;
                        ProdottiInseriti++;
                        System.out.println("Hai messo nel carrello le " + CuffieGaming.getName());
                        System.out.println(
                                "Hai messo nel carrello le " + CuffieGaming.getName()
                                        + " vuoi proseguire con gli acquisti delle Cuffie?");
                        System.out.println("1 - Si");
                        System.out.println("2 - No");
                        int ProseguiAcquistiCuffie = scanner.nextInt();

                        if (ProseguiAcquistiCuffie == 1) {
                            isDone = false;
                            for (int i = 0; i < CuffieDisponibili.length; i++) {
                                CuffieDisponibili[i].getName();
                                System.out.println((i + 1) + " " + CuffieDisponibili[i].getName());
                            }
                        } else if (ProseguiAcquistiCuffie == 2) {
                            isDone = true;
                        } else {
                            System.err.println("Scelta non valida, riprova");
                        }

                    }
                }
            break;}

                // TELEVISIONE
                case 3:
                    Television TeleVintage = new Television("PanasonicWide",
                        "Un Televisore perfetto per chi ama le cose un po' vintage!",
                        "Panasonic",
                        500.00f,
                        22, "Medium", false);
                    Television SmartTV = new Television("SmarTv", "Un Televisore perfetto per la tua famiglia!",
                        "Panasonic",
                        1500.00f,
                        22, "Large", true);
                    System.out.println("Hai scelto di comprare una Televisione! Queste sono quelle Disponibili: ");
                    System.out.println(TeleVintage.getName());
                    System.out.println(SmartTV.getName());
                    System.out.println("-------------------------------------------------");
                    System.out.println("Quale ti interessa? Indica il numero del prodotto che ti interessa.");
                    System.out.println("1" + " " + TeleVintage.getName());
                    System.out.println("2" + " " + SmartTV.getName());

                    Product[] TelevisioniDisponibili = { TeleVintage, SmartTV };

                    boolean isDone = false;
                    while (!isDone) {
                    int sceltaTV = scanner.nextInt();
                    if (sceltaTV == 1) {
                        ProdottiAcquistati[ProdottiInseriti] = TeleVintage;
                        ProdottiInseriti++;
                        System.out.println(
                                "Hai messo nel carrello " + TeleVintage.getName()
                                        + " vuoi proseguire con gli acquisti delle televisioni?");
                        System.out.println("1 - Si");
                        System.out.println("2 - No");
                        int ProseguiAcquistiTelevisione = scanner.nextInt();

                        if (ProseguiAcquistiTelevisione == 1) {
                            isDone = false;
                            for (int i = 0; i < TelevisioniDisponibili.length; i++) {
                                TelevisioniDisponibili[i].getName();
                                System.out.println((i + 1) + " " + TelevisioniDisponibili[i].getName());
                            }
                        } else if (ProseguiAcquistiTelevisione == 2) {
                            isDone = true;
                        } else {
                            System.err.println("Scelta non valida, riprova");
                        }

                    } else if (sceltaTV == 2) {
                        ProdottiAcquistati[ProdottiInseriti] = SmartTV;
                        ProdottiInseriti++;
                        System.out.println("Hai messo nel carrello le " + SmartTV.getName());
                        System.out.println(
                                "Hai messo nel carrello il " + SmartTV.getName()
                                        + " vuoi proseguire con gli acquisti delle Televisioni?");
                        System.out.println("1 - Si");
                        System.out.println("2 - No");
                        int ProseguiAcquistiTelevisione = scanner.nextInt();

                        if (ProseguiAcquistiTelevisione == 1) {
                            isDone = false;
                            for (int i = 0; i < TelevisioniDisponibili.length; i++) {
                                TelevisioniDisponibili[i].getName();
                                System.out.println((i + 1) + " " + TelevisioniDisponibili[i].getName());
                            }
                        } else if (ProseguiAcquistiTelevisione == 2) {
                            isDone = true;
                        } else {
                            System.err.println("Scelta non valida, riprova");
                        }

                    }
                }
                break;
            case 4:
                shopping = false;
                
                float PrezzoTotale = 0;
                System.out.println("Contenuto del tuo carrello:");
                for (int i = 0; i < ProdottiInseriti; i++) {
                    System.out.println(ProdottiAcquistati[i].getName() + " " + ProdottiAcquistati[i].getPrice());
                    PrezzoTotale += ProdottiAcquistati[i].getPrice();
                }
                System.out.println("Totale: " + PrezzoTotale);
                break;
            }}
            scanner.close();
        


}}
