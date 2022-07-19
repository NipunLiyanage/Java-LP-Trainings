package com.Factory;

public class BurgerOnly extends Combo{

    @Override
    protected void createCombo() {
        foods.add(new Burger());
    }
}
