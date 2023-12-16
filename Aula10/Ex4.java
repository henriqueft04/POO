package Aula10;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Ex4 {
    
    public static void main(String[] args) throws IOException{ 
        Scanner input = new Scanner(new FileReader("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\POO\\src\\Aula10\\words.txt")); 
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<String> bigBoys = new ArrayList<String>();
        
        
        while(input.hasNext()){
            words.add(input.next());
        }
        for(String word : words){
            if(word.length() > 1){
                bigBoys.add(word);
            }
        }

        ArrayList<String> acabadoS = new ArrayList<String>();
        for(String word : words){
            if(word.charAt(word.length()-1) == ('s')){
                acabadoS.add(word);
            }
        }
        if(acabadoS.size() > 0){
            System.out.println("Palavras acabadas em s: " + acabadoS);
        }
        else{
            System.out.println("Nao há palavras acabadas em s");
        }

        Iterator<String> idk = words.iterator();
        while(idk.hasNext()){
            String word = idk.next();    
            if(!word.matches("[a-zA-Z]+")){
                idk.remove();
            }
        }

        System.out.println("Palavras com apenas letras: " + words);
        
         
        

        input.close();
    }
}
