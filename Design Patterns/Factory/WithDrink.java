package com.Factory;

public class WithDrink extends Combo{

    @Override
    protected void createCombo() {
        foods.add(new Burger());
        foods.add(new Drink());
    }
}
