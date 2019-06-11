import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book;
    Book book2;
    Book book3;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(3);
        book = new Book("Alien", "Mikey", "Sci-fi");
        book2 = new Book("Toy Story", "Woody", "Childrens");
        book3 = new Book("Terminator", "John Connor", "Sci-Fi");
    }

    @Test
    public void aBorrowerStartsWithAnEmptyCollection(){
        assertEquals(0, borrower.getNumberOfBooksInCollection());
    }

    @Test
    public void aBorrowerCanBorrowABook(){
        borrower.getBook(book);
        assertEquals(1, borrower.getNumberOfBooksInCollection());
    }

    @Test
    public void aBorrowerCanRequestABookByTitle(){
        library.addBook(book2);
        library.addBook(book);
        borrower.requestBookByTitle(library, "Alien");
        assertEquals(1, borrower.getNumberOfBooksInCollection());
    }

}
