package com.book.service;

import com.book.entity.Book;
import com.book.entity.Borrow;
import com.book.entity.Student;

import java.util.List;
import java.util.Map;

public interface BookService {
    List<Borrow> getBorrowList();
    void returnBook(String id);
    List<Book> getActiveList();
    List<Student> getStudentList();
    void addBorrow(int sid,int bid);
    Map<Book,Boolean> getABookList();
    void deletebook(int bid);
    void addBook(String title,String desc,double price);
}
