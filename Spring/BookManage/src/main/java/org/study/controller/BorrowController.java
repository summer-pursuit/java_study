package org.study.controller;

import jakarta.annotation.Resource;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.study.service.BookService;
import org.study.service.UserService;

import javax.imageio.stream.ImageOutputStream;

@Controller
public class BorrowController {
    @Resource
    BookService service;
    @Resource
    UserService userService;
    @GetMapping({"/borrow","/"})
    public String borrow(Model model){
        User user= (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("nickname",user.getUsername());
        model.addAttribute("borrow_list",service.getBorrowList());
        model.addAttribute("book_count",service.getBookList().size());
        model.addAttribute("student_count",userService.getStudentList().size());
        return "borrow";
    }
    @GetMapping("/add-borrow")
    public String addBorrow(Model model){
        User user= (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("nickname",user.getUsername());
        model.addAttribute("book_list",service.getActiveBookList());
        model.addAttribute("student_list",userService.getStudentList());
        return "addborrow";
    }

    @PostMapping("/add-borrow")
    public String addBorrow(int student,int book){
        service.addBorrow(student,book);

        return "redirect:/borrow";
    }

    @GetMapping("/return-book")
    public String returnBook(int id){
        service.returnBook(id);
        return "redirect:/borrow";
    }


}
