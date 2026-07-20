import java.util.HashMap;

public class Inventory {
    private HashMap<Integer, Product> inventory;

    public Inventory() {
        inventory = new HashMap<>();
    }

    // Add Product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product Added Successfully!");
    }

    // Update Product
    public void updateProduct(int productId, String name, int quantity, double price) {
        Product product = inventory.get(productId);

        if (product != null) {
            product.setProductName(name);
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Product Updated Successfully!");
        } else {
            System.out.println("Product Not Found!");
        }
    }

    // Delete Product
    public void deleteProduct(int productId) {
        if (inventory.remove(productId) != null) {
            System.out.println("Product Deleted Successfully!");
        } else {
            System.out.println("Product Not Found!");
        }
    }

    // Display Products
    public void displayProducts() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}