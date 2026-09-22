import java.util.ArrayList;
import java.util.List;

public class BookFactory {

    public static List<Book> generateBooks(int amount) {
        List<Book> books = new ArrayList<>();

        for (int i = 1; i <= amount; i++) {
            String author = "Author " + i;
            String title = "Book " + i;
            String isbn = "978000000" + String.format("%04d", i);

            books.add(new Book(author, title, isbn));
        }

        return books;
    }
}
