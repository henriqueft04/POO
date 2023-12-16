public class Catering extends Activity {
    private Option option;

    public enum Option {
        FULL_MENU, DRINKS_AND_SNACKS, LIGHT_BITES
    }

    public Catering(Option option, int maxParticipants) {
        super(maxParticipants, 25, Type.CATERING);
        this.option = option;
    }

    public Option getOption() {
        return option;
    }

    @Override
    public double getCost() {
        return maxParticipants * pricePerParticipant;
    }

    @Override
    public String toString() {
        return "CATERING: " + option + " " + maxParticipants + " " + pricePerParticipant;
    }
}