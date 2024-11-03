package com.example.servlet;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import lombok.SneakyThrows;
import org.apache.commons.io.IOUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

@WebServlet(value = "/login",loadOnStartup = 1,initParams = {
        @WebInitParam(name="test",value = "我是初始化参数!")
})
public class LogingServlet extends HttpServlet {
    SqlSessionFactory factory;
    @SneakyThrows
    @Override
    public void init() throws ServletException {
        System.out.println(getServletContext().getInitParameter("lbwnb"));
        factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //首先设置一下响应类型
        resp.setContentType("text/html;charset=UTF-8");
        //获取POST请求携带的表单数据
        Map<String, String[]> map = req.getParameterMap();
        //判断表单是否完整
        if(map.containsKey("username") && map.containsKey("password")) {
            String username = req.getParameter("username");
            String password = req.getParameter("password");
            try(SqlSession sqlSession =factory.openSession(true)){
                UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
                User user=userMapper.getUser(username,password);
                if(user != null){
                    Cookie cookie = new Cookie("test", "yyds");
//                    cookie.setMaxAge(20);
                    if(map.containsKey("remember-me")){
                        Cookie cookie_username=new Cookie("username",username);
                        Cookie cookie_password=new Cookie("password",password);
                        cookie_password.setMaxAge(30);
                        resp.addCookie(cookie_username);
                        resp.addCookie(cookie_password);
                    }
                    HttpSession session=req.getSession();
                    session.setAttribute("user",user);
                    resp.sendRedirect("time");
                }else {
                    resp.getWriter().write("登陆失败，请验证您的用户名或密码！");
                }
            }


            //权限校验（待完善）
        }else {
            resp.getWriter().write("错误，您的表单数据不完整！");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("我是servlet");
        Cookie[] cookies=req.getCookies();
        if(cookies!=null){
            String username=null;
            String password=null;
            for(Cookie cookie:cookies){
                if(cookie.getName().equals("username")) username=cookie.getValue();
                if(cookie.getName().equals("password")) password=cookie.getValue();
                if(username!=null&&password!=null){
                    try (SqlSession sqlSession=factory.openSession(true)){
                        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
                        User user=mapper.getUser(username,password);
                        if(user!=null){
                            resp.sendRedirect("time");
                            return;
                        }else{
                            Cookie cookie_username=new Cookie("username",username);
                            cookie_username.setMaxAge(0);
                            Cookie cookie_password=new Cookie("password",password);
                            cookie_password.setMaxAge(0);
                            resp.addCookie(cookie_username);
                            resp.addCookie(cookie_password);
                        }
                    }
                }
            }
        }
        req.getRequestDispatcher("/").forward(req,resp);
    }
}

