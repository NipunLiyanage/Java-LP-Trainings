package com.company;

public class ComboMeal extends Combo{

    @Override
    protected void createCombo() {
        foods.add(new Burger());
        foods.add(new Drink());
        foods.add(new Fries());
        foods.add(new ChickenNuggets());

    }
}
