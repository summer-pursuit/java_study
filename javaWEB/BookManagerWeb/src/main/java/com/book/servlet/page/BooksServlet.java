package com.book.servlet.page;

import com.book.entity.User;
import com.book.service.BookService;
import com.book.service.impl.BookServicelmpl;
import com.book.utils.ThymeleafUtil;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.thymeleaf.context.Context;

import java.io.IOException;

@WebServlet("/books")
public class BooksServlet extends HttpServlet {
    BookService service;

    @Override
    public void init() throws ServletException {
        service=new BookServicelmpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Context context=new Context();
        User user=(User) req.getSession().getAttribute("user");
        context.setVariable("nickname",user.getNickname());
        context.setVariable("books_list",service.getABookList());
        ThymeleafUtil.process("books.html",context,resp.getWriter());
    }
}
