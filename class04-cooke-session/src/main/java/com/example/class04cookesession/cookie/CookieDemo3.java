package com.example.class04cookesession.cookie;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@WebServlet("/cookieDemo3")
public class CookieDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String value = "张三";
        Cookie cookie = new Cookie("username", URLEncoder.encode(value, StandardCharsets.UTF_8));
        resp.addCookie(cookie);
        cookie.setMaxAge(60*60*24*7);
    }
}