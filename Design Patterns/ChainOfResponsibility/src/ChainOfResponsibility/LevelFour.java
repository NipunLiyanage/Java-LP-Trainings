package ChainOfResponsibility;

public class LevelFour extends Handler {

    @Override
    public double applyValue(Product product) {

        product.setTotalValue(product.getTotalValuation()+product.getTotalValuation()*0.4);


        if (product.getValuePoints() == 4){
            System.out.println("This product can be added value up to level 4.");
            System.out.print("Total value if fully upgraded: " );
            return product.getTotalValuation();
        }
        else{
            return successor.applyValue(product);
        }




    }
}
