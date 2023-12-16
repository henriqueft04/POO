package Aula11.Ex1;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Ex1 {

    public static void main(String[] args) throws IOException {

        Scanner file = new Scanner(new FileReader("src\\Aula11\\Ex1\\major.txt"));
        Map<String, Map<String, Integer>> dic = new TreeMap<>();

        while (file.hasNext()) {
            String[] tokens = file.nextLine().split("[ ,.;:!?]+");
            for (int i = 0; i < tokens.length -1; i++) {
                String word = tokens[i].toLowerCase();
                String nextWord = tokens[i + 1].toLowerCase();
                if (word.matches("[a-zA-Z]+") && word.length() >= 3) {
                    if (nextWord.matches("[a-zA-Z]+") && nextWord.length() >= 3) {
                        if (!dic.containsKey(word)) {
                            dic.put(word, new HashMap<>());
                            dic.get(word).put(nextWord, 1);
                        } else if (dic.containsKey(word) && dic.get(word).containsKey(nextWord)) {
                            int count = dic.get(word).get(nextWord) + 1;
                            dic.get(word).put(nextWord, count);
                        } else if (dic.containsKey(word) && !dic.get(word).containsKey(nextWord)) {
                            dic.get(word).put(nextWord, 1);
                        }
                    }
        
                }
            }
        }

        for(Map.Entry<String, Map<String, Integer>> entry : dic.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        

        file.close();
    }

   
}

