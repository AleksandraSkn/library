package model;

public class Book {

    private static long idCounter = 0L;
    private Long id;
    private String author;
    private String title;
    private String isbn;

    public Book (String author, String title, String isbn){
        this.author=author;
        this.title=title;
        this.isbn= isbn;
        this.id=idCounter++;
    }

    public Long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
