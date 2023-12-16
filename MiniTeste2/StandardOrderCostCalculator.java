package MiniTeste2;

public class StandardOrderCostCalculator implements OrderCostCalculator{
    
    @Override
    public double calculateOrderCost(Order order) {
        double price = 0;
        for (Item item : order.getItems()) {
            price += item.getPrice();
        }
        if (order.isExpress()) {
            price = price * 1.3;
        }
        return price;
    }
}
