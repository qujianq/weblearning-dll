package com.example.class06filterlistener.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/signServlet")
public class SignServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        String username =request.getParameter("username");
        response.setContentType("text/html;charset=utf-8");
        request.getSession().setAttribute("username", username);

        System.out.println(username);
        response.sendRedirect("detail.jsp");
    }
}
