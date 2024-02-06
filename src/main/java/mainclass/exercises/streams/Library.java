package mainclass.exercises.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Library {
    public static void main(String[] args) {
        List<FavoriteBook> books = new ArrayList<>();
        books.add(new FavoriteBook("Watchmen", "Alan Moore", "graphic novel", 1987));
        books.add(new FavoriteBook("Thinner", "Stephen King", "horror novel", 1984));
        books.add(new FavoriteBook("The Stainless Steel Rat", "Harry Harrison", "comic science fiction novel", 1949));
        System.out.println("The initial list of books: ");
        books.forEach(System.out::println);
        System.out.println("\nThe filtered one: ");
        filterBooksByPublicationYear(books).stream().forEach(System.out::println);
        System.out.println("\nThe average year of publication is: ");
        calculateAveragePublicationYear(books).stream().forEach(System.out::println);
    }

    public static List<FavoriteBook> filterBooksByPublicationYear(List<FavoriteBook> book) {
        return book.stream()
                .filter(b -> b.getYear() > 1950).toList();
    }

    public static OptionalDouble calculateAveragePublicationYear(List<FavoriteBook> book) {
        return book.stream().mapToDouble(FavoriteBook::getYear).average();
    }
}
