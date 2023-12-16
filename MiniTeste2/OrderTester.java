package MiniTeste2;
import java.util.ArrayList;
import java.io.FileReader;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.io.FileWriter;



public class OrderTester{
    
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new FileReader("src\\MiniTeste2\\pedidos.txt"));
        OrderManager manager = new OrderManager();

        sc.nextLine();
        while (sc.hasNextLine()) {
            double price = 0;
            boolean isExpress = false;
            String line = sc.nextLine();
            String[] split = line.split("\\;");
            String storeId = split[1];
            String clientId = split[0];
            String composition = split[2];
            String tipo = split[4];
            if(tipo.equals("expresso")){
                isExpress = true;
            }
            String[] dataHoras = split[3].split(" ");
            String[] data = dataHoras[0].split("\\-");
            int year = Integer.parseInt(data[0]);
            int month = Integer.parseInt(data[1]);
            int day = Integer.parseInt(data[2]);
            String hora = dataHoras[1].substring(0,2);
            String minuto = dataHoras[1].substring(3);
            LocalDateTime orderDateTime = LocalDateTime.of(year, month, day, Integer.parseInt(hora), Integer.parseInt(minuto));
            ArrayList<Item> items = new ArrayList<>();
            String[] itemsSplit = composition.split("\\|");
            for (String item : itemsSplit) {
                String[] itemSplit = item.split("\\:");
                String itemName = itemSplit[0];
                price = Double.parseDouble(itemSplit[1]);
                Item newItem = new Item(itemName, price);

                items.add(newItem);

            }
            Order order = new Order(storeId, clientId, orderDateTime, items, isExpress);
            manager.addOrder(order);
            }
            sc.close();


            manager.addOrder(new Order("200", "40", LocalDateTime.of(2020, 12, 12, 12, 12), new ArrayList<Item>(), true));
            manager.removeOrder(2);
            System.out.println(manager.searchOrder(1));
            //calculate price all orders
            double month = 0;
            StandardOrderCostCalculator calculator = new StandardOrderCostCalculator();
            for (Order order2 : manager.getOrders()) {
                double orderCost = calculator.calculateOrderCost(order2);
                    month += orderCost;
            }

            System.out.println("O mes inteiro deu " + month + " euros");
            
            //filewirte the ordermanager
            
            FileWriter output = new FileWriter("src\\MiniTeste2\\output.txt");
            output.write(String.format("ClientID : StoreID : Items : OrderDateTime :Express"));
            output.write(String.format("\n"));
            // Write the formatted string
            for (Order order : manager.getOrders()) {
                output.write(String.format(order.getClientId()+ "; " +  order.getStoreId() + "; "+order.getItems()+", "+ order.getOrderDateTime()+"; " + order.isExpress()));
                output.write(String.format("\n"));
            }

            output.close();



        }

        
        
        

    
    
}
