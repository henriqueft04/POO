package Aula10;
import java.util.HashMap;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> letras = new HashMap<>();
        System.out.print("Escreve uma frase: ");
        String frase = sc.nextLine();

        for(char c : frase.toCharArray()){
            if(!letras.containsKey(c)){
                letras.put(c,1);
            }
            else{
                letras.put(c, letras.get(c)+1);
            }
        }
        System.out.println(letras);

        sc.close();

    }
    
}
