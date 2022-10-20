package dev.kim.repositories;

import dev.kim.entities.Book;

import java.util.List;

// DAO stands for Data Access Object
// This will allow us to do our CRUD operations ( Create Read Update Delete)

public interface BookDAO {
    // Interfaces are similar to standard classes, but you can not have ANY concrete methods in them

    //Create
    Book createBook(Book book);

    //Read
    Book getBookById(int id);

    List<Book> getAllBooks();

    //Update
    Book updateBook(Book book);
    boolean deleteBookById(int id);

}
