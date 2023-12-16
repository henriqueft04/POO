package Aula07.Ex03;

public class Main {

    public static void main(String[] args) {
        Bola bola = new Bola("Azul", 5,5);
        System.out.println(bola.toString());
        Equipa e1 = new Equipa("Portugal", "Henrique Teixeira");
        Equipa e2 = new Equipa("Espanha", "Joao Roldao");
        Robo ronaldo = new Robo("FW", 4,4);
        Robo messi = new Robo("FW", 6,6 );
        Robo rui = new Robo("MD", 7,7);
        Robo pancas = new Robo("DF", 3,3);
        Robo gaibes = new Robo("GK", 9,9);
        Robo lixado = new Robo("GK", 1,1);
        e1.addRobo(ronaldo);
        e1.addRobo(pancas);
        e1.addRobo(lixado);
        e2.addRobo(messi);
        e2.addRobo(rui);
        e2.addRobo(gaibes);
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        Jogo jogo = new Jogo(bola, e1, e2, 90);
        ronaldo.Move(5, 5);
        bola.Move(5, 5);
        pancas.Move(8, 8);
        bola.Move(8, 8);
        gaibes.Move(10, 9);
        bola.Move(10, 10);
        e1.marcarGolo(pancas);
        System.out.println(jogo.toString());
        jogo.getScore();
        System.out.println(e1);
        System.out.println(ronaldo.getDistancia());




    }
}
