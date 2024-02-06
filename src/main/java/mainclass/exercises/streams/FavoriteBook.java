package mainclass.exercises.streams;

public class FavoriteBook {
    private String title;
    private String author;
    private String genre;
    private int year;

    public FavoriteBook(String title, String author, String genre, int year) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %d", title, author, genre, year);
    }

    public int getYear() {
        return year;
    }
}
