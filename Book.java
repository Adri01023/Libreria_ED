package Tema7;

import java.util.Objects;

public class Book {
	    private String title;
	    private String author;

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

	    @Override
	    public String toString() {
	        return "Título: " + title + ", Autor: " + author;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        
	        Book book = (Book) obj;
	        return title.equalsIgnoreCase(book.title) && 
	               author.equalsIgnoreCase(book.author);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(title.toLowerCase(), author.toLowerCase());
	    }
}
