package com.company;

public class BurgerExtras extends Burger {


    private final Boolean addExtraCheese;
    private final Boolean addExtraSauce;
    private final int noOfExtraPatties;

    public BurgerExtras(Builder builder){
        this.addExtraCheese=builder.addExtraCheese;
        this.addExtraSauce=builder.addExtraSauce;
        this.noOfExtraPatties=builder.noOfExtraPatties;
    }

    static class Builder{

        private Boolean addExtraCheese;
        private Boolean addExtraSauce;
        private int noOfExtraPatties;

        public BurgerExtras build(){
            return new BurgerExtras(this);
        }



        public Builder addExtraCheese(Boolean addExtraCheese){
            this.addExtraCheese=addExtraCheese;
            return this;
        }

        public Builder addExtraSauce(Boolean addExtraSauce){
            this.addExtraSauce = addExtraSauce;
            return this;
        }

        public Builder noOfExtraPatties(int noOfExtraPatties){
            this.noOfExtraPatties= noOfExtraPatties;
            return this;
        }

    }

    @Override
    public String toString() {
        return "BurgerExtras{" +
                "addExtraCheese=" + addExtraCheese +
                ", addExtraSauce=" + addExtraSauce +
                ", noOfExtraPatties=" + noOfExtraPatties +
                '}';
    }
}
