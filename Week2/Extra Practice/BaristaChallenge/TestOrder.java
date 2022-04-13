import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
        // Menu items
        Item item1 = new Item("mocha",3.5);

        Item item2 = new Item("cappuccino",4.25);
        
        Item item3 = new Item("refresher",2.5);

        Item item4 = new Item("americano",3.0);
    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order("Marc");

        Order order2 = new Order("Steph");
        
        Order order3 = new Order("Lima");
    
        // Application Simulations
        // add item1 to order2 item list and increment total
        order2.items.add(item1);
        order2.total += item1.price;
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

    }
    
}
