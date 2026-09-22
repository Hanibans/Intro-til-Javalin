import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Book> books = BookFactory.generateBooks(100);

        for (Book book : books) {
            System.out.println(
                    book.getTitle() + " - " +
                            book.getAuthor() + " - " +
                            book.getIsbn()
            );
        }
    }
}
