/*
 * Builder pattern concrete class
 */


public class ProductBuilder implements Builder {
    private Product product;

    public void ProductBuilder(){
        this.product = new Product();
    }

    public Builder setProductName(String name){
        product.setName(name);
        return this;
    }

    public Builder setProductModel(String model){
        product.setModel(model);
        return this;
    }

    public Builder setProductPrice(int price){
        product.setPrice(price);
        return this;
    }

    public Product build(){
        return product;
    }

}
