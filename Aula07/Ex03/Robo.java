package Aula07.Ex03;

public class Robo extends Movel{

    //definir privates
    private String tipo;
    private String id;
    private int golos;
    private double distancia;
    private int moves;

    //definir construtor
    public Robo(String tipo, int x, int y) {
        super(x, y);
        this.tipo = tipo;
        this.id = Integer.toString(id());
        this.golos = 0;
        this.moves = 0;
        distancia = 0;
        counter ++;

    }

    static int counter = 0;

    static int id(){
        int id = 1;
        id = id + counter;
        return id;

    }


    public void scoreGoal(){
        this.golos++;
    }

    //getters

    public String getTipo() {
        return tipo;
    }

    public String getId() {
        return id;
    }

    public int getMoves() {
        return moves;
    }

    public int getGolos() {
        return golos;
    } 

    public double getDistancia() {
        return distancia;
    }

    public void tipoPos(String tipo){
        if(tipo == "GK"){
            Move(0, 0);
        }
        else if(tipo == "DF"){
            Move(0, 1);
        }
        else if(tipo == "MF"){
            Move(0, 2);
        }
        else if(tipo == "FW"){
            Move(1, 3);
        }
    }

    //setters
    public void setDistancia(int x, int y) {
        Move(x, y);
    }




    public String toString(){
        return "O robô é um: " + tipo + "; ID: " + id + "; Golos: " + golos;
    }



    
}
