package com.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import org.apache.commons.io.IOUtils;
import org.apache.ibatis.io.Resources;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@WebServlet("/file")
@MultipartConfig
public class FileServlet extends HttpServlet {
@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
    res.setContentType("image/jpg");
    OutputStream outputStream=res.getOutputStream();
    InputStream inputStream= Resources.getResourceAsStream("image.jpg");
    IOUtils.copy(inputStream,outputStream);
}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try(FileOutputStream stream = new FileOutputStream("C:\\Users\\29753\\Desktop\\project\\java\\WebTest\\src\\main\\webapp\\image2.png")){
            Part part = req.getPart("test-file");
            IOUtils.copy(part.getInputStream(), stream);
            resp.setContentType("text/html;charset=UTF-8");
            resp.getWriter().write("文件上传成功！");
        }
    }
}
