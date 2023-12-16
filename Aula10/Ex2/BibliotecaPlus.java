package Aula10.Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.Map;

import Aula10.Ex1.Book;
import Aula10.Ex1.Generos;

public class BibliotecaPlus {

    private TreeMap<String, List<Book>> biblio;

    public BibliotecaPlus() {
        biblio = new TreeMap<>();
        for (Generos g : Generos.values()) {
            biblio.put(g.toString(), new ArrayList<>());
        }
    }

    public void addBook(String genero, Book book) {
        for (Generos g : Generos.values()) {
            if (g.toString().equals(genero)) {
                biblio.get(genero).add(book);
                book.setGeneros(genero);
                System.out.println("Livro adicionado");
                return;
            }
        }
        System.out.println("Genero invalido");
    }

    public void removeBook(String title) {
        for (List<Book> books : biblio.values()) {
            for (Book book : books) {
                if (book.getTitle().equals(title)) {
                    books.remove(book);
                    System.out.println("Livro removido");
                    return;
                }
            }
        }
        System.out.println("Livro nao existente");
    }

    public void changeBookTitle(String title, String newTitle) {
        for (List<Book> books : biblio.values()) {
            for (Book book : books) {
                if (book.getTitle().equals(title)) {
                    book.setTitle(newTitle);
                    System.out.println("Titulo alterado");
                    return;
                }
            }
        }
        System.out.println("Livro nao existente");
    }

    public void changeBookAuthor(String title, String newAuthor) {
        for (List<Book> books : biblio.values()) {
            for (Book book : books) {
                if (book.getTitle().equals(title)) {
                    book.setAuthor(newAuthor);
                    System.out.println("Autor alterado");
                    return;
                }
            }
        }
        System.out.println("Livro nao existente");
    }



    public void changeBookYear(String title, int newYear) {
        for (List<Book> books : biblio.values()) {
            for (Book book : books) {
                if (book.getTitle().equals(title)) {
                    book.setYear(newYear);
                    System.out.println("Ano alterado");
                    return;
                }
            }
        }
        System.out.println("Livro nao existente");
    }

    public void changeBookGenero(String title, String newGenero) {
        for (List<Book> books : biblio.values()) {
            for (Book book : books) {
                if (book.getTitle().equals(title)) {
                    book.setGeneros(newGenero);
                    System.out.println("Genero alterado");
                    return;
                }
            }
        }
        System.out.println("Livro nao existente");
    }

    public Book randomGenreBook(String genre){
        int random = (int) (Math.random() * biblio.get(genre).size());
        return biblio.get(genre).get(random);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<Book>> entry : biblio.entrySet()) {
            String genre = entry.getKey();
            List<Book> books = entry.getValue();
            sb.append(genre).append(": ").append(books).append("\n");
        }
        return sb.toString();
    }
    
    
}

