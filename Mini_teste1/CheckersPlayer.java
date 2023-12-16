package ZTesteAula;

public class CheckersPlayer extends Player{

    //privates
    private int elo;
    private double points;
    private int gamesPlayed;

    //constructor
    public CheckersPlayer(String name,String club) {
        super(name, club);
        this.elo = randomElo();
        this.points = 0;
        this.gamesPlayed = 0;
        
    }

    //getters
    public int getElo() {
        return elo;
    }

    public double getPoints() {
        return points;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }


    //random elo(1-50)
    public static int randomElo() {
        int elo = (int) (Math.random() * 50) + 1;
        return elo;
    }

    public  void addPoints(double pointsToAdd) {
        int totalPoints = 0;
        totalPoints += pointsToAdd;
        this.points = totalPoints;
    }

    public void addGamesPlayed(int gamesPlayedToAdd) {
        int totalGamesPlayed = 0;
        totalGamesPlayed += gamesPlayedToAdd;
        this.gamesPlayed = totalGamesPlayed;
    }

    public void setPoints(double points){
        this.points = points;
    }

    //toString
    @Override
    public String toString() {
        return "CheckersPlayer{" + "name=" + super.getName() + ", id=" + super.getId() + ", club=" + super.getClub() + ", elo=" + elo + ", points=" + points + '}';
    }
    
}
