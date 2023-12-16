package ZTesteAula;
import java.util.Scanner;

public class TournamentManagerMain {
    public static void main(String[] args) {
        TournamentManager chessTournament = new TournamentManager();
        TournamentManager checkersTournament = new TournamentManager();
        boolean  tournamentStarted = false;
        Scanner scanner = new Scanner(System.in);
        String choice = "";

        while (!choice.equals("7")) {
            System.out.println("TournamentManager Menu:");
            System.out.println("1. Add player");
            System.out.println("2. Remove player");
            System.out.println("3. Start game");           
            System.out.println("4. New round");
            System.out.println("5. Search player");
            System.out.println("6. Print tournament(s) info");

            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Is the player a chess player or a checkers player?");
                    System.out.println("1. Chess player");
                    System.out.println("2. Checkers player");
                    System.out.print("Enter choice: ");
                    int playerType = scanner.nextInt();

                    switch(playerType) {
                        case 1:
                            System.out.print("Enter player name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter player club: ");
                            String club = scanner.nextLine();
                            ChessPlayer chessPlayer = new ChessPlayer(name,club);
                            chessTournament.addPlayer(chessPlayer);
                            break;
                        case 2:
                            System.out.print("Enter player name: ");
                            name = scanner.nextLine();
                            scanner.nextLine();
                            System.out.print("Enter player club: ");
                            club = scanner.nextLine();
                            CheckersPlayer checkersPlayer = new CheckersPlayer(name, club);
                            checkersTournament.addPlayer(checkersPlayer);
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    


                case "2":
                    System.out.println("Is the player a chess player or a checkers player?");
                    System.out.println("1. Chess player");
                    System.out.println("2. Checkers player");
                    System.out.print("Enter choice: ");
                    playerType = scanner.nextInt();

                    switch(playerType) {
                        case 1:
                            System.out.print("Enter player name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter player club: ");
                            String club = scanner.nextLine();
                            ChessPlayer chessPlayer = new ChessPlayer(name,club);
                            chessTournament.removePlayer(chessPlayer);
                            System.out.println("Player" + chessPlayer.getName() + "removed.");
                            break;
                        case 2:
                            System.out.print("Enter player name: ");
                            name = scanner.nextLine();
                            scanner.nextLine();
                            System.out.print("Enter player club: ");
                            club = scanner.nextLine();
                            CheckersPlayer checkersPlayer = new CheckersPlayer(name, club);
                            checkersTournament.removePlayer(checkersPlayer);
                            System.out.println("Player" + checkersPlayer.getName() + "removed.");
                            break;
                        default:
                            System.out.println("Invalid  choice.");
                    }

                case "3":
                    // iniciar o jogo (se torneio(s) já iniciado(s), nao deve fazer nada)
                    if (!tournamentStarted) {
                        chessTournament.startTournament();
                        checkersTournament.startTournament();
                        tournamentStarted = true;
                    }
                    else {
                        System.out.println("Tournament already started.");
                    }

                case "4":
                    // nova ronda (se torneio(s) terminado(s), nao 
                    // deve fazer nada)
                    if(tournamentStarted) {
                        chessTournament.nextRound();
                        System.out.println("Chess tournament round finished.");
                        checkersTournament.nextRound();
                        System.out.println("Checkers tournament round finished.");

                    }
                    else {
                        System.out.println("Tournament not started yet.");
                    }
                case "5":
                    // procurar jogador
                    System.out.println("Is the player a chess player or a checkers player?");
                    System.out.println("1. Chess player");
                    System.out.println("2. Checkers player");
                    System.out.print("Enter choice: ");
                    playerType = scanner.nextInt();

                    switch(playerType) {
                        case 1:
                            System.out.print("Enter player name: ");
                            String chessName = scanner.nextLine();
                            chessTournament.searchForPlayers(chessName);
                            break;
                        case 2:
                            System.out.print("Enter player name: ");
                            String checkersName = scanner.nextLine();
                            scanner.nextLine();
                            checkersTournament.searchForPlayers(checkersName);
                            break;
                        default:
                            System.out.println("Invalid  choice.");
                    }
                case "6":
                    // imprimir informação dos torneios
                    System.out.println("Chess tournament info:");
                    chessTournament.printTournaments();


                case "7":
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}
