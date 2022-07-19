package ChainOfResponsibility;

public class Product {
    private int productId;
    private double totalValuation;
    private int valuePoints;
    private double addedValue;

    public Product(int productId, double totalValuation, int valuePoints){
        this.productId=productId;
        this.totalValuation=totalValuation;
        this. valuePoints=valuePoints;
    }

    protected void setAddedValue(double addedValue){
        this.addedValue=addedValue;
    }

    protected void setTotalValue(double totalValuation){
        this.totalValuation=totalValuation;
    }

    public int getProductId() {
        return productId;
    }

    public double getTotalValuation() {
        return totalValuation;
    }

    public int getValuePoints() {
        return valuePoints;
    }

    public double getAddedValue() {
        return addedValue;
    }
}
