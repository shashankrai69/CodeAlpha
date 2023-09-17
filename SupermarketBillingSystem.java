import java.util.*;
import java.sql.*;

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private List<Product> items = new ArrayList<>();

    public void addProduct(Product product) {
        items.add(product);
    }

    public List<Product> getItems() {
        return items;
    }

    public double calculateTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }
}

public class SupermarketBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("Supermarket Billing System");
            System.out.println("1. Add Product to Cart");
            System.out.println("2. View Cart");
            System.out.println("3. Checkout");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter product ID: ");
                    int productId = scanner.nextInt();
                    // You can fetch product details from a database based on the ID.
                    // For simplicity, we'll create products manually here.
                    Product product = new Product(productId, "Product" + productId, Math.random() * 100);
                    cart.addProduct(product);
                    break;
                case 2:
                    System.out.println("Cart Contents:");
                    for (Product item : cart.getItems()) {
                        System.out.println(item.getName() + " - $" + item.getPrice());
                    }
                    System.out.println("Total: $" + cart.calculateTotal());
                    break;
                case 3:
                    System.out.println("Checkout Completed.");
                    System.out.println("Total Amount: $" + cart.calculateTotal());
                    System.exit(0);
                case 4:
                    System.out.println("Exiting Supermarket Billing System.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
