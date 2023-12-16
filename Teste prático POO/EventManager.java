import java.time.LocalDate;

public class EventManager {
    private String name;
    private Client[] clients;
    private Event[] events;

    public EventManager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Client[] getClients() {
        return clients;
    }

    public Event[] getEvents() {
        return events;
    }

    //add a new client to the array of clients
    public Client addClient(String name, String location) {
        Client client = new Client(name, location);
        
        // Check if clients array is null
        if (clients == null) {
            clients = new Client[1];
            clients[0] = client;
        } else {
            Client[] newClients = new Client[clients.length + 1];
            for (int i = 0; i < clients.length; i++) {
                newClients[i] = clients[i];
            }
            newClients[clients.length] = client;
            clients = newClients;
        }
        
        return client;
    }


    //add a new event to the array of events
    public Event addEvent(Client client, LocalDate date) {
        Event event = new Event(client, date);
        
        // Check if events array is null
        if (events == null) {
            events = new Event[1];
            events[0] = event;
        } else {
            Event[] newEvents = new Event[events.length + 1];
            for (int i = 0; i < events.length; i++) {
                newEvents[i] = events[i];
            }
            newEvents[events.length] = event;
            events = newEvents;
        }
        
        return event;
    }


    //return the total cost of all events
    public double totalCost() {
        double total = 0;
        for (Event event : events) {
            total += event.totalCost();
        }
        return total;
    }

    public String listClients() {
        String result = "";
        for (Client client : clients) {
            result += client.getName() + " " + client.getLocation() + "\n";
        }
        return result;
    }

    public String listEvents() {
        String result = "";
        for (Event event : events) {
            result += event.toString() + "\n";
        }
        return result;
    }
}
