package Aula02;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args){
        double montInv , taxaJuros , valorFinal ;
        Scanner tec = new Scanner(System.in);
        System.out.print("Insira o montante investido: ");
        montInv = tec.nextDouble();
        System.out.print("Insira a taxa de juro mensal: ");
        taxaJuros = tec.nextDouble()/100;
        valorFinal = montInv ;
        for (int i = 0; i < 3 ; i++) {
            valorFinal += valorFinal * taxaJuros;

        }
        System.out.print("O valor ao final de 3 meses é de " + valorFinal + " euros");
        tec.close();
    }
    
}
