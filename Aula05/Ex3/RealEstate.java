package Aula05.Ex3;
import java.util.ArrayList;

import Aula05.DateYMD;

public class RealEstate {
    //criar as privates
    private ArrayList<Property> properties;
    private int lastPropertyId;

    public RealEstate() {
        properties = new ArrayList<>();
        lastPropertyId = 1000;
    }

    public void newProperty(String location, int rooms, int price) {
        lastPropertyId++;
        Property property = new Property(lastPropertyId, location, rooms, price);
        properties.add(property);
        System.out.printf("Imovel %d adicionado.%n", lastPropertyId);
    }

    private Property getPropertyById(int propertyId) {
        for (Property property : properties) {
            if (property.getId() == propertyId) {
                return property;
            }
        }
        return null;
    }

    public void sell(int propertyId) {
        Property property = getPropertyById(propertyId);
        if (property == null) {
            System.out.printf("Imovel %d nao existe.%n", propertyId);
        } 
        else if (!property.isAvailable()) {
            System.out.printf("Imovel %d nao está disponível.%n", propertyId);
        } 
        else {
            property.sell();
            System.out.printf("Imovel %d vendido.%n", propertyId);
        }
    }

    public void setAuction(int propertyId, DateYMD startDate, int durationDays) {
        Property property = getPropertyById(propertyId);
        if (property == null) {
            System.out.printf("Imovel %d nao existe.%n", propertyId);
        } 
        else if (!property.isAvailable()) {
            System.out.printf("Imovel %d nao pode ser colocado em leilao.%n", propertyId);
        } 
        else {
            property.setAuction(startDate, durationDays);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Propriedades:\n");
        for (Property property : properties) {
            sb.append(property.toString()).append("\n");
        }
        return sb.toString();
    }
    
    



}
