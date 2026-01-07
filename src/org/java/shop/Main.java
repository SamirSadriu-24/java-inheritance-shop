package org.java.shop;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------------------------------------------------");
        Product Smartphone = new Smartphone("SamsungA32", "Un Telefono perfetto per tuo figlio!", "Samsung", 130.35f,
                22, "1024059381920398", 32);
        Smartphone.setName("Iphone-13");
        System.out.println(Smartphone.toString());

        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        Television TV = new Television("PanasonicWide", "Un Televisore perfetto per la tua famiglia!", "Panasonic",
                500.00f,
                22, "Medium", true);
        TV.setName("HP-123");
        System.out.println(TV.toString());

        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");

        HeadPhone CuffieBellissime = new HeadPhone("WH-134ST", "Cuffie con suono bellissimo che riproducono qualsiasi canzone al top", "Xiaomi", 80.40f, 22, "Black", true);
        CuffieBellissime.setWireless(false);
        CuffieBellissime.setName("TyrantTrustGamingPC");
        CuffieBellissime.setBrand("Trust");
        System.out.println(CuffieBellissime.toString());
    }
}