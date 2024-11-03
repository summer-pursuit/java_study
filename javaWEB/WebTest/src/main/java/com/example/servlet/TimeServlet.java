package com.example.servlet;

import com.example.entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

@WebServlet("/time")
public class TimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        User user =(User)session.getAttribute("user") ;

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String date = dateFormat.format(new Date());
        System.out.println(getServletContext().getAttribute("test"));
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write(date+"欢迎您"+user.getUsername());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        User user=(User) req.getAttribute("user");
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("登陆成功！！");
    }
}
