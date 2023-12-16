package Aula10.Ex1;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        
        // Adding books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        biblioteca.addBook("Romance", book1);
        
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        biblioteca.addBook("Drama", book2);
        
        Book book3 = new Book("1984", "George Orwell", 1949);
        biblioteca.addBook("Ficção", book3);
        
        Book book4 = new Book("The Shining", "Stephen King", 1977);
        biblioteca.addBook("Terror", book4);
        
        Book book5 = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
        biblioteca.addBook("Aventura", book5);

        Book book6 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        biblioteca.addBook("Aventura", book6);
        
        System.out.println(biblioteca);
        
        biblioteca.removeBook("The Great Gatsby");
        
        System.out.println(biblioteca);
        
        biblioteca.changeBookAuthor("1984", "Eric Blair");
        
        System.out.println(biblioteca);
        
        biblioteca.changeBookGenero("The Hobbit", "Fantasia");
        
        System.out.println(biblioteca);
    }
}

