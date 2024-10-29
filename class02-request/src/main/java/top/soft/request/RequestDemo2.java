package top.soft.request;
import java.io.*;
import java.util.Enumeration;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/requestDemo2")
public class RequestDemo2  extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse res){
        Enumeration<String> headerNames =req.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String name =headerNames.nextElement();
            String value =req.getHeader(name);
            System.out.println(name+":"+value);
        }
        String header =req.getHeader("user-agent");
        if(header.contains("Chrome")){
            System.out.println("Chrome浏览器");
        }
    }

}
