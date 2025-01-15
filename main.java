public class main {
    public static void main(String[] args) {
        Builder build = new ProductBuilder();
        Product product = build.setProductName("name")
        .setProductModel("model")
        .setProductPrice(91)
        .build();

        System.out.print(product);


    }
}
