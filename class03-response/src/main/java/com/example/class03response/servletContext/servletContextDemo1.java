package com.example.class03response.servletContext;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.rmi.server.ServerCloneException;
import java.util.Random;
@WebServlet("/sCD1")
public class servletContextDemo1 extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        ServletContext servletContext=req.getServletContext();
        String fileName="2.pdf";
        String mimeType =servletContext.getMimeType(fileName);
        System.out.println(mimeType);

    }
}
