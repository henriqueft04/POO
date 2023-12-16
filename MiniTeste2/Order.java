package MiniTeste2;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order{
   
    private int id;
    private double price;
    private String storeId;
    private String clientId;
    private LocalDateTime orderDateTime;
    private ArrayList<Item> items;
    private boolean isExpress;


    //copnstructor
    public Order(String storeId, String clientId, LocalDateTime orderDateTime, ArrayList<Item> items, boolean isExpress) {
        this.id = idMaker();
        this.storeId = storeId;
        this.clientId = clientId;
        this.orderDateTime = orderDateTime;
        this.items = items;
        this.isExpress = isExpress;
        
    }


    public int idMaker() {
        int id = 0;
        id++;
        return id;
    }

    public boolean isExpress() {
        return isExpress;
    }

    //getters 

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getStoreId() {
        return storeId;
    }

    public String getClientId() {
        return clientId;
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public String tipoString(){
        if(isExpress == true){
            return "express";
        }
        else
            return "normal";
    }

    public String toString(){
        return "Order: " + "|Cliente ID: " + id + "|Store ID: " + storeId + "|Client ID: " + clientId + "|Order Date Time: " + orderDateTime + "|Items: " + items + "|Express: " + tipoString();
    }
}




