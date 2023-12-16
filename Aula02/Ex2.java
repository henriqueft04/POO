package Aula02;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args){
        double c , f ;
        Scanner tec = new Scanner(System.in);
        System.out.print("Insira a temperatura em Celsius: ");
        c = tec.nextDouble();
        f = 1.8 * c + 32;
        System.out.println(c + " Graus Celsius sao " + f + " graus Farenheit" );
        tec.close();
    }

    
}
