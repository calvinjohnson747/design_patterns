/*
 * Implementation of the Builder design pattern
 * This is the interface to create a builder concreate class
 */
public interface Builder{
    Builder setProductName(String name);
    Builder setProductModel(String model);
    Builder setProductPrice(int price);
    Product build();
}

