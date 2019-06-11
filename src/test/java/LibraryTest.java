import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Book book2;

    @Before
    public void before(){
        library = new Library(4);
        book = new Book("Alien", "Mikey", "Sci-fi");
        book2 = new Book("Bible", "God", "Fiction");
    }

    @Test
    public void libraryCollectionStartsEmpty(){
        assertEquals(0, library.getCollectionNumber());
    }

    @Test
    public void canAddABookToTheLibrary(){
        library.addBook(book);
        assertEquals(1, library.getCollectionNumber());
    }

    @Test
    public void cannotAddBookWhenCapacityIsFull(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book2);
        library.addBook(book);
        assertEquals(4, library.getCollectionNumber());
    }

    @Test
    public void libraryCanLendBookOut(){
        library.addBook(book);
        library.lendBook(book);
        assertEquals(0, library.getCollectionNumber());
    }

    @Test
    public void libraryLendsOutOnlyTheCorrectBook(){
        library.addBook(book);
        library.addBook(book2);
        library.lendBook(book2);
        assertEquals(1, library.getCollectionNumber());
        assertEquals("Alien", library.getTitleOfBook(book));
    }

    @Test
    public void libraryCanGetBookByTitle(){
        library.addBook(book);
        library.addBook(book2);
        assertEquals(book, library.getBookByTitle("Alien"));
    }

    @Test
    public void libraryReturnsFalseAsBookNotInLibrary(){
        library.addBook(book);
        assertEquals(null, library.getBookByTitle("Bible"));
    }

//    @Test
//    public void libraryHasNothingInHashMapToStart(){
//        assertEquals(null, library.getNumberOfBooksByGenre("Sci-fi"));
//    }

    @Test
    public void libraryCanGetHashOfGenres(){
        library.addBook(book2);
        library.addBook(book);
        assertEquals(1, library.getNumberOfBooksByGenre("Sci-fi"));
    }

    @Test
    public void libraryCanReturnNumberOfGenreWithMultipleBooks(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.getNumberOfBooksByGenre("Sci-fi"));
    }

}
