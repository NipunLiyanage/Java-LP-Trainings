package com.company;

public class Burger extends Food{

    private String meat;
    private String size;

    public String getMeat() {
        return meat;
    }

    public String getSize() {
        return size;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "meat='" + meat + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
