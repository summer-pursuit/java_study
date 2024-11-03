package org.study.service.impl;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.study.entity.Book;
import org.study.entity.Borrow;
import org.study.mapper.BookMapper;
import org.study.service.BookService;

import java.util.*;
import java.util.stream.BaseStream;
@Service
public class BookServiceImpl implements BookService {
    @Resource
    BookMapper mapper;
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Borrow> getBorrowList() {
        return mapper.getBorrowList();
    }

    @Override
    public Map<Book,Boolean> getBookList() {
        Set<Integer> set=new HashSet<>();
        this.getBorrowList().forEach(borrow -> set.add(borrow.getBid()));
        Map<Book,Boolean> map=new LinkedHashMap<>();
        mapper.getBookList().forEach(book -> map.put(book,set.contains(book.getBid())));

        return map;
    }

    @Override
    public List<Book> getActiveBookList() {
        Set<Integer> set =new HashSet<>();
        this.getBorrowList().forEach(borrow -> set.add(borrow.getBid()));
        return  mapper.getBookList().stream()
                .filter(book->!set.contains(book.getBid()))
                .toList();
    }

    @Override
    public void addBorrow(int sid, int bid) {
        mapper.addBorrow(sid,bid);
    }

    @Override
    public void returnBook(int id) {
        mapper.deleteBorrow(id);
    }

    @Override
    public void addBook(String title, String desc, double price) {
        mapper.addBook(title,desc,price);
    }

    @Override
    public void deleteBook(int bid) {
        mapper.deleteBook(bid);
    }
}
