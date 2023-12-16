package Aula02;
import java.util.Scanner;

import utils.UserInput;

public class Ex9 {
    
    public static void main(String[] args){
    Scanner tec = new Scanner(System.in);
    System.out.println("Uma contagem decresente ");
    int N = UserInput.readIntRange(0, 100);
    // int N = tec.nextInt();
    
    for (int i = N ; i >=  0 ; i--){
        System.out.print(i);
        if (i%10 == 0){
            System.out.println();
        }
        else if (i>= 0 ){
            System.out.print(" , " );
        }
    }

    tec.close();

    }

    
    
}
