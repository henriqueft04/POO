public class Sport extends Activity {
    private Modality modality;

    public enum Modality {
        KAYAK, BIKE
    }

    public Sport(Modality modality, int maxParticipants) {
        super(maxParticipants, 30, Type.SPORT);
        this.modality = modality;
    }

    public Modality getModality() {
        return modality;
    }

    @Override
    public double getCost() {
        return maxParticipants * pricePerParticipant;
    }

    @Override
    public String toString() {
        return "SPORT: " + modality + " " + maxParticipants + " " + pricePerParticipant;
    }
}
