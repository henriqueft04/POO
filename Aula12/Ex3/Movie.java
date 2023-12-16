package Aula12.Ex3;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Map;
import java.io.FileReader;

public class Movie {
    private static TreeMap<String, ArrayList<String>> movies;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("src\\Aula12\\movies.txt"));
        movies = new TreeMap<>();

        try {
            sc.nextLine();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] split = line.split("\\t");
                String nome = split[0];
                ArrayList<String> filmes = new ArrayList<>();
                for (int i = 1; i < split.length; i++) {
                    filmes.add(split[i]);
                }
                movies.put(nome, filmes);
            }

            System.out.println("Filmes por ordem alfabetica: " + "\n");

            for (Map.Entry<String, ArrayList<String>> filme : movies.entrySet()) {
                System.out.println(filme.getKey() + ": " + filme.getValue());
            }

            System.out.println("Filmes por ordem decrescente de Score: " + "\n");
            TreeMap<String, ArrayList<String>> moviesScore = new TreeMap<>(new ComparatorScore(movies));
            moviesScore.putAll(movies);

            for (Map.Entry<String, ArrayList<String>> filme : moviesScore.entrySet()) {
                System.out.println(filme.getKey() + ": " + filme.getValue());
            }

            System.out.println("Filmes por ordem crescente de Running Time: " + "\n");
            TreeMap<String, ArrayList<String>> moviesTime = new TreeMap<>(new ComparatorTime(movies));
            moviesTime.putAll(movies);

            for (Map.Entry<String, ArrayList<String>> filme : moviesTime.entrySet()) {
                System.out.println(filme.getKey() + ": " + filme.getValue());
            }

            TreeMap<String, Integer> genres = new TreeMap<>();

            for (Map.Entry<String, ArrayList<String>> entry : movies.entrySet()) {
                ArrayList<String> movie = entry.getValue();
                String genre = movie.get(2);
                if (genres.containsKey(genre)) {
                    genres.put(genre, genres.get(genre) + 1);
                } else {
                    genres.put(genre, 1);
                }
            }

            System.out.println("Generos: " + "\n");
            System.out.println(genres);

            // Write movies with score > 60 and belonging to user-specified genre to file
            writeSelectedMovies();

        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }

    public static void writeSelectedMovies() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the genre: ");
        String genre = scanner.nextLine();

        try{
            FileWriter writer = new FileWriter("myselection.txt");
            for (String movieName : movies.keySet()) {
                ArrayList<String> movie = movies.get(movieName);
                String movieGenre = movie.get(2); // Assuming index 2 represents the genre
                double movieScore = Double.parseDouble(movie.get(0)); // Assuming index 1 represents the score
            
                if (movieGenre.equalsIgnoreCase(genre) && movieScore > 60) {
                    writer.write(movieName); // Write the movie name (key)
                    writer.write("\n");
                }
            }
            
            writer.close();
            System.out.println("Selected movies written to myselection.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file: " + e.getMessage());
        }
        scanner.close();
        
    }

}
