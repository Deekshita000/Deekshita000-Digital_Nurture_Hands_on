public class Main {

    public static void displayOrders(Order[] orders) {

        for (Order order : orders) {
            System.out.println(order);
        }
    }

    public static void main(String[] args) {

        Order[] orders = {
                new Order(101, "Harshitha", 5000),
                new Order(102, "Rahul", 2500),
                new Order(103, "Sneha", 8000),
                new Order(104, "Kiran", 3500),
                new Order(105, "Anjali", 6500)
        };

        System.out.println("Original Orders:");
        displayOrders(orders);


        BubbleSort.sort(orders);

        System.out.println("\nOrders After Bubble Sort:");
        displayOrders(orders);

        Order[] orders2 = {
                new Order(101, "Harshitha", 5000),
                new Order(102, "Rahul", 2500),
                new Order(103, "Sneha", 8000),
                new Order(104, "Kiran", 3500),
                new Order(105, "Anjali", 6500)
        };

        QuickSort.quickSort(orders2, 0, orders2.length - 1);

        System.out.println("\nOrders After Quick Sort:");
        displayOrders(orders2);
    }
}