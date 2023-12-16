package Aula02;

import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args){
        double kilometers, miles ;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira a distancia em Quilómetros: ");
        kilometers = teclado.nextDouble();
        miles = kilometers / 1.609 ;
        System.out.print(kilometers + " Quilómetros" + " equivalem a "+ miles + " milhas");
        teclado.close();

    }
    
}
