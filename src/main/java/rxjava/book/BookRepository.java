package rxjava.book;

public interface BookRepository {
    Book getByIsbn(String isbn);
}
