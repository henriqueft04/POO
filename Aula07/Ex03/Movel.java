package Aula07.Ex03;

public abstract class Movel {
    
    protected int x;
    protected int y;
    protected double distancia;
    protected int moves;

    public Movel(int x, int y) {
        this.x = x;
        this.y = y;
        this.distancia = 0;
    }

    public void Move(int newX, int newY){
        double d = Math.sqrt(Math.pow(y-newY, 2) + Math.pow(x-newX, 2));
        this.distancia += d;
        this.moves++;

    }


}
