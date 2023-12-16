package Aula05.Ex3;
import Aula05.DateYMD;

public class Property { 

    //criar privates
    private String local ;
    private int rooms;
    private int price;
    private int id;
    private boolean availability;
    private DateYMD beginAuction;
    private DateYMD endAuction;  

    //construtor
    public Property(int id, String local, int rooms, int price){
        this.id = id;
        this.rooms = rooms;
        this.price = price;
        this.availability = true;
        this.local = local;
    }

    public int getId() {
        return id;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void sell() {
        availability = false;
    }

    public void setAuction(DateYMD start, int duration) {
        if (availability) {
            beginAuction = start;
            endAuction = start;
            for (int i = 1; i < duration; i++) {
                endAuction.increment();
            }
            availability = false;
            System.out.println("Leilao do imóvel " + id + " marcado para o período de " + start + " a " + endAuction);
        } else {
            System.out.println("Imóvel " + id + " nao está disponível para leilao.");
        }
    }

    public String toString() {
        String status;
        if (availability) {
            status = "disponível: sim";
            if (beginAuction != null) {
                status += String.format("; leilao %s : %s", beginAuction, endAuction);
            }
        } 
        else {
            status = "disponível: nao";
        }
        return String.format("Imóvel: %d; quartos: %d; localidade: %s; preço: %d; %s", id, rooms, local, price, status);
    }
}

