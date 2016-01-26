package ru.dvortsov.springlibrary.dao.interfaces;


import ru.dvortsov.springlibrary.entities.Author;
import ru.dvortsov.springlibrary.entities.Book;
import ru.dvortsov.springlibrary.entities.Genre;

import java.util.List;


public interface BookDAO {

    List<Book> getBooks();
    List<Book> getBooks(Author author);
    List<Book> getBooks(String bookName);
    List<Book> getBooks(Genre genre);
    List<Book> getBooks(Character letter);
    Object getFieldValue(Long id, String fieldName);

}
