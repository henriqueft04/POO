package MiniTeste2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OrderManager {

    private static HashMap<String, ArrayList<Order>> orders;

    public OrderManager() {
        orders = new HashMap<>();
    }

    public void addOrder(Order order) {
        if (orders.containsKey(order.getStoreId())) {
            orders.get(order.getStoreId()).add(order);
        } else {
            ArrayList<Order> storeOrders = new ArrayList<>();
            storeOrders.add(order);
            orders.put(order.getStoreId(), storeOrders);
            
        }
    }

    public void removeOrder(int id){
        for(Map.Entry<String, ArrayList<Order>> entry : orders.entrySet()){
            ArrayList<Order> storeOrders = entry.getValue();
            for(Order order : storeOrders){
                if(order.getId() == id){
                    storeOrders.remove(order);
                }
            }
        }
    }

    public Order searchOrder(int id){
        for(Map.Entry<String, ArrayList<Order>> entry : orders.entrySet()){
            ArrayList<Order> storeOrders = entry.getValue();
            for(Order order : storeOrders){
                if(order.getId() == id){
                    return order;
                }
            }
        }
        return null;
    }

    public double calculateOrderCost(int id) {
        for (Map.Entry<String, ArrayList<Order>> entry : orders.entrySet()) {
            ArrayList<Order> storeOrders = entry.getValue();
            for (Order order : storeOrders) {
                if (order.getId() == id) {
                    StandardOrderCostCalculator calculator = new StandardOrderCostCalculator();
                    double orderCost = calculator.calculateOrderCost(order);
                    return orderCost;
                }
            }
        }
        return -1;
    }

    public void printAllOrders() {
        for (Map.Entry<String, ArrayList<Order>> entry : orders.entrySet()) {
            ArrayList<Order> storeOrders = entry.getValue();
            for (Order order : storeOrders) {
                System.out.println(order.toString());
            }
        }
    }

    public ArrayList<Order> getOrders() {
        ArrayList<Order> allOrders = new ArrayList<>();
        for (Map.Entry<String, ArrayList<Order>> entry : orders.entrySet()) {
            ArrayList<Order> storeOrders = entry.getValue();
            for (Order order : storeOrders) {
                allOrders.add(order);
            }
        }
        return allOrders;
    }
    
}