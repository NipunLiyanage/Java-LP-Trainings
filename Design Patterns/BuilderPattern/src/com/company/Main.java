package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BurgerTelescopic bt = new BurgerTelescopic(true);
        System.out.println(bt);

        BurgerExtras.Builder builder = new BurgerExtras.Builder();

        BurgerExtras be = builder.addExtraCheese(true).addExtraSauce(false).noOfExtraPatties(1).build();

        System.out.println(be);

    }
}
