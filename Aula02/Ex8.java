package Aula02;

import java.util.Scanner;
import java.lang.Math;

public class Ex8 {
    public static void main(String[] args){
        int A ,B ;
        Scanner tec = new Scanner(System.in);
        System.out.print("Insira o valor do cateto A: ");
        A = tec.nextInt();
        while (A < 0)  {
            System.out.print("Valor do cateto tem de ser positivo, tenta outra vez: ");
            A = tec.nextInt();
        }

        System.out.print("Insira o valor do cateto B: ");
        B = tec.nextInt();
        while (B < 0)  {
            System.out.print("Valor do cateto tem de ser positivo, tenta outra vez: ");
            B = tec.nextInt();
        }

        double C = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));
        double angulo = Math.acos(A/C);
        double anguloGraus = angulo * 180 / Math.PI;

        System.out.print("O valor da hipotenusa é " + C + " e o angulo entre A e a hipotenusa é " + anguloGraus +" graus ");
        tec.close();

    }
}
