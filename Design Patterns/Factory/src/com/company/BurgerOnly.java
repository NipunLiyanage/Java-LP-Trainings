package com.company;

public class BurgerOnly extends Combo{

    @Override
    protected void createCombo() {
        foods.add(new Burger());
    }
}
