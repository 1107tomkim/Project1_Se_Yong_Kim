package dev.kim.repositories;

import dev.kim.entities.Book;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// With interfaces, you MUST override all methods when implementing one into a non-abstract class
public class BookDAOLocal implements BookDAO {

    //You cannot use primitives in the collection framework
    //This means for Maps, lists, Arrays, and sets, you cannot use ints or long. ONLY objects
    //This is where Wrapper classes come in, Wrapper classes are objects, and are kinda primitives
    //Wrapper classes are primitive-like objects, but they do effectively the same thing
    //How do I Convert to wrapper classes? YOU DON'T! Auto-boxing and Auto-unboxing exist in Java 8, which means, it does it automatically.


    private Map<Integer,Book> bookTable = new HashMap();
    private int idCount = 1;

    @Override
    public Book createBook(Book book) {
        book.setId(idCount);
        idCount++;
        bookTable.put(book.getId(),book);
        System.out.println(bookTable.values());
        return null;
    }

    @Override
    public Book getBookById(int id) {
        return bookTable.get(id);
    }

    @Override
    public List<Book> getAllBooks() {
        return null;
    }

    @Override
    public Book updateBook(Book book) {
        return bookTable.put(book.getId(), book);
    }

    @Override
    public boolean deleteBookById(int id) {
        Book book  =  bookTable.remove(id);
        return false;
    }
}
