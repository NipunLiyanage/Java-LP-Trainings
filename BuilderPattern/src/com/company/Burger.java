package com.company;

public abstract class Burger {

    private double price;
    private String meat;
    private String size;

    public String getMeat() {
        return meat;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
