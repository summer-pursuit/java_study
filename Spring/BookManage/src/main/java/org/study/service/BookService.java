package org.study.service;

import org.study.entity.Book;
import org.study.entity.Borrow;

import java.util.List;
import java.util.Map;

public interface BookService {
    List<Borrow> getBorrowList();
    Map<Book,Boolean> getBookList();
    List<Book> getActiveBookList();
    void addBorrow(int  sid,int bid);
    void returnBook(int id);
    void addBook(String title,String desc,double price);
    void deleteBook(int id);
}
