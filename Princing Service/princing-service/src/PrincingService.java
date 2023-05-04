public class PrincingService {
    void calculateSalePrice(Product product) {
        double salePrice = MathHelper.calculateAccrualValue(product.purchasePrice, product.salesTax);
        salePrice += Product.packingCost;
        product.salePrice = salePrice;
    }
}
