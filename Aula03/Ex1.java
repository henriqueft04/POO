package Aula03;

import java.util.Scanner;
import utils.PrimoCheck;


public class Ex1 {

    public static void main(String[] args){
        System.out.print("insira um numero inteiro positivo: ");
        Scanner tec = new Scanner(System.in);
        int number = tec.nextInt();
        while (number < 0 ){
            System.out.print("Número tem de ser positivo, tente outra vez: ");
            number = tec.nextInt();
        }

        int soma = 0;

        
        for ( int i = 2 ; i <= number; i++ ){
            if (PrimoCheck.isPrime(i) == true){
                soma += i;
            }
        }
        
        System.out.println(soma);


        tec.close();
    
    }
    

    
}
