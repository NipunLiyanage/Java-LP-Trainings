package com.Factory;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Combo combo1 = ComboAdder.createCombo(ComboType.COMBOMEAL);
        System.out.println(combo1);
        Combo combo2 = ComboAdder.createCombo(ComboType.BURGER);
        System.out.println(combo2);

    }
}
