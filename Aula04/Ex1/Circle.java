package Aula04.Ex1;
import java.util.Scanner;
import java.lang.Math;

public class Circle {
    Scanner tec = new Scanner(System.in);
    //ver se e preciso ou nao
    private double raio;

    public Circle(double raio){
        if (raio < 0){
            System.out.println("O raio tem de ser positivo Zé ");
        }
        getRaio();
        this.raio = raio;
        area();
        perimetro();

    }

    public double getRaio(){
        if (raio <0){
            System.out.println("O raio tem de ser postivo, bom dia");
        }
        return raio;
    }
    
    public double area(){
        return Math.PI * Math.pow(raio, 2) ;
    }

    public double perimetro(){
        return 2 * Math.PI * raio;
    }

    public String toString() {
        return "Circulo de raio igual a " + raio;
    }

}
