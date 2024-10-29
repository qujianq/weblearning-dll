package com.example.class03response.Practic;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.rmi.server.ServerCloneException;
import java.util.Random;
@WebServlet("/download")
public class DownloadServlet extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String filename = req.getParameter("filename");
        ServletContext context = req.getServletContext();
        String realPath = context.getRealPath("/image/" + filename);
        FileInputStream fis = new FileInputStream(realPath);
        String mimeType = context.getMimeType(filename);
        resp.setContentType(mimeType);
        resp.setHeader("Content-Disposition", "attachment; filename=\"" + filename + "\"");
        ServletOutputStream out = resp.getOutputStream();
        byte[] buffer = new byte[1024*8];
        int len = 0;
        while ((len = fis.read(buffer)) != -1) {
            out.write(buffer, 0, len);
        }
        fis.close();
    }
}
