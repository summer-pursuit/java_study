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

import javax.xml.stream.events.DTD;
import java.io.IOException;
import java.util.ConcurrentModificationException;

@WebServlet("/add-borrow")
public class AddBorrowServlet extends HttpServlet {
    BookService service;

    @Override
    public void init() throws ServletException {
        service=new BookServicelmpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Context context=new Context();
        context.setVariable("book_list",service.getActiveList());
        System.out.println(service.getStudentList());
        context.setVariable("student_list",service.getStudentList());
        ThymeleafUtil.process("addborrow.html",context,resp.getWriter());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int sid=Integer.parseInt(req.getParameter("student"));
        int bid=Integer.parseInt(req.getParameter("book"));
        System.out.println(sid+"  "+bid);
        service.addBorrow(sid,bid);
        resp.sendRedirect("index");
    }
}
