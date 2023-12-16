package ZTesteAula;
import java.util.ArrayList;
import java.util.Random;

public class TournamentManager {

    //privates
    private ArrayList<ChessPlayer> chessPlayers;
    private ArrayList<CheckersPlayer> checkersPlayers;

    //constructor
    public TournamentManager() {
        this.chessPlayers = new ArrayList<>();
        this.checkersPlayers = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        if (player instanceof ChessPlayer) {
            for (ChessPlayer chessPlayer : chessPlayers) {
                if (chessPlayer.getName().equals(player.getName())) {
                    System.out.println("Player already exists");
                    return;
                }
            }
            chessPlayers.add((ChessPlayer) player);
        } else if (player instanceof CheckersPlayer) {
            for (CheckersPlayer checkersPlayer : checkersPlayers) {
                if (checkersPlayer.getName().equals(player.getName())) {
                    System.out.println("Player already exists");
                    return;
                }
            }
            checkersPlayers.add((CheckersPlayer) player);
        }
        
    }

    public void searchForPlayers(String name) {
        for (ChessPlayer chessPlayer : chessPlayers) {
            if (chessPlayer.getName().contains(name)) {
                System.out.println(chessPlayer);
            }
        }
        for (CheckersPlayer checkersPlayer : checkersPlayers) {
            if (checkersPlayer.getName().contains(name)) {
                System.out.println(checkersPlayer);
            }
        }
        if (chessPlayers.isEmpty() && checkersPlayers.isEmpty()) {
            System.out.println("No players found");
        }
    }

    public void searchForPlayer(int id){
        for (ChessPlayer chessPlayer : chessPlayers) {
            if (chessPlayer.getId() == id) {
                System.out.println(chessPlayer);
                return;
            }
        }
        for (CheckersPlayer checkersPlayer : checkersPlayers) {
            if (checkersPlayer.getId() == id) {
                System.out.println(checkersPlayer);
                return;
            }
        }
        System.out.println("Player not found");
    }

    public void removePlayer(Player player) {
        if (player instanceof ChessPlayer) {
            for (ChessPlayer chessPlayer : chessPlayers) {
                if (chessPlayer.getId() == player.getId()) {
                    chessPlayers.remove(chessPlayer);
                    return;
                }
            }
        } else if (player instanceof CheckersPlayer) {
            for (CheckersPlayer checkersPlayer : checkersPlayers) {
                if (checkersPlayer.getId() == player.getId()) {
                    checkersPlayers.remove(checkersPlayer);
                    return;
                }
            }
        }
        System.out.println("Player not found");
    }

    public void printTournaments() {
        for (ChessPlayer chessPlayer : chessPlayers) {
            System.out.println(chessPlayer);
        }
        for (CheckersPlayer checkersPlayer : checkersPlayers) {
            System.out.println(checkersPlayer);
        }
    }

    public void nextRound(){
        Random random = new Random();
        System.out.println("Chess tournament next round");
        for (CheckersPlayer checkersPlayer1 : checkersPlayers) {
            for ( CheckersPlayer checkersPlayer2 : checkersPlayers){
                if (checkersPlayer1.getId() != checkersPlayer2.getId() && checkersPlayer1.getGamesPlayed() == checkersPlayer2.getGamesPlayed() ) {
                    int random1 = random.nextInt(2);
                    if (random1 == 0) {
                        checkersPlayer1.addPoints(1);
                        System.out.println(checkersPlayer1.getName() + " won against " + checkersPlayer2.getName());
                    } else {
                        checkersPlayer2.addPoints(1);
                        System.out.println(checkersPlayer2.getName() + " won against " + checkersPlayer1.getName());
                    }
                }
                checkersPlayer1.addGamesPlayed(1);
                checkersPlayer2.addGamesPlayed(1);

                break;
            }
                


        }
        System.out.println("Checkers tournament next round");
        for (ChessPlayer chessPlayer1 : chessPlayers) {
            for ( ChessPlayer chessPlayer2 : chessPlayers){
                if (chessPlayer1.getId() != chessPlayer2.getId()) {
                    int random1 = random.nextInt(2);
                    if (random1 == 0) {
                        chessPlayer1.addPoints(1);
                        System.out.println(chessPlayer1.getName() + " won against " + chessPlayer2.getName());
                    } else {
                        chessPlayer2.addPoints(1);
                        System.out.println(chessPlayer2.getName() + " won against " + chessPlayer1.getName());
                    }
                    }
                    chessPlayer1.addGamesPlayed(1);
                    chessPlayer2.addGamesPlayed(1);
                    break;
                }
                

            }
    
    }

    public void startTournament() {
        Random random = new Random();
        System.out.println("Chess tournament");
        for (ChessPlayer chessPlayer1 : chessPlayers) {
            for ( ChessPlayer chessPlayer2 : chessPlayers){
                chessPlayer1.setPoints(0);
                chessPlayer2.setPoints(0);
                chessPlayer1.setGamesPlayed(0);
                chessPlayer2.setGamesPlayed(0);

                if (chessPlayer1.getId() != chessPlayer2.getId()) {
                    int random1 = random.nextInt(3);
                    if (random1 == 0) {
                        chessPlayer1.addPoints(1);
                        System.out.println(chessPlayer1.getName() + " won against " + chessPlayer2.getName());
                    }
                    else if (random1 == 1) {
                        chessPlayer2.addPoints(1);
                        System.out.println(chessPlayer2.getName() + " won against " + chessPlayer1.getName());
                    }
                    else {
                        System.out.println("Draw");
                        chessPlayer1.addPoints(0.5);
                        chessPlayer2.addPoints(0.5);
                    }
                    chessPlayer1.addGamesPlayed(1);
                    chessPlayer2.addGamesPlayed(1);
                    break;
                }
                

            }
        System.out.println("Checkers tournament");
        for (CheckersPlayer checkersPlayer1 : checkersPlayers) {
            for ( CheckersPlayer checkersPlayer2 : checkersPlayers){
                if (checkersPlayer1.getId() != checkersPlayer2.getId()) {
                    int random1 = random.nextInt(3);
                    if (random1 == 0) {
                        checkersPlayer1.addPoints(1);
                        System.out.println(checkersPlayer1.getName() + " won against " + checkersPlayer2.getName());
                    } 
                    else if (random1 == 1) {
                        checkersPlayer2.addPoints(1);
                        System.out.println(checkersPlayer2.getName() + " won against " + checkersPlayer1.getName());
                    }
                    else {
                        System.out.println("Draw");
                        checkersPlayer1.addPoints(0.5);
                        checkersPlayer2.addPoints(0.5);
                    }
                    

                }
                checkersPlayer1.addGamesPlayed(1);
                checkersPlayer2.addGamesPlayed(1);

                break;
            }
        }
    }





    
}}
