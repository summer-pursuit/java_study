package org.study.controller;

import jakarta.annotation.Resource;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.study.service.BookService;

@Controller
public class BookController {
    @Resource
    BookService service;
    @GetMapping("/books")
    public String books(Model model){
        User user= (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("nickname",user.getUsername());
        model.addAttribute("book_list",service.getBookList());
        return "books";

    }

    @GetMapping("/add-book")

    public String addBook(Model model){
        User user= (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("nickname",user.getUsername());

        return "addbook";
    }
    @PostMapping("/add-book")
    public String addBook(String title,String desc,double price){
        service.addBook(title,desc,price);
        return "redirect:/books";

    }
    @GetMapping("/delete-book")
    public String deleteBook(int bid){
        service.deleteBook(bid);
        return "redirect:/books";
    }


}
