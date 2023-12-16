package Aula12.Ex3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;

public class ComparatorScore implements Comparator<String> {
    private TreeMap<String, ArrayList<String>> movies;

    public ComparatorScore(TreeMap<String, ArrayList<String>> movies) {
        this.movies = movies;
    }

    @Override
    public int compare(String key1, String key2) {
        ArrayList<String> list1 = movies.get(key1);
        ArrayList<String> list2 = movies.get(key2);

        String scoreStr1 = list1.get(0);
        String scoreStr2 = list2.get(0);

        boolean isScore1Numeric = scoreStr1.matches("-?\\d+(\\.\\d+)?");
        boolean isScore2Numeric = scoreStr2.matches("-?\\d+(\\.\\d+)?");

        if (isScore1Numeric && isScore2Numeric) {
            double score1 = Double.parseDouble(scoreStr1);
            double score2 = Double.parseDouble(scoreStr2);

            if (score1 < score2) {
                return 1; 
            } else if (score1 > score2) {
                return -1; 
            } else {
                return key1.compareTo(key2); 
            }
        } else if (!isScore1Numeric && !isScore2Numeric) {
            return key1.compareTo(key2); 
        } else {
            
            return isScore1Numeric ? -1 : 1;
        }
    }
}
