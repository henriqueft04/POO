package Aula04;

import java.util.ArrayList;

    class Product {
        private String name;
        private double price;
        private int quantity;

        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public double getTotalValue() {
            return price * quantity;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int  getQuantity() {
            return quantity;
        }
    }


    class CashRegister {
        ArrayList<Product> lista = new ArrayList<Product>();
        private int quantidadeProdutos = 0;
        String corpo;

        public void addProduct(Product product) {
            lista.add(product);
            quantidadeProdutos ++ ;

        }

        public String toString() {
            String cabeça = String.format("%-15s %10s %12s %9s\n","Product", "Price", "Quantity", "Total");
            String corpo = "";
            for (int i = 0 ; i < quantidadeProdutos; i++ ){
                Product produto = lista.get(i);
                String nome = produto.getName();
                Double preço = produto.getPrice();
                int quantidade = produto.getQuantity();
                double total = produto.getTotalValue();
        
                corpo += String.format("%-15s %10.2f %12d %9.2f\n", nome, preço, quantidade, total);
            }
            return cabeça + corpo;
        }
    }

    public class CashRegisterDemo {

        public static void main(String[] args) {

            // Cria e adiciona 5 produtos
            CashRegister cr = new CashRegister();
            cr.addProduct(new Product("Book", 9.99, 3));
            cr.addProduct(new Product("Pen", 1.99, 10));
            cr.addProduct(new Product("Headphones", 29.99, 2));
            cr.addProduct(new Product("Notebook", 19.99, 5));
            cr.addProduct(new Product("Phone case", 5.99, 1));
            
            // TODO: Listar o conteúdo e valor total
            System.out.println(cr);

        }
    }