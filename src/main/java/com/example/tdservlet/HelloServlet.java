package com.example.tdservlet;

import java.io.*;

import com.example.tdservlet.beans.Compteur;
import com.example.tdservlet.beans.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String text1;
    private String text2;
    private String message;

    @Override
    public void init() {
        message = "Hello World!";
    }



    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");


        text1 = request.getParameter("textget");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + " "+ text1 +" "+ "isGEtted"+"</h1>");
        out.println("</body></html>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        text2 = req.getParameter("textpost");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + " "+ text2 + " "+ "isPOSTED"+"</h1>");
        out.println("</body></html>");



    }

    @Override
    public String getServletInfo() {
        return super.getServletInfo();
    }



    @Override
    public void destroy() {
        message = "La page est détruite";
    }
}