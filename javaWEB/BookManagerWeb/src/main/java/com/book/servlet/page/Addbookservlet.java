package com.book.servlet.page;

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

@WebServlet("/add-book")
public class Addbookservlet extends HttpServlet {
    BookService service;

    @Override
    public void init() throws ServletException {
        service=new BookServicelmpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ThymeleafUtil.process("addbook.html",new Context(),resp.getWriter());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title=req.getParameter("title");
        String desc=req.getParameter("desc");
        double price =Double.parseDouble(req.getParameter("price"));
        service.addBook(title,desc,price);
        resp.sendRedirect("books");
    }
}
