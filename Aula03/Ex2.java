package Aula03;

import java.util.Scanner;


public class Ex2 {

    public static void main(String[] args){
        double montInv , taxaJuros , valorFinal ;
        Scanner tec = new Scanner(System.in);
        System.out.print("Insira o montante investido multiplo de 1000: ");
        montInv = tec.nextDouble();
        while (montInv < 0 || montInv %1000 != 0){
            if (montInv < 0) {
                System.out.print("O montante deve ser positivo, insira o montante: ");
                montInv = tec.nextDouble();
            }
            else if (montInv %1000 != 0) {
                System.out.print("O montante deve multiplo de 1000, insira o montante: ");
                montInv = tec.nextDouble();
            }
            
        }
        System.out.print("Insira a taxa de juro mensal (entre 0% e 5%): ");
        taxaJuros = tec.nextDouble()/100;
        while (taxaJuros< 0 || taxaJuros > 0.05 ){
            if (taxaJuros < 0) {
                System.out.print("A taxa de juros deve ser superior a 0%, insira a taxa novamente: ");
                taxaJuros = tec.nextDouble();
            }
            else if (taxaJuros > 0.05) {
                System.out.print("A taxa de juros deve ser inferior a 5%, insira a taxa novamente: ");
                taxaJuros = tec.nextDouble();
            }
            
        }
        valorFinal = montInv ;
        for (int i = 0; i < 12 ; i++) {
            valorFinal += valorFinal * taxaJuros;
            System.out.println("No mes "+i+" o valor mensal foi de "+valorFinal+ " euros.");

        }
        System.out.print("O valor ao final de 12 meses é de " + valorFinal + " euros");
        tec.close();
    }
    
}
    

