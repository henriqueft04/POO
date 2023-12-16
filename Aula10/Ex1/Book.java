package Aula10.Ex1;

public class Book {
    
    //privates
    private String title;
    private String author;
    private int year;
    private String genero;

    //constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genero = getGeneros();

    }

    //setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author= author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGeneros(String generos) {
        this.genero = generos;
    }

    //getters

    public String getGeneros() {
        return this.genero;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public String toString() {
        return "\nTitle: " + this.title + "\nAuthor: " + this.author + "\nYear: " + this.year + "\nGenero: " + getGeneros();
    }

}
