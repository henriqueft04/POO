public class Culture extends Activity {
    private Option option;

    public enum Option {
        ARCHITECTURAL_TOUR, RIVER_TOUR, ART_MUSEUM, WINE_TASTING
    }

    public Culture(Option option, int maxParticipants) {
        super(maxParticipants, 22, Type.CULTURE);
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
        return "CULTURE: " + option + " " + maxParticipants + " " + pricePerParticipant;
    }
}
