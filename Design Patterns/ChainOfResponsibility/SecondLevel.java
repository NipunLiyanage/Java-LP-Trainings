package ChainOfResponsibility;

public class SecondLevel extends Handler {

    @Override
    public double applyValue(Product product) {

        product.setTotalValue(product.getTotalValuation()+product.getTotalValuation()*0.2);


        if (product.getValuePoints() == 2){
            System.out.println("This product can be added value up to level 2.");
            System.out.print("Total value if fully upgraded: " );
            return product.getTotalValuation();
        }
        else{
            return successor.applyValue(product);
        }




    }
}
