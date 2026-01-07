package org.java.shop;

public class Smartphone extends Product {
    private String IMEI;
    private int memory;

    public Smartphone(String name, String description, String brand, float price, float iva, String IMEI,
            int memory) {
        super(name, description, brand, price, iva);
        this.IMEI = IMEI;
        this.memory = memory;
    }

    public String getIMEI() {
        return this.IMEI;
    }

    public int getMemory() {
        return this.memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String toString() {
        return getCodex() + "\n" + getName() + "\n" + getDescription() + "\n" + getBrand() + "\n" + getPrice() + "\n" + "IMEI: " + getIMEI() + "\n"
                + getMemory() + "GB";
    }

}
