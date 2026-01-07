package org.java.shop;

public class HeadPhone extends Product {
    private String color;
    private boolean isWireless;

    public HeadPhone(String name, String description, String brand, float price, float iva, String color,
            boolean isWireless) {
        super(name, description, brand, price, iva);
        this.color = color;
        this.isWireless = isWireless;
    }

    public String getisWireless() {
        if (isWireless == true) {
            return "La cuffia è wireless";
        } else {
            return "La cuffia è cablata";
        }
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
        return getCodex() + "\n" + getName() + "\n" + getDescription() + "\n" + getBrand() + "\n" + getPrice() + "\n"
                + "Colore: " + getColor() + "\n" + "Connessione: "
                + getisWireless();
    }
}
