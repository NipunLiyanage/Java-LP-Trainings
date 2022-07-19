package com.Factory;

public class Meal extends Combo {

    @Override
    protected void createCombo() {
        foods.add(new Burger());
        foods.add(new Drink());
        foods.add(new Fries());
    }
}
