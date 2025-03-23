import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class OrderLogs {
    private Deque<String> orderLogs;
    public OrderLogs(){
        orderLogs = new ArrayDeque<>();
    }
    public void addOrderLog(String log){
        orderLogs.push(log);
    }
    private void mostRecentLogEntry(){
        System.out.println(orderLogs.peek());
    }
    private String getOrderLog(){
        return orderLogs.pop();
    }
    private void removeAllLogEntries(){
        orderLogs.clear();
    }
    private boolean orderLogsEmpty(){
        return orderLogs.isEmpty();
    }
    private void  displayOrderLogs(){
        for(String string : orderLogs){
            System.out.println(string);
        }
    }
    public void handleLogs(){
        int a = 0;
        do{
        System.out.println("Choose what you want to do with order logs:\n" + 
                    "1. Display all the logs\n" + 
                    "2. Display the most recent logs\n" + 
                    "3. Remove a log entry\n" + 
                    "4. Remove all log entries\n" + 
                    "5. Check if the log is completely empty\n" +
                    "Enter your choice (1 - 5)");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        input.nextLine();
        if(choice>0 && choice<6){
            switch(choice){
                case 1:
                displayOrderLogs();
                break;
                case 2:
                if(orderLogsEmpty()){
                    System.out.println("The log is completely empty");
                }else{
                    mostRecentLogEntry();
                }
                break;
                case 3:
                if(orderLogsEmpty()){
                    System.out.println("The log is completely empty");
                }else{
                    getOrderLog();
                }
                break;
                case 4:
                removeAllLogEntries();
                break;
                case 5:
                if(orderLogsEmpty()){
                    System.out.println("The log is completely empty");
                }else{
                    System.out.println("The log is not completely empty");
                }
                break;
                default:
                System.out.println("Incorrect choice. Please try again.");
                break;
            }
        }
        System.out.println("Whether to proceed?(Y/N)");
        String string = input.nextLine();
        if(string.equals("y") || string.equals("Y")){
        }else{
            a = 1;
        }
        }while(a == 0);
    }
}
