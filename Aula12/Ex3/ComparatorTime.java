package Aula12.Ex3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;

public class ComparatorTime implements Comparator<String> {
    private TreeMap<String, ArrayList<String>> movies;

    public ComparatorTime(TreeMap<String, ArrayList<String>> movies) {
        this.movies = movies;
    }

    @Override
    public int compare(String key1, String key2) {
        ArrayList<String> list1 = movies.get(key1);
        ArrayList<String> list2 = movies.get(key2);

        double value1 = Double.parseDouble(list1.get(3));
        double value2 = Double.parseDouble(list2.get(3));

        if (value1 < value2) {
            return -1; // Sort in ascending order
        } else if (value1 > value2) {
            return 1; // Sort in ascending order
        } else {
            return key1.compareTo(key2); // If values are equal, sort by movie name
        }
    }
}
