package Aula12.Ex1;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Reader {
    
    public static void main(String[] args) throws FileNotFoundException{
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do ficheiro (path): ");
        String filename = sc.nextLine();
        sc.close();
        Scanner reader = new Scanner(new FileReader(filename));
        ArrayList<String> palavrasDiferentes = new ArrayList<>();
        try {
            int count = 0;
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                String[] split = line.split("\\s+");
                for(String s : split){
                    count++;
                    if(!palavrasDiferentes.contains(s)){
                        palavrasDiferentes.add(s);
                    }
                }

            }
            System.out.println("Número Total de palavras: " + count);
            System.out.println("Número de Diferentes Palavras: " + palavrasDiferentes.size());
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }

}
