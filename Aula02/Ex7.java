package Aula02;

import java.util.Scanner;
import java.lang.Math;

public class Ex7 {
    
    public static void main(String[] args){
        int x1,y1,x2,y2 ;
        Scanner tec = new Scanner(System.in);
        System.out.print("x1: ");
        x1 = tec.nextInt();
        System.out.print("y1: ");
        y1 = tec.nextInt();
        System.out.print("x2: ");
        x2 = tec.nextInt();
        System.out.print("y1: ");
        y2 = tec.nextInt();
        double distancia = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
        System.out.print("A distancia ente os dois pontos é: " + distancia);
        tec.close();


    }
}
