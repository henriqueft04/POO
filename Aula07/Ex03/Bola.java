package Aula07.Ex03;

public class Bola extends Movel{

    //privates
    private String cor;

    //construtor
    public Bola(String cor, int x , int y) {
        super(x, y);
        this.cor = cor;
    }

    //getters
    public String getCor() {
        return cor;
    }

    //setters
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setDistancia(int x, int y) {
        Move(x, y);
    }

    public String toString(){
        return "A bola é " + cor;
    }
    
}
