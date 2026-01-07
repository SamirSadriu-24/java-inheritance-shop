package org.java.shop;

public class Television extends Product {
    private String size;
    private boolean IsSmart;

    public Television(String name, String description, String brand, float price, float iva, String size,
            boolean IsSmart) {
        super(name, description, brand, price, iva);
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
        return getCodex() + "\n" + getName() + "\n" + getDescription() + "\n" + getBrand() + "\n" + getPrice() + "\n"
                + "Size: " + getSize() + "\n" + "Is Smart: "
                + getIsSmart();
    }

}
