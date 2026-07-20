public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Product p1 = new Product(101, "Laptop", 10, 50000);
        Product p2 = new Product(102, "Mouse", 50, 500);
        Product p3 = new Product(103, "Keyboard", 30, 1500);

        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        System.out.println("\nInventory:");
        inventory.displayProducts();

        inventory.updateProduct(102, "Wireless Mouse", 45, 700);

        System.out.println("\nAfter Update:");
        inventory.displayProducts();

        inventory.deleteProduct(103);

        System.out.println("\nAfter Deletion:");
        inventory.displayProducts();
    }
}