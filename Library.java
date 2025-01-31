
package Tema7;

	import java.util.ArrayList;
	import java.util.List;

	import java.util.ArrayList;
	import java.util.List;

	public class Library {
	    private List<Book> books;

	    public Library() {
	        books = new ArrayList<>();
	    }

	    // Método mejorado para agregar libros con validación
	    public boolean addBook(Book book) {
	        // Validar que el libro no sea null
	        if (book == null) {
	            throw new IllegalArgumentException("El libro no puede ser null");
	        }

	        // Verificar si el libro ya existe (comparando título y autor)
	        for (Book existingBook : books) {
	            if (existingBook.getTitle().equalsIgnoreCase(book.getTitle()) &&
	                existingBook.getAuthor().equalsIgnoreCase(book.getAuthor())) {
	                System.out.println("El libro ya existe en la biblioteca: " + book);
	                return false;
	            }
	        }

	        // Si el libro no existe, agregarlo
	        books.add(book);
	        System.out.println("Libro agregado exitosamente: " + book);
	        return true;
	    }

	    // Funcionalidad para listar todos los libros
	    public void listBooks() {
	        System.out.println("Lista de libros:");
	        for (Book book : books) {
	            System.out.println(book);
	        }
	    }

	    // Funcionalidad para buscar un libro por título
	    public Book findBookByTitle(String title) {
	        for (Book book : books) {
	            if (book.getTitle().equalsIgnoreCase(title)) {
	                return book;
	            }
	        }
	        return null;
	    }
	}
	

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Funcionalidad para agregar un libro
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Libro agregado: " + book);
    }

    // Funcionalidad para listar todos los libros
    public void listBooks() {
        System.out.println("Lista de libros:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Funcionalidad para buscar un libro por título
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

}

