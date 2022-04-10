import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 0; i <11; i++) {
            sum += i;
        }
        return(sum);
        }
    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (int i = 0; i<prices.length; i++) {
            total += prices[i];
        }
        return (total);
    }
    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i<menuItems.size(); i++) {
            System.out.printf("%s %s \n", i, menuItems.get(i));
        }
    }
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name: ");
        // String userName = "";
        String userName = System.console().readLine();
        System.out.printf("Hello, %s!", userName);
        System.out.printf("There are %d people in front of you", customers.size());
        customers.add(userName);
    }
    }

