package ChainOfResponsibility;

public class InitialLevel extends Handler {

    @Override
    public double applyValue(Product product) {

        if (product.getValuePoints() == 0){
            System.out.println("This product is fully value added from the factory");
            return product.getTotalValuation();
        }
        else{
            return successor.applyValue(product);
        }




    }
}
