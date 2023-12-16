package Aula02;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        
        int s, m, h, r;
        Scanner tec = new Scanner(System.in);
        System.out.print("Insira o tempo em s: ");
        s = tec.nextInt();
        h = s / 3600;
        r = s % 3600;
        m = r / 60;
        s = r % 60;

        System.out.printf("O tempo é: %02d:%02d:%02d", h, m, s);
        tec.close();
    }
}
    
