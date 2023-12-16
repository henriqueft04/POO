package Aula04.Ex1;
import java.lang.Math;

public class Triangle {
    private double lado1 ;
    private double lado2 ;
    private double lado3 ;

    public Triangle(double lado1, double lado2, double lado3) {
        setLados(lado1, lado2, lado3);
    
        if (!checkTriangle()) {
            System.out.println("Lados do Triangulo invalidos, L ");
            System.exit(1);
        }
    
        area();
        perimetro();
    }
    
    
    public void setLados(double lado1, double lado2, double lado3){
  
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;

    }

    public double area(){

        double s = (lado1 + lado2 + lado3) / 2.0;
        double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        return area;

    }

    public Boolean checkTriangle(){
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1 && lado1 >0 && lado2 >0 && lado3 >0){
            
            return true;
        }
  
        else{return false;}
    }

    public double perimetro(){

        return lado1+ lado2 +lado3;
    }

    public String toString() {
        return "Triângulo de lados de tamanho " + lado1 + ", " + lado2 + ", " + lado3;
    }


    
}
