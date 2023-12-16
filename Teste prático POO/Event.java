import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Event implements IEvent{
    protected List<Client> clients;
    protected LocalDate date;
    protected List<Activity> activities;

    public Event(Client client, LocalDate date) {
        this.clients = new ArrayList<>();
        this.date = date;
        this.activities = new ArrayList<>();
    }

    public List<Client> getClients() {
        return clients;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public Event addActivity(Activity activity) {
        activities.add(activity);
        return this;
    }

    public double totalCost() {
        return activities.stream()
            .mapToDouble(Activity::getCost)
            .sum();
    }

    @Override
    public String toString() {
        return "EVENT: " + date + " " + totalCost()
            + "\n" + activities.stream()
            .map(Activity::toString)
            .reduce("", (a, b) -> a + "\n" + b)
            + "\n" + clients.stream()
            .map(Client::toString)
            .reduce("", (a, b) -> a + "\n" + b)
            + "\n";
    }
}
