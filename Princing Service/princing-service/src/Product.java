public class Product {
    double salesTax;
    double salePrice;
    double purchasePrice;

    static double packingCost;

    void changeCosPrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    static double calculateTotalPrice(Product product) {
        return product.purchasePrice + Product.packingCost;
    }

    static void changePackingCost(double packingCost) {
        Product.packingCost = packingCost;
    }

    static void showPackingCost() {
        System.out.printf("Custo da embalagem: %.2f%n", Product.packingCost);
    }
}
