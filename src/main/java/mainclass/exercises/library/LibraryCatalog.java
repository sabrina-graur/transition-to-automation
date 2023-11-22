package mainclass.exercises.library;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {
    private final List<Book> BOOKS;

    public LibraryCatalog() {
        this.BOOKS = new ArrayList<>();
    }

    public void addBook(Book book) {
        BOOKS.add(book);
    }

    public void displayCatalog() {
        for (Book book : BOOKS) {
            System.out.println(book);
        }
    }
}
