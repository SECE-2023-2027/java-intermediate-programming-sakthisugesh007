import java.util.Scanner;

public class Product {
    private String productId;
    private String productName;
    private double price;
    private int stockQuantity;

    public Product(String productId, String productName, double price, int stockQuantity) {
        this.productId = productId;
        this.productName = productName;
        setPrice(price);
        setStockQuantity(stockQuantity);
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price < 0 ? 0.0 : price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity < 0 ? 0 : stockQuantity;
    }

    public void applyDiscount(double percentage) {
        price -= price * (percentage / 100.0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productId = scanner.nextLine();
        String productName = scanner.nextLine();
        double price = scanner.nextDouble();
        int stockQuantity = scanner.nextInt();
        double discountPercentage = scanner.nextDouble();

        Product product = new Product(productId, productName, price, stockQuantity);
        product.applyDiscount(discountPercentage);

        System.out.println(product.getPrice());
        System.out.println(product.getStockQuantity());

        scanner.close();
    }
}