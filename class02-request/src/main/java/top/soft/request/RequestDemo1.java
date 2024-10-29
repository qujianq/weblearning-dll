package top.soft.request;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/requestDemo1")
public class RequestDemo1 extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse res){
        String method = req.getMethod();
        System.out.println("请求方式"+method);

        String servletPath = req.getServletPath();
        System.out.println("获取Servlet路径"+servletPath);

        String queryString = req.getQueryString();
        System.out.println("Get请求参数"+queryString);

        String requestURI = req.getRequestURI();
        System.out.println("请求url"+requestURI);
        StringBuffer requestURL =req.getRequestURL();
        System.out.println("请求URL"+requestURL);

        String protocol =req.getProtocol();
        System.out.println("获取版本协议"+protocol);

        String contextPath = req.getContextPath();
        System.out.println("虚拟目录"+contextPath);
    }
}
