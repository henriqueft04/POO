package Aula03;

import java.util.Scanner;
import java.util.Random;

public class Ex3 {
    
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Adivinhe o número entre 1 e 100: ");
        int guess = tec.nextInt();
        int aleatorio = random.nextInt(100) + 1 ;
        int count = 0;
        if (guess == aleatorio){
            System.out.println("Ganda rei, acertaste!");
        }  
        while (guess != aleatorio){
            
            if (guess > aleatorio){
                System.out.println("Demasiado alto! ");
            }
            else if (guess < aleatorio){
                System.out.println("Demasiado baixo! ");
            }
            count += 1;
            System.out.print(count +" tentativas usadas. Pretende continuar? Prima (S)im ");
            String escolha = tec.next();
            if (escolha.equals("S") || escolha.equals("Sim") || escolha.equals("sim") || escolha.equals("s")){
                System.out.print("Manda o numero seguinte: ");
                guess = tec.nextInt();
                if (guess == aleatorio){
                    System.out.println("Finalmente, estava a ver que nao!");
                
                }
            }
            else {
                System.out.println("Desistir é para fracos...");
                break;
            }
        
        }   
            
        System.out.println("Usaste "+ count +" tentativa(s)");

        tec.close();

    }
}
