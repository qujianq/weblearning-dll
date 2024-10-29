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
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.rmi.server.ServerCloneException;
import java.util.Random;
@WebServlet("/sCD4")
public class servletContextDemo4 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        ServletContext servletContext=req.getServletContext();
        String aPath =servletContext.getRealPath("/a.txt");
        System.out.println("a.txt 文件地址"+ aPath);

        String bPath=servletContext.getRealPath("/WEB-INF/b.txt");
        System.out.println("a.txt 文件地址"+ bPath);

        File file =new File(aPath);




    }
}
