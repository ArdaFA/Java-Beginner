package factory;

public class Ware {

    // Attributes
    private String name;
    private double sellingPrice;
    // the cost to produce the product
    private double productionPrice;
    // Number of goods that one person can produce per hour.
    private double productionSpeed;

    // Constructor
    public Ware(String name, double sellingPrice, double productionPrice, double productionSpeed){
        this.name = name;
        this.sellingPrice = sellingPrice;
        this.productionPrice = productionPrice;
        this.productionSpeed = productionSpeed;
    }

    public String getName() {
        return name;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getProductionPrice() {
        return productionPrice;
    }

    public double getProductionSpeed() {
        return productionSpeed;
    }
}
