package com.company;

public class BurgerTelescopic {

    Boolean addExtraCheese;
    Boolean addExtraSauce;
    int noOfExtraPatties;

    public BurgerTelescopic(Boolean addExtraCheese){
        this.addExtraCheese=addExtraCheese;
    }

    public BurgerTelescopic(Boolean addExtraCheese, Boolean addExtraSauce){
        this(addExtraCheese);
        this.addExtraSauce=addExtraSauce;
    }

    public BurgerTelescopic(Boolean addExtraCheese, Boolean addExtraSauce, int noOfExtraPatties){
        this(addExtraCheese, addExtraSauce);
        this.noOfExtraPatties=noOfExtraPatties;

    }

    @Override
    public String toString() {
        return "BurgerTelescopic{" +
                "addExtraCheese=" + addExtraCheese +
                ", addExtraSauce=" + addExtraSauce +
                ", noOfExtraPatties=" + noOfExtraPatties +
                '}';
    }
}
