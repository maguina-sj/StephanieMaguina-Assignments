import java.util.ArrayList;
public class Order {
    private String name;
    private double total;
    private boolean ready = false;
    private ArrayList<Item> items = new ArrayList<Item>();

    public Order(){
        this.name = "Guest";
    }
    public Order(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public double getTotal() {
        return total;
    }
    public boolean getReady() {
        return ready;
    }
    public ArrayList<Item> getItems() {
        return items;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public void setReady(boolean ready) {
        this.ready = ready;
    }
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    public void addItem(Item item) {
        this.items.add(item);
    }
    public String getStatusMessage() {
        if (this.ready = false){
            return("Your order is not ready");
        }
        else {
            return("Your order is ready!");
        }
        // for (Item i : this.items) {
        //     System.out.println(i.getName());
        // }
        }
    public double getOrderTotal () {
        for (Item i: this.items) {
            this.total += i.getPrice();
        }
        return this.total;
    }
    public void display(){
        System.out.printf("Customer name: %s", this.name);
        for(Item i: this.items) {
            System.out.println(i.getName() + " - $" i.getPrice());
        }
    }
    }

