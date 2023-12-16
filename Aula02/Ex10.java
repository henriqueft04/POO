package Aula02;

import java.util.Scanner;

import java.lang.Math;

public class Ex10 {

    public static void main(String[] args){
        double numero, maximo , minimo, media , total, primeiroNumero;
        Scanner tec = new Scanner(System.in);
        System.out.print("Insira um conjunto de numeros (quando quiser terminar ensire o primeiro numero novamente): ");
        primeiroNumero = tec.nextDouble();
        maximo = primeiroNumero;
        minimo = primeiroNumero;
        total = primeiroNumero;
        int contador = 1;
        while (true){
            numero = tec.nextDouble();
            if (numero == primeiroNumero){
                break;

            }
            else {
                maximo = Math.max(numero, primeiroNumero);
                minimo = Math.min(numero, primeiroNumero);
                total += numero;
                contador ++ ;


            }
        }
        media = total/contador;
        System.out.println("Maximo: " + maximo);
        System.out.println("Minimo: " + minimo);
        System.out.println("Media: " + media);
        System.out.println("Numeros lidos: " + contador);   
        tec.close();
    }

    
}
