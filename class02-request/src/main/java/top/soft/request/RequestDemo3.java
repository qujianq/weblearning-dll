package top.soft.request;

import java.io.*;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@WebServlet("/requestDemo3")
public class RequestDemo3 extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException {
        BufferedReader reader = req.getReader();
        String line;
        while((line=reader.readLine())!=null){
            System.out.println(line);
        }
}}
