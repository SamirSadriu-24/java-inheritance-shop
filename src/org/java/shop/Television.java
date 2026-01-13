package org.java.shop;

import java.math.BigDecimal;

public class Television extends Product {
    private String size;
    private boolean IsSmart;

    public Television(String name, String brand, BigDecimal price, String size,
            boolean IsSmart) {
        super(name, brand, price);
        this.size = size;
        this.IsSmart = IsSmart;

    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean getIsSmart() {
        return this.IsSmart;
    }

    public void setSmart(boolean IsSmart) {
        this.IsSmart = IsSmart;
    }

    public String toString() {
        return getCodex() + "\n" + getName() + "\n" + "\n" + getBrand() + "\n" + getPrice() + "\n"
                + "Size: " + getSize() + "\n" + "Is Smart: "
                + getIsSmart();
    }

}
