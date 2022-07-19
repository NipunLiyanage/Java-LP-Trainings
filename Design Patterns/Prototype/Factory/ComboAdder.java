package com.Factory;

public class ComboAdder {

    public static Combo createCombo(ComboType comboType){

        switch(comboType){

            case BURGER:
                return new BurgerOnly();
            case WITHDRINK:
                return new WithDrink();
            case MEAL:
                return new Meal();
            case COMBOMEAL:
                return new ComboMeal();
            default:
                return null;
        }
    }
}
