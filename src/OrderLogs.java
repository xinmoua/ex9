import java.util.ArrayDeque;
import java.util.Scanner;

public class OrderLogs {
    private ArrayDeque<String> orderLogs;

    public OrderLogs() {
        orderLogs = new ArrayDeque<>();
    }

    public void addOrderLog(String log) {
        orderLogs.push(log);
    }

    private void mostRecentLogEntry() {
        if (!orderLogs.isEmpty()) {
            System.out.println(orderLogs.peek());
        }
    }

    private String getOrderLog() {
        if (!orderLogs.isEmpty()) {
            return orderLogs.pop();
        }
        return null;
    }

    private void removeAllLogEntries() {
        orderLogs.clear();
    }

    private boolean orderLogsEmpty() {
        return orderLogs.isEmpty();
    }

    public void handleLogs() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose what you want to do with order logs:");
            System.out.println("1. Display all the logs");
            System.out.println("2. Display the most recent logs");
            System.out.println("3. Remove a log entry");
            System.out.println("4. Remove all log entries");
            System.out.println("5. Check if the log is completely empty");
            System.out.print("Enter your choice (1 - 5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    displayOrderLogs();
                    break;
                case 2:
                    if (!orderLogsEmpty()) {
                        mostRecentLogEntry();
                    } else {
                        System.out.println("The log is empty.");
                    }
                    break;
                case 3:
                    if (!orderLogsEmpty()) {
                        System.out.println("Removed log: " + getOrderLog());
                    } else {
                        System.out.println("The log is empty.");
                    }
                    break;
                case 4:
                    removeAllLogEntries();
                    System.out.println("All log entries removed.");
                    break;
                case 5:
                    if (orderLogsEmpty()) {
                        System.out.println("The log is completely empty");
                    } else {
                        System.out.println("The log is not completely empty");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void displayOrderLogs() {
        if (!orderLogs.isEmpty()) {
            for (String log : orderLogs) {
                System.out.println(log);
            }
        } else {
            System.out.println("The log is empty.");
        }
    }
}    