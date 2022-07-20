package com.company;

public class Drink extends Food {

    private String size;
    private String brand;

    public String getSize() {
        return size;
    }

    public String getBrand() {
        return brand;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "size='" + size + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
