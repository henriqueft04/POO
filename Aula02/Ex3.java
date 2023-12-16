package Aula02;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args){
        double massa , tInicial , tFinal , Q ;
        Scanner tec = new Scanner(System.in);
        System.out.print("Massa da água: ");
        massa = tec.nextDouble();
        System.out.print("Temperatura inicial: ");
        tInicial = tec.nextDouble();
        System.out.print("Temperatura final: ");
        tFinal = tec.nextDouble();
        Q = massa * (tFinal - tInicial) * 4184;
        System.out.print("A energia necessária para aquecer de " + tInicial +" graus até " + tFinal +" graus é de " + Q + " J");
        tec.close();
    }
    
}
