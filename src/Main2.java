public class Main2 {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        for (int i = 0; i < bookShelf.getLength(); i++) {
            Book book = bookShelf.getBookAt(i);
            System.out.println(book.getName());
        }
    }
}
