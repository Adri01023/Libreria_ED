package Tema7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Método para agregar libros con validación
    public boolean addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("El libro no puede ser null");
        }

        // Verificar si el libro ya existe
        for (Book existingBook : books) {
            if (existingBook.getTitle().equalsIgnoreCase(book.getTitle()) &&
                existingBook.getAuthor().equalsIgnoreCase(book.getAuthor())) {
                System.out.println("El libro ya existe en la biblioteca: " + book);
                return false;
            }
        }

        books.add(book);
        System.out.println("Libro agregado exitosamente: " + book);
        return true;
    }

    // Método modificado para listar libros ordenados por título
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("La biblioteca está vacía");
            return;
        }

        // Crear una copia de la lista para ordenarla
        List<Book> sortedBooks = new ArrayList<>(books);
        
        // Ordenar la lista por título
        Collections.sort(sortedBooks, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return book1.getTitle().compareToIgnoreCase(book2.getTitle());
            }
        });

        // Mostrar los libros ordenados
        System.out.println("Lista de libros ordenados por título:");
        for (Book book : sortedBooks) {
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

