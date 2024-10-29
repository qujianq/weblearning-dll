package com.example.class03response.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.rmi.server.ServerCloneException;
@WebServlet("/responseDemo01")
public class ResponseDemo01 extends HttpServlet {

    protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
        resp.setStatus(200);
        resp.setHeader("location","/responseDemo02");
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write("你好ResponseDemo01");


    }

}
