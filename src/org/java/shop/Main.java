package org.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------------------------------------------------");
        Smartphone samsungA32 = new Smartphone("SamsungA32", "Samsung", new BigDecimal("130.12"),
 32);
        samsungA32.setName("Iphone-13");
        System.out.println(samsungA32.toString());

        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        Television tvProva = new Television("PanasonicWide", "Panasonic",
                new BigDecimal("500.12"),
                 "Medium", true);
        tvProva.setName("HP-123");
        System.out.println(tvProva.toString());

        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");

        HeadPhone cuffieBellissime = new HeadPhone("WH-134ST",
                 "Xiaomi", new BigDecimal("80.40"), "Black",
                true);
        cuffieBellissime.setWireless(false);
        cuffieBellissime.setName("TyrantTrustGamingPC");
        cuffieBellissime.setBrand("Trust");
        System.out.println(cuffieBellissime.toString());
    }
}