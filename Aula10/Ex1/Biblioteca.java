package Aula10.Ex1;
import java.util.HashMap;

public class Biblioteca {
    
    //privates
    private HashMap<String, Book> biblio;
    
    //constructor
    public Biblioteca() {
        this.biblio = new HashMap<>();
    }   
    
    public void addBook(String genero, Book book) {
        for (Generos g : Generos.values()){
            if (g.toString().equals(genero)){
                this.biblio.put(genero, book);
                book.setGeneros(genero);
            }
        }
    }

    public void removeBook(String title) {
        for (String key : biblio.keySet()) {
            Book book = biblio.get(key);
            if (book.getTitle().equals(title)) {
                biblio.remove(key);
                System.out.println("Livro removido");
                return;
            }
        }
        System.out.println("Livro nao existente");
    }
    

    public void changeBookTitle(String title, String newTitle){
        for (Book books : biblio.values()){
            if (books.getTitle().equals(title)){
                books.setTitle(newTitle);
                System.out.println("Titulo alterado");
                return;
            }
            
        }
        System.out.println("Livro nao existente");
    }

    public void changeBookAuthor(String title, String newAuthor){
        for (Book books : biblio.values()){
            if (books.getTitle().equals(title)){
                books.setAuthor(newAuthor);
                System.out.println("Autor alterado");
                return;
            }
            
        }
        System.out.println("Livro nao existente");
    }

    public void changeBookYear(String title, int newYear){
        for (Book books : biblio.values()){
            if (books.getTitle().equals(title)){
                books.setYear(newYear);
                System.out.println("Ano alterado");
                return;
            }
            
        }
        System.out.println("Livro nao existente");
    }

    public void changeBookGenero(String title, String newGenero){
        for (Book books : biblio.values()){
            if (books.getTitle().equals(title)){
                books.setGeneros(newGenero);
                System.out.println("Genero alterado");
                return;
            }
            
        }
        System.out.println("Livro nao existente");
    }

    public String toString(){
        String s = "";
        s += biblio.toString();
        s += "\n";
        for(Generos g : Generos.values()){
            s += g.toString();
            s += "\n";
        }
        for(Book book : biblio.values()){
            s += book.toString();
            s += "\n";
        }
        return s;
    }
}
