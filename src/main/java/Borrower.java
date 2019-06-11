import java.util.ArrayList;

public class Borrower {

    ArrayList<Book> borrowerCollection;

    public Borrower(){
        this.borrowerCollection = new ArrayList<Book>();
    }

    public int getNumberOfBooksInCollection(){
        return this.borrowerCollection.size();
    }


    public void getBook(Book book) {
        this.borrowerCollection.add(book);
    }

    public void requestBookByTitle(Library library, String  title) {
        Book book = library.getBookByTitle(title);
        getBook(book);
    }
}
