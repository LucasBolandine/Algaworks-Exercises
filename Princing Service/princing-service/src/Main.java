import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        PrincingService princingService = new PrincingService();
        Product product = new Product();

        System.out.println("Digite o valor de Compra: R$ ");
        product.purchasePrice = scan.nextDouble();

        System.out.println("Digite o valor da taxa de Compra: (%) ");
        product.salesTax = scan.nextInt();

        princingService.calculateSalePrice(product);

        System.out.printf("Preço total: %.2f%n", product.salePrice);
    }
}
