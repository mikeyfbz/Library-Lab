import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("Altered Carbon", "Richard Morgan", "Sci-fi");
    }

    @Test
    public void aBookHasATitle(){
        assertEquals("Altered Carbon", book.getTitle());
    }

    @Test
    public void aBookHasAAuthor(){
        assertEquals("Richard Morgan", book.getAuthor());
    }

    @Test
    public void aBookHasAGenre() {
        assertEquals("Sci-fi", book.getGenre());
    }



}
