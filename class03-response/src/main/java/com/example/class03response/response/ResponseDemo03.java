package com.example.class03response.response;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@WebServlet("/responseType3")
public class ResponseDemo03 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String type = request.getParameter("type");
        switch (type) {
            case "image":
                getImage(request, response);
                break;
            case "pdf":
                getpdf(request,response);
                break;
            case "txt":
                getTxt(request,response);
                break;
            case "html":
                gethtml(request,response);
                break;
            default:
                break;
        }
    }
    private void getImage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("image/jpg");
        String realPath = request.getServletContext().getRealPath("");
        File file =new File(realPath+"/image/1.jpg");
        InputStream in = new FileInputStream(file);
        int read = 0;
        ServletOutputStream out = response.getOutputStream();
        while ((read = in.read()) != -1) {
            out.write(read);
        }
        out.flush();
        out.close();

    }
    private void getTxt(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain");
        String realPath = request.getServletContext().getRealPath("");
        File file =new File(realPath+"/txt1/SN-1.txt");
        InputStream in = new FileInputStream(file);
        int read = 0;
        ServletOutputStream out = response.getOutputStream();
        while ((read = in.read()) != -1) {
            out.write(read);
        }
        out.flush();
        out.close();

    }
    private void getpdf(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/pdf");
        String realPath = request.getServletContext().getRealPath("");
        File file =new File(realPath+"/pdf/2.pdf");
        InputStream in = new FileInputStream(file);
        int read = 0;
        ServletOutputStream out = response.getOutputStream();
        while ((read = in.read()) != -1) {
            out.write(read);
        }
        out.flush();
        out.close();

    }
    private void gethtml(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String realPath = request.getServletContext().getRealPath("");
        File file =new File(realPath+"/html/3.html");
        InputStream in = new FileInputStream(file);
        int read = 0;
        ServletOutputStream out = response.getOutputStream();
        while ((read = in.read()) != -1) {
            out.write(read);
        }
        out.flush();
        out.close();

    }
}