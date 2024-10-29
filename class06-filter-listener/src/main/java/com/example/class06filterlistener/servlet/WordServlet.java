package com.example.class06filterlistener.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/wordServlet")
public class WordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String word = request.getParameter("words");
        PrintWriter writer = response.getWriter();
        writer.println(word);
        writer.close();
        request.setCharacterEncoding("UTF-8"); // 设置请求字符编码
        response.setContentType("text/html;charset=UTF-8"); // 设置响应字符编码
        String words = request.getParameter("words");
    }

}