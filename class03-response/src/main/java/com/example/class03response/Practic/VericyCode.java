package com.example.class03response.Practic;
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

@WebServlet("/vfC")
public class VericyCode extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
int width=160;
int height=45;
        BufferedImage image =new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        Graphics g=image.getGraphics();
        g.setColor(Color.white);
        g.fillRect(0,0,width,height);
        String str = "1234567890qweriophf";
        Random random =new Random();
        for(int i =0;i<=5;i++){
            int index = random.nextInt(str.length());
            char ch =str.charAt(index);
            Color color=new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256));
            g.setColor(color);
            g.drawString(ch+" ",width/5*i,height/3);

        }
        g.setColor(Color.CYAN);
        for(int i = 0;i<10;i++){
            int x1=random.nextInt(width);
            int x2=random.nextInt(width);
            int y1=random.nextInt(height);
            int y2=random.nextInt(height);
        g.drawLine(x1,y1,x2,y2);
        }
        ImageIO.write(image, "jpg", resp.getOutputStream());
    }
}