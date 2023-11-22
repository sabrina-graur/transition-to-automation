package mainclass.exercises.library;

public class LibraryCatalogMain {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", "Л. Толстой", 1867);
        Book book2 = new Book("Хранители", "Алан Мур", 1986);
        LibraryCatalog catalog = new LibraryCatalog();
        catalog.addBook(book1);
        catalog.addBook(book2);
        catalog.displayCatalog();
        System.out.println(book1);
        book1.setAuthor("Лермонтов");
        System.out.println(book1);
    }
}
