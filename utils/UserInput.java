package utils;

import java.util.Scanner;

public class UserInput {

    public static int readIntRange(int min, int max) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Insira um valor inteiro no range [" + min + "-" + max + "]: ");
        int n = tec.nextInt();
        while(n < min || n > max) {
            if (n < min ){
                System.out.println("Numero abaixo do minimo do range, tente outra vez: ");
                n = tec.nextInt();
                
            }
            else if (n > max ){
                System.out.println("Numero acima do maximo do range, tente outra vez: ");
                n = tec.nextInt();
                
            }      
        }
        tec.close();

        return (n);

    }
    
}
