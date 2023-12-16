package Aula12.Ex2;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class ReaderIniciais {

    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do ficheiro (path): ");
        String filename = sc.nextLine();
        sc.close();
        Scanner reader = new Scanner(new FileReader(filename));
        HashMap<Character, TreeMap<String, Integer>> iniciais = new HashMap<>();
        TreeMap<String, Integer> palavras;

        try {
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                String[] split = line.split("\\s+|\\p{Punct}");
                for(String s : split){
                    if (!s.isEmpty()) {
                        char inicial = s.charAt(0);
                        if(!iniciais.containsKey(inicial)){
                            palavras = new TreeMap<>();
                            palavras.put(s, 1);
                            iniciais.put(inicial, palavras);
                        }else{
                            palavras = iniciais.get(inicial);
                            palavras.put(s, palavras.getOrDefault(s, 0) + 1);
                            iniciais.put(inicial, palavras);
                        }
                    }
                }
            }

            for(Map.Entry<Character, TreeMap<String, Integer>> entry : iniciais.entrySet()){
                System.out.print(entry.getKey() + ": ");
                TreeMap<String, Integer> palavrasIniciais = entry.getValue();
                boolean firstWord = true;
                for(Map.Entry<String, Integer> wordEntry : palavrasIniciais.entrySet()){
                    if (!firstWord) {
                        System.out.print("; ");
                    }
                    
                    System.out.print(wordEntry.getKey() + ", " + wordEntry.getValue());
                    firstWord = false;
                }
                System.out.println();
                System.out.println("---------------------------------------------------------------------------------------------");
            }
           
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }   
}
