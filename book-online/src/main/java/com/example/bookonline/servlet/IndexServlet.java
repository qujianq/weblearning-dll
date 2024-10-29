package com.example.bookonline.servlet;

import com.example.bookonline.entity.Book;
import com.example.bookonline.service.BookService;
import com.example.bookonline.service.Impl.BookServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/index")
public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BookService bookService = new BookServiceImpl();
        List<Book> books = bookService.getBooks();
        req.setAttribute("bookList",books);
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
//        books.stream().forEach(book -> {
//            System.out.println(book.toString()  );
//        });
    }
}
