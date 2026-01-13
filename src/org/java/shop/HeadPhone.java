package org.java.shop;
import java.math.BigDecimal;

public class HeadPhone extends Product {
    private String color;
    private boolean isWireless;

    public HeadPhone(String name, String brand, BigDecimal price, String color,
            boolean isWireless) {
        super(name, brand, price);
        this.color = color;
        this.isWireless = isWireless;
    }


    public boolean getisWireless() {
        return this.isWireless;
    }

    public void setWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "\n" + getName() + "\n" + "\n" + getBrand() + "\n" + getPrice() + "\n"
                + "Colore: " + getColor() + "\n" + "Connessione: "
                + getisWireless();
    }
}
