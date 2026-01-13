package org.java.shop;

import java.util.Random;
import java.math.BigDecimal;


public class Product {
    private int codex;
    private String name;
    private String brand;
    private BigDecimal price;
    private float iva = 22;

    public Product(String name, String brand, BigDecimal price){
        Random random = new Random();
        this.codex = random.nextInt(300);
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public int getCodex() {
        return this.codex;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public float getIva() {
        return this.iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    

}
