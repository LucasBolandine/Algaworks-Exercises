public class Main_2 {
    public static void main(String[] args) {
        Product.changePackingCost(20);

        Product product1 = new Product();


        product1.changeCosPrice(100);

        System.out.printf("Total: R$ %.2f%n",Product.calculateTotalPrice(product1));
        Product.showPackingCost();

    }
}
