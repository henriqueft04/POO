package ZTesteAula;

public class ChessPlayer extends Player{
        
        //privates
        private int elo;
        private double points;
        private int gamesPlayed;
        
        //constructor
        public ChessPlayer(String name, String club) {
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
    
        public static int Points() {
            int points = 0;
            return points;
        }

        //random elo(1-100)
        public static int randomElo() {
            int elo = (int) (Math.random() * 100) + 1;
            return elo;
        }

        public  void addPoints(double pointsToAdd) {
            double totalPoints = 0;
            totalPoints += pointsToAdd;
            this.points = totalPoints;
        }

        public void addGamesPlayed(int gamesPlayedToAdd) {
            int totalGamesPlayed = 0;
            totalGamesPlayed += gamesPlayedToAdd;
            this.gamesPlayed = totalGamesPlayed;
        }
        
        public void setPoints(double points) {
            this.points = points;
   
        }

        public void setGamesPlayed(int gamesPlayed) {
            this.gamesPlayed = gamesPlayed;
        }
        
        //toString
        @Override
        public String toString() {
            return "ChessPlayer{" + "name=" + super.getName() + ", id=" + super.getId() + ", club=" + super.getClub() + ", elo=" + elo + ", points=" + points + '}';
        }
    
}
