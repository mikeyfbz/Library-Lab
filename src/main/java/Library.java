import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private int capacity;
    private ArrayList<Book> collection;
    private HashMap<String , Integer> genreHash;

    public Library(int capacity){
        this.capacity = capacity;
        this.collection = new ArrayList<Book>();
        this.genreHash = new HashMap<String, Integer>();
    }

    public int getCollectionNumber() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        if(getCollectionNumber() < this.capacity) {
            this.collection.add(book);
        }
    }

    public void lendBook(Book book) {
        if(getCollectionNumber() > 0){
            int index = this.collection.indexOf(book);
            this.collection.remove(index);
        }
    }

    public String getTitleOfBook(Book book) {
        if(this.collection.contains(book));
        return book.getTitle();
    }

    public Book getBookByTitle(String title) {
        Book foundBook = null;
        for (Book book : this.collection) {
            if(book.getTitle() == title){
                foundBook = book;
            }
        }
        return foundBook;
    }


    public int getNumberOfBooksByGenre(String genre) {
//        this.genreHash = null;
        Integer x = 0;
            for (Book book : this.collection) {
                if(this.genreHash.containsKey(genre)){
                    this.genreHash.put(book.getGenre(), x += 1);
                } else {
                    this.genreHash.put(book.getGenre(), x = 1);
                }
            }
            return this.genreHash.get(genre);
    }
}
