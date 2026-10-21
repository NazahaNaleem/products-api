package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it is a type of product that has the common product details such as id, name, and price.
// A ShoppingCart is not a Product because it HAS-A relationship with products by containing them, rather than being a product itself.
public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    public PhysicalProduct(){}

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions){
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}
