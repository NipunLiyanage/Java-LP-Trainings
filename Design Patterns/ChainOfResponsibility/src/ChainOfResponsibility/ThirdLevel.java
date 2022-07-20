package ChainOfResponsibility;

public class ThirdLevel extends Handler {

    @Override
    public double applyValue(Product product) {

        product.setTotalValue(product.getTotalValuation()+product.getTotalValuation()*0.3);


        if (product.getValuePoints() == 3){
            System.out.println("This product can be added value up to level 3.");
            System.out.print("Total value if fully upgraded: " );
            return product.getTotalValuation();
        }
        else{
            return successor.applyValue(product);
        }




    }
}
