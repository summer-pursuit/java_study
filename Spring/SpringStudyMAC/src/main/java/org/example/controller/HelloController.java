package org.example.controller;

import com.alibaba.fastjson2.JSONObject;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.io.IOUtils;
import org.example.entity.Student;
import org.example.entity.User;
import org.example.mapper.HelloMapper;
import org.example.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@Controller
public class HelloController {
    @Autowired
    HelloService service;


    @RequestMapping("/")
    public String hello(@RequestParam int sid,
                        Model model){
        model.addAttribute("student",service.findStudentBySid(sid));
        return "index";
    }




//
//    @GetMapping("/")
//    public String index(){
//        return "index";
//    }
//
//    @ResponseBody
//    @PostMapping(value = "/test", produces = "application/json")
//    public String hello(@RequestBody User user){
//        boolean success = "test".equals(user.getUsername()) && "123456".equals(user.getPassword());
//        JSONObject object = new JSONObject();
//        object.put("success", success);
//        return object.toString();
//    }
//
//    @RequestMapping(value = "/upload",method = RequestMethod.POST)
//    @ResponseBody
//    public String upload(@RequestParam MultipartFile file) throws IOException {
//        File fileObj=new File("test.jpg");
//        file.transferTo(fileObj);
//        System.out.println("用户上传文件已经保存到："+fileObj.getAbsolutePath());
//        return "文件上传成功";
//
//    }
//
//    @RequestMapping(value = "/download", method = RequestMethod.GET)
//    @ResponseBody
//    public void download(HttpServletResponse response){
//        response.setContentType("multipart/form-data");
//        try(OutputStream stream = response.getOutputStream();
//            InputStream inputStream = new FileInputStream("C:\\Users\\29753\\Desktop\\project\\java\\Spring\\DATA\\test.png")){
//            IOUtils.copy(inputStream, stream);
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }

}