package ChainOfResponsibility;

public class FirstLevel extends Handler {


    @Override
    public double applyValue(Product product) {

        product.setTotalValue(product.getTotalValuation()+product.getTotalValuation()*0.1);


        if (product.getValuePoints() == 1){
            System.out.println("This product can be added value up to level 1.");
            System.out.print("Total value if fully upgraded: " );
            return product.getTotalValuation();
        }
        else{
            return successor.applyValue(product);
        }




    }
}
