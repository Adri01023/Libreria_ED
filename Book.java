import java.util.List;
public class Book {
    private String title;
    private String author;
    private List<Book> books;
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Book findBookByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                return book;
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
        return "Título: " + title + ", Autor: " + author;
    }
}

