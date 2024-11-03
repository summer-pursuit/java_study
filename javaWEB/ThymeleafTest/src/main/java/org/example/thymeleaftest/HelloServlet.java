package org.example.thymeleaftest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.thymeleaf.context.Context;

import java.io.*;
import java.util.Arrays;

@WebServlet("/index")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Context context = new Context();
        context.setVariable("title", "我是标题");
        context.setVariable("url", "http://n.sinaimg.cn/sinakd20121/600/w1920h1080/20210727/a700-adf8480ff24057e04527bdfea789e788.jpg");
        context.setVariable("alt", "图片就是加载不出来啊");
        context.setVariable("eval",true);
        context.setVariable("switchh",9);
        context.setVariable("list", Arrays.asList("你好","hhh","hi hi","快乐快乐快乐快乐"));
        ThymeleafUtil.getEngine().process("test.html", context, resp.getWriter());
    }
}