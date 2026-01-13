package org.java.shop;

import java.math.BigDecimal;
import java.util.Random;


public class Smartphone extends Product {
    private int IMEI;
    private int memory;
    
    public int IMEIGENERATOR(){
        Random random = new Random();
        return random.nextInt(999999999);
    }
    

    public Smartphone(String name, String brand, BigDecimal price,
            int memory) {
        super(name, brand, price);
        this.IMEI = IMEIGENERATOR();
        this.memory = memory;
    }

    public int getIMEI() {
        return this.IMEI;
    }

    public int getMemory() {
        return this.memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String toString() {
        return getCodex() + "\n" + getName() + "\n" + "\n" + getBrand() + "\n" + getPrice() + "\n" + "IMEI: "
                + getIMEI() + "\n"
                + getMemory() + "GB";
    }

}
