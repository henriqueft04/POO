package Aula11.Ex3;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class EnergyUsageReport {
    
    //privates
    private List<Customer> customers = new ArrayList<Customer>();

    //constructor
    public EnergyUsageReport() {
        this.customers = new ArrayList<Customer>(){    
        };
    }

    //methods
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(int customer) {
        for(Customer cliente : customers){
            if(cliente.getCustomerId() == customer){
                customers.remove(cliente);
                System.out.println("Cliente removido com sucesso!");
                return;
            }
        }
    }

    public Customer getCustomer(int customer) {
        for(Customer cliente : customers){
            if(cliente.getCustomerId() == customer){
                return cliente;
            }
        }
        return null;
    }

    public void load(String file) throws FileNotFoundException {
        File ficheiro = new File(file);
        Scanner scanner = new Scanner(ficheiro);
        while(scanner.hasNextLine()){
            String linha = scanner.nextLine();
            String[] partes = linha.split("\\|");
            int id = Integer.parseInt(partes[0]);
            List<Double> leituras = new ArrayList<Double>();
            for(int i = 1; i < partes.length; i++){
                leituras.add(Double.parseDouble(partes[i]));
            }
            Customer cliente = new Customer(id, leituras);
            customers.add(cliente);
        }
        scanner.close();
    }

    public double calculateTotalUsage(int customer) {
        double sum = 0;
        for(Customer cliente : customers){
            if(cliente.getCustomerId() == customer){
                List<Double> leituras = cliente.getMeterReadings();
                for(double leitura : leituras){
                    sum += leitura;
                }
            }
        }
        return sum;
    }

    public void generateReport(String filename) {
        try {
            FileWriter writer = new FileWriter(filename);
            for(Customer cliente : customers) {
                writer.write("Customer " + cliente.getCustomerId() + " has a total usage of " + calculateTotalUsage(cliente.getCustomerId()) + " kWh.\n");
            }
            writer.close();
    
            try (Scanner scanner = new Scanner(new File(filename))) {
                while(scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }
            }
        } catch(Exception e) {
            System.out.println("Erro!");
        }
    }
    

}
