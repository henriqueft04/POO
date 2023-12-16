package Aula07.Ex1;

public abstract class Formas{
    protected String cor;
    
    public Formas(String cor){
        this.cor = cor;

    }

    public abstract double area();
    public abstract double perimetro();
    public abstract String toString();
    
}
