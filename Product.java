/*
 * Product class to use for builder pattern
 */

public class Product {
    private String name;
    private String model;
    private int price;

    public Product(String name, String model, int price){
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public Product() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
