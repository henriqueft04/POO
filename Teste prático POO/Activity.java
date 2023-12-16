public abstract class Activity {
    protected int maxParticipants;
    protected double pricePerParticipant;
    protected Type type;

    public enum Type {
        SPORT, CATERING, CULTURE
    }

    public Activity(int maxParticipants, double pricePerParticipant, Type type) {
        this.maxParticipants = maxParticipants;
        this.pricePerParticipant = pricePerParticipant;
        this.type = type;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public double getPricePerParticipant() {
        return pricePerParticipant;
    }

    public Type getType() {
        return type;
    }

    public abstract double getCost();
}
