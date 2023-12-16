package Aula02;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args){
        double v1, d1, v2, d2, vMedia;
        Scanner tec = new Scanner(System.in);
        System.out.print("Insira a velocidade do primeiro trajeto: ");
        v1 = tec.nextDouble();
        while (v1 < 0)  {
            System.out.print("Velocidade tem de ser positiva, tenta outra vez: ");
            v1 = tec.nextDouble();
        }

        System.out.print("Insira a distancia do primeiro trajeto: ");
        d1 = tec.nextDouble();
        while (d1 < 0)  {
            System.out.print("Distancia tem de ser positiva, tenta outra vez: ");
            d1 = tec.nextDouble();
        }
        System.out.print("Insira a velocidade do segundo trajeto: ");
        v2 = tec.nextDouble();
        while (v2 < 0)  {
            System.out.print("Velocidade tem de ser positiva, tenta outra vez: ");
            v2 = tec.nextDouble();
        }
        System.out.print("Insira a distancia do segundo trajeto: ");
        d2 = tec.nextDouble();
        while (d2 < 0)  {
            System.out.print("Distancia tem de ser positiva, tenta outra vez: ");
            d2 = tec.nextDouble();
        }
        
        vMedia = (d1+d2)/((d1/v1)+(d2/v2));

        System.out.print("O velocidade média foi " + vMedia );
        tec.close();

    }
    
}
