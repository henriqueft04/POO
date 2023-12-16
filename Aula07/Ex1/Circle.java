package Aula07.Ex1;
import java.util.Scanner;
import java.lang.Math;

public class Circle extends Formas{
    Scanner tec = new Scanner(System.in);
    //ver se e preciso ou nao
    protected double raio;    

    public Circle(double raio, String cor){
        super(cor);

        getRaio();
        this.raio = raio;
        area();
        perimetro();
        setCor(cor);


    }

    public double getRaio(){
        if (raio <0){
            System.out.println("O raio tem de ser postivo, bom dia");
            System.exit(0);
        }
        return raio;
    }
    
    public double area(){
        return Math.round(Math.PI * Math.pow(raio, 2)) ;
    }

    public String setCor(String cor){
        return cor;
    }

    public String getCor(){
        return cor;
    }

    public double perimetro(){
        return Math.round(2 * Math.PI * raio);
    }

    public String toString() {
        return "Circulo de raio igual a " + raio + ", area " + area() + ", perimetro " + perimetro() + " e cor " + cor;
    }

}
