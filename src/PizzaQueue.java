import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PizzaQueue {
    private Queue<String> pizzaOrders;

    public PizzaQueue() {
        pizzaOrders = new LinkedList<>();
    }

    public void addOrder(String order) {
        pizzaOrders.add(order);
        System.out.println("Order added: " + order);
    }

    private String getNextOrder() {
        if (!pizzaOrders.isEmpty()) {
            return pizzaOrders.poll();
        }
        return null;
    }

    private String peekNextOrder() {
        if (!pizzaOrders.isEmpty()) {
            return pizzaOrders.peek();
        }
        return null;
    }

    private void clearAllOrders() {
        pizzaOrders.clear();
        System.out.println("All orders cleared.");
    }

    private boolean isQueueEmpty() {
        return pizzaOrders.isEmpty();
    }

    public void manageOrders() {
        System.out.println("Welcome to the Pizza Queue Management System!");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose what you want to do with pizza orders:");
            System.out.println("1. Add a new order");
            System.out.println("2. See the next order");
            System.out.println("3. Process the next order");
            System.out.println("4. Clear all orders");
            System.out.println("5. Check if there are any orders");
            System.out.print("Enter your choice (1 - 5): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the pizza order (including side dish and drinks): ");
                    String order = scanner.nextLine();
                    addOrder(order);
                    break;
                case 2:
                    String nextOrder = peekNextOrder();
                    if (nextOrder != null) {
                        System.out.println("Next order: " + nextOrder);
                    } else {
                        System.out.println("There are no orders.");
                    }
                    break;
                case 3:
                    String processedOrder = getNextOrder();
                    if (processedOrder != null) {
                        System.out.println("Processing order: " + processedOrder);
                    } else {
                        System.out.println("There are no orders to process.");
                    }
                    break;
                case 4:
                    clearAllOrders();
                    break;
                case 5:
                    if (isQueueEmpty()) {
                        System.out.println("There are no orders in the queue.");
                    } else {
                        System.out.println("There are orders in the queue.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}    