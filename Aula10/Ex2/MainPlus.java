package Aula10.Ex2;

import Aula10.Ex1.Book;
import Aula10.Ex1.Generos;

public class MainPlus {

    public static void main(String[] args) {

        BibliotecaPlus biblioteca = new BibliotecaPlus();

        biblioteca.addBook(Generos.Drama.toString(), new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        biblioteca.addBook(Generos.Romance.toString(), new Book("Pride and Prejudice", "Jane Austen", 1813));
        biblioteca.addBook(Generos.Ficção.toString(), new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 1979));
        biblioteca.addBook(Generos.Terror.toString(), new Book("The Shining", "Stephen King", 1977));
        biblioteca.addBook(Generos.Aventura.toString(), new Book("The Hobbit", "J.R.R. Tolkien", 1937));
        biblioteca.addBook(Generos.Romance.toString(), new Book("Jane Eyre", "Charlotte Bronte", 1847));
        biblioteca.addBook(Generos.Drama.toString(), new Book("To Kill a Mockingbird", "Harper Lee", 1960));

        System.out.println(biblioteca);

        biblioteca.removeBook("The Shining");

        biblioteca.changeBookTitle("The Great Gatsby", "The Great Gatsby - Special Edition");

        biblioteca.changeBookAuthor("The Hobbit", "J.R.R. Tolkien (edited by Christopher Tolkien)");

        biblioteca.changeBookYear("Pride and Prejudice", 1811);

        biblioteca.changeBookGenero("Jane Eyre", Generos.Drama.toString());

        System.out.println(biblioteca);
        System.out.println("Random livro");
        System.out.println(biblioteca.randomGenreBook(Generos.Drama.toString()));

    }

}
